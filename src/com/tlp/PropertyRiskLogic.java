package com.tlp;

public class PropertyRiskLogic {
	private PropertyRisk data;
	private final static String[] typeOfConstructionArr = {"Brick", "Sticks", "Straw"};
	
	public PropertyRiskLogic() {
		
	}
	
	public void checkAgeOfPropertyWithHighPriorLoss() {
		if(data.getPropertyAge() < 5 ) {
			data.setStatus("LOW");
		}
		else if(data.getPropertyAge() < 15) {
			data.setStatus("MED");
		}
		else {
			if(data.getPropertyvalue() < 100000) {
				data.setStatus("MED");
			}
			else {
				data.setStatus("HIGH");
			}
		}
	}
	
	public static String[] getTypeOfConstructionArr() {
		return typeOfConstructionArr;
	}

	public void checkAgeOfPropertyWithLowPriorLoss() {
		if(data.getPropertyAge() < 15 ) {
			data.setStatus("LOW");
		}
		else {
			if(data.getPropertyvalue() < 10000) {
				data.setStatus("LOW");
			}
			else {
				data.setStatus("MED");
			}
		}
	}
	
	public void checkPriorLossForBricks() {
		if(data.getPriorLosses() < 2000) {
			checkAgeOfPropertyWithLowPriorLoss();
		}
		else {
			checkAgeOfPropertyWithHighPriorLoss();
		}
	}
	
	public void checkAgeOfPropertyForSticks() {
		
		if(data.getPropertyAge() < 5) {
			data.setStatus("MED");
		}
		else {
			data.setStatus("HIGH");
		}
	}
	
	
	public void start() {
		
		if(data.getConstructionType().equalsIgnoreCase("Brick")) {
			checkPriorLossForBricks();
		}
		else if(data.getConstructionType().equalsIgnoreCase("Sticks")) {
			checkAgeOfPropertyForSticks();
		}
		else if(data.getConstructionType().equalsIgnoreCase("Straw")) {
			data.setStatus("HIGH");
		}
		else {
			System.out.println("Wrong type of construction is given.");
		}
		
	}


	public PropertyRiskLogic(PropertyRisk data) {
		this.data = data;
	}


	public PropertyRisk getData() {
		return data;
	}


	public void setData(PropertyRisk data) {
		this.data = data;
	}

}
