package com.stockaccmgmtapp;

import java.util.HashMap;
import java.util.Map;

public class StockInventory {
	private static Map<String, CompanyShare> shares;

	static {
		shares = new HashMap<>();
		shares.put("DMart", new CompanyShare("DMart", 10, 100));
		shares.put("Reliance",new CompanyShare("Reliance", 15, 90));
		shares.put("Amazon",new CompanyShare("Amazon", 20, 50));
		shares.put("FlipCart",new CompanyShare("FlipCart", 15, 90));
	}

	public static boolean buy(String company, int noOfShares) {
		CompanyShare companyShare = shares.get(company);

		if(companyShare == null) {
			System.out.println("The company " + company + " does not exists");
			return false;
		}

		int noOfCmpShares = companyShare.getNoOfShare();

		if(noOfShares > noOfCmpShares) {
			System.out.println("The company "+  company +" does not have " + noOfShares + " shares");
			System.out.println("The company"+  company  +" has  " + noOfShares + " shares");
			return false;
		}

		companyShare.setNoOfShare(noOfCmpShares - noOfShares);
		return true;
	}
	

	public static boolean sell(String company, int noOfShares) {
		CompanyShare companyShare = shares.get(company);

		if(companyShare == null) {
			System.out.println("The company " + company + " does not exists");
			return false;
		}

		int noOfCmpShares = companyShare.getNoOfShare();

		if(noOfShares > noOfCmpShares) {
			System.out.println("The company "+  company +" does not have " + noOfShares + " shares");
			System.out.println("The company"+  company  +" has  " + noOfShares + " shares");
			return false;
		}

		companyShare.setNoOfShare(noOfCmpShares + noOfShares);
		return true;
	}
	
	public static double priceOfShareByCompany(String company) {
		CompanyShare companyShare = shares.get(company);
		return companyShare.getSharePrice();
	}

}
