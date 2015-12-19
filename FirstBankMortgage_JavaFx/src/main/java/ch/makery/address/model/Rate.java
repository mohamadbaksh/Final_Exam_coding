package ch.makery.address.model;

import domain.RateDomainModel;

import org.apache.poi.ss.formula.functions.FinanceLib;

import base.RateDAL;
import ch.makery.address.view.*;

public class Rate extends RateDomainModel {
	
	public static double getPayment(double creditScore, double term, double houseCost)
	{
		
		double interestRate = RateDAL.getRate(creditScore);
		double numberOfPayments = term*12; 
		double presentValue = houseCost; 
		double futureValue = 0;
		boolean blablabla = false; 
		
		double PMT = FinanceLib.pmt(interestRate, numberOfPayments, presentValue, futureValue,blablabla); 
		
		
		return PMT;
	}
}