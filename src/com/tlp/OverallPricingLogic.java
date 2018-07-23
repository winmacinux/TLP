package com.tlp;

public class OverallPricingLogic {


	private OverallPricing pricing;

	public OverallPricingLogic(OverallPricing insurance) {

		this.pricing = insurance;
	}


	public OverallPricing getInsurance() {
		return pricing;
	}


	public void setInsurance(OverallPricing pricing) {
		this.pricing = pricing;
	}
	
	
	public void getCoverageLiabilityForExcellent() {
		
		if(pricing.getCoverageLiability().equalsIgnoreCase("High")) {
			if(pricing.getPropertyrisk().equalsIgnoreCase("High")) {
				pricing.setStatus("NEW Refer");
			}
			else if(pricing.getPropertyrisk().equalsIgnoreCase("Med") || pricing.getPropertyrisk().equalsIgnoreCase("Low")) {
				pricing.setStatus("Refer");
			}
			else {
				System.out.println("Error: Incorrect Property risk - message from OverallPricing Logic");
			}
		}
		else if(pricing.getCoverageLiability().equalsIgnoreCase("Med")) {
			pricing.setStatus("B");
		} 
		else if(pricing.getCoverageLiability().equalsIgnoreCase("Low")) {
			pricing.setStatus("A");
		}
		else {
			System.out.println("Error: Incorrect Coverage Liability - message from OverallPricing Logic");
		}
		
	}
	
public void getCoverageLiabilityForAverage() {
		
		if(pricing.getCoverageLiability().equalsIgnoreCase("High")) {
			pricing.setStatus("Refer");
		}
		else if(pricing.getCoverageLiability().equalsIgnoreCase("Med")) {
			if(pricing.getPropertyrisk().equalsIgnoreCase("High")) {
				pricing.setStatus("C");
			}
			else if(pricing.getPropertyrisk().equalsIgnoreCase("Med") || pricing.getPropertyrisk().equalsIgnoreCase("Low")) {
				pricing.setStatus("B");
			}
			else {
				System.out.println("Error: Incorrect Property risk - message from OverallPricing Logic");
			}
		} 
		else if(pricing.getCoverageLiability().equalsIgnoreCase("Low")) {
			pricing.setStatus("A");
		}
		else {
			System.out.println("Error: Incorrect Coverage Liability - message from OverallPricing Logic Average");
		}
		
	}


	public void start()
	{
		if(pricing.getCustomerFinancialStability().equalsIgnoreCase("Excellent")) {
			getCoverageLiabilityForExcellent();
		}
		else if(pricing.getCustomerFinancialStability().equalsIgnoreCase("Average")) {
			getCoverageLiabilityForAverage();
		}
		else if(pricing.getCustomerFinancialStability().equalsIgnoreCase("Poor")) {
			pricing.setStatus("Reject");
		}
	}
}
