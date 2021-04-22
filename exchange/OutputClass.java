package exchange;

// 출력하는 클라스
public class OutputClass {
	public void printWon(double cw, int returnWon, int won10000, int won5000, int won1000, int won500, int won100, int won10) {
		System.out.printf("\n*원화 거스름돈 : %.2f 원\n",cw);
		System.out.println("*원화 거스름 돈 지급 : " + returnWon + "원\n");
		System.out.println("10000원 : " + won10000 + "장");
		System.out.println("5000원 : " + won5000 + "장");
		System.out.println("1000원 : " + won1000 + " 장 ");
		System.out.println("500원 : " + won500 + " 개 ");
		System.out.println("100원 : " + won100 + "개");
		System.out.println("10원 : " + won10  + "개");
	}
	
	public void printUsd(int usd, double exchangeResult, int usd100, int usd50, int usd20, int usd10, int usd5, int usd2, int usd1) {
		System.out.printf("\n*달러로 환전 결과 : %.2f 달러 \n", exchangeResult);
		System.out.println("*달러 지급 : " + usd + " 달러\n");
		
		System.out.println("100달러 : " + usd100 + " 장");
		System.out.println("50달러 : " + usd50 + " 장");
		System.out.println("20달러 : " + usd20 + " 장");
		System.out.println("10달러 : " + usd10 + " 장");
		System.out.println("5달러 : " + usd5 + " 장");
		System.out.println("2달러 : " + usd2 + " 장");
		System.out.println("1달러 : " + usd1 + " 장");
	}
	
	public void printEur(int eur, double exchangeResult, int eur500, int eur200, int eur100, int eur50, int eur20, int eur10, int eur5, int eur2, int eur1) {
		System.out.printf("\n*유로로 환전 결과 : %.2f 유로 \n", exchangeResult);
		System.out.println("*유로 지급 : "+ eur + " 유로\n");
		
		System.out.println("500유로 : " + eur500 + " 유로 ");
		System.out.println("200유로 : " + eur200 + " 유로 ");
		System.out.println("100유로 : " + eur100 + " 유로 ");
		System.out.println("50유로 : " + eur50 + " 유로 ");
		System.out.println("20유로 : " + eur20 + " 유로 ");
		System.out.println("10유로 : " + eur10 + " 유로 ");
		System.out.println("5유로 : " + eur5 + " 유로 ");
		System.out.println("2유로 : " + eur2 + " 유로 ");
		System.out.println("1유로 : " + eur1 + " 유로 ");
	}
	
	public void printJpy(int jpy, double exchangeResult, int jpy10000, int jpy5000, int jpy2000, int jpy1000) {
		System.out.printf("\n*엔화로 환전 결과 : %.2f 엔화\n", exchangeResult);
		System.out.println("*엔화 지급 : "+ jpy + " 엔화\n");
		
		System.out.println("10000엔 : " + jpy10000 + " 장 ");
		System.out.println("5000엔 : " + jpy5000 + " 장 ");
		System.out.println("2000엔 : " + jpy2000 + " 장 ");
		System.out.println("1000엔 : " + jpy1000 + " 장 ");
	}
}
