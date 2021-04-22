package exchange;

import java.io.IOException;

public class ExchangeMainClass {
	// 메인 클라스
	public static void main(String[] args) throws IOException {
		
		ExchangeType exType;
		
		ProcessingClass pc = new ProcessingClass();
		InputFromConsoleClass inputConsole = new InputFromConsoleClass();
		FileWriteClass fwc = new FileWriteClass();
		
		fwc.headerWrite(); // 헤더추가
		
		do {
			exType = inputConsole.inputAll(); // exType에 inputAll()메소드 반환값 저장

			if(exType.type == ConstValueClass.EX_TYPE_USD) { // type:1일때(USD)
				exType.cw = pc.wonToUsd(exType.won);
				exType.exchange_type = "USD";
				int USD = (int) (exType.won / ConstValueClass.USD_RATE);
				exType.exchangeResult = USD;
			} else if (exType.type == ConstValueClass.EX_TYPE_EUR) { // type:2일때(EUR)
				exType.cw = pc.wonToEur(exType.won);
				exType.exchange_type = "EUR";
				int EUR = (int) (exType.won / ConstValueClass.EUR_RATE);
				exType.exchangeResult = EUR;
			} else if (exType.type == ConstValueClass.EX_TYPE_JPY) { // type:3일때(JPY)
				exType.cw = pc.wonToJpy(exType.won);
				exType.exchange_type = "JPY";
				int JPY = (int) (exType.won / ConstValueClass.JPY_RATE) / 1000 * 1000; // 엔화는 1000엔 이하 버림
				exType.exchangeResult = JPY;
			} else {
				System.out.println("종료!");
				break;
			}
			exType.returnWon = pc.returnWon(exType.cw); 
			 
			fwc.dataWrite(exType); // 파일write메소드
		} while (exType.type != ConstValueClass.EX_QUIT);
		fwc.fileClose();
	}
}