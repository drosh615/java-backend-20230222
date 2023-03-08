package chapter4.Example;

import java.util.Scanner;

/*
 * 환전기 어플리케이션
 * Input : 금액, 넣을 화폐, 바꿀 화폐
 * Output : 금액, 바뀐 화폐
 */
public class ExchangeApplication {

	private static String[] managedCurrencies = {"KRW" , "USD", "JPY"};
	
	private static ExchangeRate[] exchangeRates = {
		//원화 - 달러
		new ExchangeRate("KRW", "USD", 1 / 1318.8),
		//원화 - 엔	
		new ExchangeRate("KRW", "JPY", 1000 / 960.35),
		//달러 - 원화	
		new ExchangeRate("USD", "KRW", 1318.8 / 1),
		//달러 - 엔
		new ExchangeRate("USD", "JPY", 1318.8 / 0.96035),
		//엔 - 원화	
		new ExchangeRate("JPY", "KRW", 960.35 / 1000),
		//엔 - 달러	
		new ExchangeRate("JPY", "USD", 0.96035 / 1318.8)
	};
	
	public static void main(String[] args) {
		//입력과정
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("넣을 화폐 : ");
		String exchangingCurrency = scanner.nextLine();
		System.out.println("바꿀 화폐 : ");
		String exchangedCurrency = scanner.nextLine();
		System.out.println("금액 : ");
		int amount = scanner.nextInt();
		
		//입력검증
		//모두 입력을 했는지
		if (exchangingCurrency.isBlank() || exchangedCurrency.isBlank()) {
			System.out.println("모두 입력 해주세요.");
			return;
		}
		//입력한 화폐가 동일할 떄
		if (exchangingCurrency.equals(exchangedCurrency)) {
			System.out.println("동일한 화폐로 환전할 수 없습니다.");
			return;
		}
		//유효한 금액이 아닐 때 (금액이 양수가 아닐 때)
		if (amount <= 0 ) {
			System.out.println("유효한 금액이 아닙니다.");
			return;
		}
		//관리하고 있는 화폐 단위가 아닐 떄
		boolean hasExchanging = false;
		boolean hasExchanged = false;
		
		for (String managedCurrency: managedCurrencies) {
			if (exchangingCurrency.equals(managedCurrency))
				hasExchanging = true;
			if (exchangedCurrency.equals(managedCurrency))
				hasExchanged = true;
		}
		if (!(hasExchanged) && !(hasExchanging)) {
			System.out.println("유효하지 않는 화폐입니다");
			return;
		}	
		//정상 프로세스
		double resultAmount = amount;
		for (ExchangeRate exchangeRate: exchangeRates) {
			boolean isSame = exchangingCurrency.equals(exchangeRate.getExchangingCurrency()) &&
					exchangedCurrency.equals(exchangeRate.getExchangedCurrency());
			if(isSame) {
				resultAmount *= exchangeRate.getExchangeRate();
				break;
			}
				
		}
		//System.out.println(exchangingCurrency + " " + exchangedCurrency + " " + amount); //중간확인
		
		// 정상출력
		
		System.out.println(exchangedCurrency + ": " + resultAmount);
	}
	
		

}
