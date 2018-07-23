package com.tlp;

public class CoveragestabilityLogic {

	private CoverageStability insurance;
	private final static String[] industryArr = {"Medical", "Construction", "Retail"};
	private final static String[] coverageArr = {"Malpractice", "Building", "Contents"};

	public CoveragestabilityLogic(CoverageStability insurance) {
		this.insurance = insurance;
	}

	public static String[] getCoveragearr() {
		return coverageArr;
	}

	public static String[] getIndustryarr() {
		return industryArr;
	}

	public CoverageStability getInsurance() {
		return insurance;
	}

	public void setInsurance(CoverageStability insurance) {
		this.insurance = insurance;
	}


	public void start() {

		if(insurance.getCoverage().equalsIgnoreCase("malpractice"))
		{
			if(insurance.getIndustry().equalsIgnoreCase("medical"))
			{
				insurance.setStatus("high");
			}
			else if(insurance.getCoverage().equalsIgnoreCase("construction"))
			{
				insurance.setStatus("med");
			}
			else if(insurance.getIndustry().equalsIgnoreCase("retail")) {				
					insurance.setStatus("low");
			}
			else {
				System.out.println("Error in Industry-Malpractice");
			}
		}
		else if(insurance.getCoverage().equalsIgnoreCase("building"))
		{
			if(insurance.getIndustry().equalsIgnoreCase("medical"))
			{
				insurance.setStatus("med");
			}
			else if(insurance.getCoverage().equalsIgnoreCase("construction")) {					
					insurance.setStatus("med");
			}
			else if(insurance.getIndustry().equalsIgnoreCase("retail")) {					
						insurance.setStatus("med");
			}
			else {
				System.out.println("Error in Industry-Building");
			}
		}
		else if(insurance.getCoverage().equalsIgnoreCase("contents"))
		{
			if(insurance.getIndustry().equalsIgnoreCase("medical")) {					
				insurance.setStatus("high");
			}
			else if(insurance.getCoverage().equalsIgnoreCase("construction")) {					
					insurance.setStatus("low");
			}
			else if(insurance.getIndustry().equalsIgnoreCase("retail")) {						
					insurance.setStatus("high");
			}
			else {
				System.out.println("Error in Industry-Contents");
			}
		}
		else {
			System.out.println("Error in Coverage");
		}
	} 

}