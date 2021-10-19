package com.stockaccmgmtapp;

public class Stock {
	private String name;
	private int noOfShare;  
	private double sharePrice; 

	public Stock(String name, int noOfShare, double sharePrice) {
		super();
		this.name = name;
		this.noOfShare = noOfShare;
		this.sharePrice = sharePrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfShare() {
		return noOfShare;
	}

	public void setNoOfShare(int noOfShare) {
		this.noOfShare = noOfShare;
	}

	public double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}
}
