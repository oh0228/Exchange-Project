package exchange;

// 계산하는 클라스
public class ProcessingClass {
	OutputClass outClass = null;
	
	ProcessingClass() {
		outClass = new OutputClass();
	}
	
	public static double won, exchangeResult, cw; // 받은 원화, 환전 결과(실수), 거스름돈(원화)
	
	public int returnWon(double cw) {
		int cwResult;
		cwResult = (int)cw; // 거스름돈 소수점 버림
		int won10000, won5000, returnWon;
		int won1000, won500, won100, won10;
		
		returnWon = (int)(cw / 10)*10; // 거스름돈 원단위 버림
		won10000 = cwResult / 10000; // 10000으로 나눈 몫 (10000원 지폐 장수)
		won5000 = cwResult / 5000; // 5000으로 나눈 몫 (5000원 지폐 장수)
		won1000 = cwResult / 1000; // 1000으로 나눈 몫 (1000원 지폐 장수)
		won500 = cwResult % 1000 / 500; // 1000으로 나눈 나머지를 500으로 나눈 몫 (500원 동전 갯수)
		won100 = cwResult % 500 / 100; // 500으로 나눈 나머지를 100으로 나눈 몫 (100원 동전 갯수)
		won10 = cwResult % 100 / 10; // 100으로 나눈 나머지를 10으로 나눈 몫 (10원 동전 갯수)

		outClass.printWon(cw, returnWon, won10000, won5000, won1000, won500, won100, won10);
		return returnWon;
	}
	
	public double wonToUsd(double won) {
		int usd, usdCurrent; // usd : 환전한 달러(정수)
		int usd100, usd50, usd20, usd10, usd5, usd2, usd1;
		
		exchangeResult = won / ConstValueClass.USD_RATE; // 환율 결과
		usd = (int)exchangeResult; // 소수점 버림
		
		// 달러 지폐 몇장씩 ?
		usdCurrent = usd;
		usd100 = usdCurrent / 100; // usd100 장수
		usdCurrent -= 100 * usd100;
		usd50 = usdCurrent / 50; // usd50 장수
		usdCurrent -= 50 * usd50;
		usd20 = usdCurrent / 20; // usd20 장수
		usdCurrent -= 20 * usd20;
		usd10 = usdCurrent / 10; // usd10 장수
		usdCurrent -= 10 * usd10;
		usd5 = usdCurrent / 5; // usd5 장수
		usdCurrent -= 5 * usd5;
		usd2 = usdCurrent / 2; // usd2 장수
		usdCurrent -= 2 * usd2;
		usd1 = usdCurrent; // usd1 장수
		
		outClass.printUsd(usd, exchangeResult, usd100, usd50, usd20, usd10, usd5, usd2, usd1);
		
		cw = won - usd * ConstValueClass.USD_RATE; // 거스름돈(원화)
		return cw;
	}
	
	public double wonToEur(double won) {
		int eur, eurCurrent; // eur : 환전한 유로(정수)
		int eur500, eur200, eur100, eur50, eur20, eur10, eur5, eur2, eur1;
		
		exchangeResult = won / ConstValueClass.EUR_RATE; // 환율 결과
		eur = (int)exchangeResult; // 소수점 버림
		
		// 유로 지폐 몇장씩?
		eurCurrent = eur;
		eur500 = eurCurrent/500; // eur500 장수
		eurCurrent -= 500 * eur500;
		eur200 = eurCurrent/200; // eur200 장수
		eurCurrent -= 200 * eur200;
		eur100 = eurCurrent/100; // eur100 장수
		eurCurrent -= 100 * eur100;
		eur50 = eurCurrent/50; // eur50 장수
		eurCurrent -= 50 * eur50;
		eur20 = eurCurrent/20; // eur20 장수
		eurCurrent -= 20 * eur20;
		eur10 = eurCurrent/10; // eur10 장수
		eurCurrent -= 10 * eur10;
		eur5 = eurCurrent/5; // eur5 장수
		eurCurrent -= 5 * eur5;
		eur2 = eurCurrent/2; // eur2 장수
		eurCurrent -= 2 * eur2;
		eur1 = eurCurrent/1; // eur1 장수
		
		outClass.printEur(eur, exchangeResult, eur500, eur200, eur100, eur50, eur20, eur10, eur5, eur2, eur1);
		
		cw = won - eur * ConstValueClass.EUR_RATE; // 거스름돈(원화)
		return cw;
	}
	
	public double wonToJpy(double won) {
		int jpy, jpyCurrent; // jpy : 환전한 엔화(정수)
		int jpy10000, jpy5000, jpy2000, jpy1000;
		
		exchangeResult = won / ConstValueClass.JPY_RATE; // 환율 결과
		
		jpy = (int)exchangeResult/1000*1000;	//1000엔 이하 버림
		
		// 엔화 지폐 몇장씩?
		jpyCurrent = jpy;
		jpy10000 = jpyCurrent/10000; // jpy10000 장수
		jpyCurrent -= 10000 * jpy10000;
		jpy5000 = jpyCurrent/5000; // jpy5000 장수
		jpyCurrent -= 5000 * jpy5000;
		jpy2000 = jpyCurrent/2000; // jpy2000 장수
		jpyCurrent -= 2000 * jpy2000;
		jpy1000 = jpyCurrent/1000; // jpy1000 장수
		
		outClass.printJpy(jpy, exchangeResult, jpy10000, jpy5000, jpy2000, jpy1000);
		
		cw = won - jpy * ConstValueClass.JPY_RATE; // 거스름돈(원화)
		return cw;
	}
}

