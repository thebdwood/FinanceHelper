
public class ratios {
	double avgCurrAssets;
	double avgCurrLiab;
	double avgInventories;
	double avgTotalAssets;
	double avgTotalDebt;
	double interest;
	double netSales;
	double coGS;
	double netIncome;
	double avgOwnerEquity;
	

	//Liquidity
	private double findCurrentRatio() {
		return avgCurrAssets/avgCurrLiab;
	}
	
	private double findQuickRatio() {
		return (avgCurrAssets - avgInventories)/avgCurrLiab;
	}
	
	private double nwc() {
		return (avgCurrAssets - avgCurrLiab)/avgTotalAssets;
	}
	
	//--------------------------------------------------------
	
	//Leverage
	private double tDTA() {
		return avgTotalDebt/avgTotalAssets;
	}
	
	private double cLTD() {
		return avgCurrLiab/avgTotalDebt;
	}
	
	private double interestCoverage() {
		return model.EBITDA()/interest;
	}

	//--------------------------------------------------------
	
	//Profitability 
	private double grossProfitMargin() {
		return (netSales - coGS)/netSales;
	}
	
	private double netProfitMargin() {
		return netIncome/netSales;
	}
	
	//--------------------------------------------------------
	
	//Efficiency
	private double salesTA() {
		return netSales/avgTotalAssets;
	}
	
	private double returnOnAssets() {
		return netIncome/avgTotalAssets;
	}
	
	private double returnOnEquity() {
		return netIncome/avgOwnerEquity;
	}
}
