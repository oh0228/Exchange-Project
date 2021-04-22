package exchange;

import java.util.Scanner;

// 입력 받는 클라스
public class InputFromConsoleClass {
	Scanner sc = null;
	InputFromConsoleClass() {
		sc = new Scanner(System.in);
	}
	
	public ExchangeType inputAll() {
		ExchangeType exType = new ExchangeType();
		exType.won = inputWon();
		exType.type = inputType();
		return exType;
	}
	
	protected void finalize() {
		sc.close(); // 스캐너 닫기
	}
	
	public double inputWon() { // 원화 입력 -> double형 반환 메소드
		double won;
		System.out.printf("\n*받은 원화 입력 : ");
		won = sc.nextInt();
		return won; // 입력한 원화 반환
		
	}
	public int inputType() { // 환전 종류 선택 반환 메소드
		int type;
		System.out.print("환전할 종류 선택 (0:종료, 1:USD, 2:EUR, 3:JPY) : ");
		type = sc.nextInt();
		return type; // 입력한 번호(환전종류) 반환
	}
}
