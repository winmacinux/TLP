package com.tlp;

public class FinancialStabilityLogic {

	private FinancialStability insurance;




	public FinancialStabilityLogic(FinancialStability insurance) {
		super();
		this.insurance = insurance;
	}




	public FinancialStability getInsurance() {
		return insurance;
	}




	public void setInsurance(FinancialStability insurance) {
		this.insurance = insurance;
	}




	public void start() {

		if(insurance.getYearsInBusiness()<=1) {
			insurance.setStatus("poor");
		}
		else
			if(insurance.getYearsInBusiness()>=1 && insurance.getYearsInBusiness()<=5) {
				System.out.println("Here");
				if(insurance.getBankRuptcs()==0) {
					insurance.setStatus("Average");
				}
				else if(insurance.getBankRuptcs()==1) {
					if(insurance.getYearAtCurrentAddress()<5) {							
						insurance.setStatus("poor");
					}
					else if(insurance.getYearAtCurrentAddress()>=5) {
						insurance.setStatus("Average");
					}
				}
				else if(insurance.getBankRuptcs()>1)
					insurance.setStatus("poor");
			}
			else if(insurance.getYearsInBusiness()>5)
			{
				if(insurance.getBankRuptcs()==0) {						
					insurance.setStatus("Excellent");
				}
				else if(insurance.getBankRuptcs()==1) {
					if(insurance.getYearAtCurrentAddress()<5) {
						insurance.setStatus("Average");							
					}
					else if(insurance.getYearAtCurrentAddress()>=5) {							
						insurance.setStatus("Excellent");
					}
				}	
				else if(insurance.getBankRuptcs() > 1)
					insurance.setStatus("Poor");
			}


	}
}
