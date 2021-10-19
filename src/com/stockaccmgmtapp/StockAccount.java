package com.stockaccmgmtapp;

public class StockAccount {
	private String customerName;

	private double balance;

	private StockPortfolio stockPortfolio;

	public StockAccount(String customerName, double balance) {
		super();
		this.customerName = customerName;
		this.balance = balance;
		this.stockPortfolio = new StockPortfolio();
	}

	public double debit(double money) {

		if(money > balance) {
			System.out.println("Debit amount exceeded account balance.");
			return 0;
		}
		else {
			balance = balance - money;
			return money;
		}
	}

	public double valueOf() {
		return this.balance;
	}

	public void buy(int noOfshares, String company) {

		double sharePrice = StockInventory.priceOfShareByCompany(company);
		double amount = sharePrice * noOfshares;
		boolean result = false;

		if(amount <= balance) {
			result = StockInventory.buy(company, noOfshares);
		}
		
		else{
			System.out.println("You do not have sufficient balance to buy the share.");
			return;
		}

		if(result) {
			this.debit(amount);
			stockPortfolio.addStock(company, noOfshares, sharePrice);
		}

	}

	public void sell(int noOfshares, String company) {
		double sharePrice = StockInventory.priceOfShareByCompany(company);
		double amount = sharePrice * noOfshares;
		boolean result = false;

		result = StockInventory.sell(company, noOfshares);

		if(result) {
			this.credit(amount);
			stockPortfolio.removeStock(company, noOfshares, sharePrice);
		}
	}

	public void credit(double amount) {
		this.balance += amount;
	}

	public void printReport() {
		System.out.println("The Stock Report for the customer : " + customerName);
		
		double totalBalance = stockPortfolio.getTotalStockVal() + this.balance;
		System.out.println("User Total amount  : " + totalBalance);
		
		stockPortfolio.printReport();
		System.out.println("User Account balance  : " + this.balance);
	}
}
