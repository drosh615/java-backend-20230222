package chapter4.Example;

/*
 * 화폐 : 화폐 = 환율
 */
public class ExchangeRate {
	
	//넣을 화폐 (ex. 원화, 달러, 엔화, 위완화 ...)
	private String exchangingCurrency;
	
	//바꿀 화폐
	private String exchangedCurrency;
	
	//환율 ( 1000 / 1316.30 )
	private double exchangeRate;
	
	public ExchangeRate(String exchangingCurrency, 
					String exchangedCurrency, 
					double exchangeRate) {
		this.exchangedCurrency = exchangedCurrency;
		this.exchangingCurrency = exchangingCurrency;
		this.exchangeRate = exchangeRate;
	}
	
	
	@Override
	public String toString() {
		return "ExchangeRate [exchangingCurrency=" + exchangingCurrency + ", exchangedCurrency=" + exchangedCurrency
				+ ", exchangeRate=" + exchangeRate + "]";
	}


	/*
	 * Get 메서드
	 * 인스턴스가 가지고 있는 특정 인스턴스 변수의 값을 반환해주기 위한 메서드
	 * 
	 * Set 메서드
	 * 인스턴스가 가지고 있는 특정 인스턴스 변수를 변경할 때 사용하는 메서드
	 */
	public String getExchangingCurrency() {
		return exchangingCurrency;
	}

	public void setExchangingCurrency(String exchangingCurrency) {
		this.exchangingCurrency = exchangingCurrency;
	}

	public String getExchangedCurrency() {
		return exchangedCurrency;
	}

	public void setExchangedCurrency(String exchangedCurrency) {
		this.exchangedCurrency = exchangedCurrency;
	}

	public double getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	
	
}
