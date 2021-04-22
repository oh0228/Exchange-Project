package exchange;

import java.io.IOException;

public class ExchangeMainClass {
	public static void main(String[] args) throws IOException {
//		double won; //받은 원화		
//		double cw = 0; //원화 거스름돈 소수점까지
//		int type = 0;
//		String exchange_type;
//		int returnWon;
		
		ExchangeType exType;
		
		ProcessingClass pc = new ProcessingClass();
		InputFromConsoleClass inputConsole = new InputFromConsoleClass();
		FileWriteClass fwc = new FileWriteClass();
		
		fwc.headerWrite();
		
		do {
			exType = new ExchangeType();
			exType.won = inputConsole.inputWon();
			exType.type = inputConsole.inputType();

			if(exType.type == ConstValueClass.EX_TYPE_USD) {
				exType.cw = pc.wonToUsd(exType.won);
				exType.exchange_type = "USD";
			} else if (exType.type == ConstValueClass.EX_TYPE_EUR) {
				exType.cw = pc.wonToEur(exType.won);
				exType.exchange_type = "EUR";
			} else if (exType.type == ConstValueClass.EX_TYPE_JPY) {
				exType.cw = pc.wonToJpy(exType.won);
				exType.exchange_type = "JPY";
			} else {
				System.out.println("종료!");
				break;
			}
			exType.returnWon = pc.returnWon(exType.cw);
			
			fwc.dataWrite(exType);
		} while (exType.type != ConstValueClass.EX_QUIT);
		fwc.fileClose();
	}
}