package com.stockaccmgmtapp;

public class StockAccountMgmtApplication {
	public static void main(String[] args) {
		StockAccount stockAccount = new StockAccount("Mark", 1000);
		stockAccount.buy(5, "DMart");
		stockAccount.sell(4, "Amazon");
		stockAccount.printReport();
	}
}
