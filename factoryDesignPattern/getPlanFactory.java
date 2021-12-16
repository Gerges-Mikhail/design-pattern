package factoryDesignPattern;

public class getPlanFactory {
	public Plan getPlan(String planType) {
		
		if (planType == null) {
			return null;
		}
		
		if(planType.equalsIgnoreCase("Domestic plan")) {
			return new DomesticPlan();//method form Plan
		}
		
		if(planType.equalsIgnoreCase("Commercial plan")) {
			return new CommercialPlan();//method form Plan
		}
		
		if(planType.equalsIgnoreCase("Institutional plan")) {
			return new InstitutionalPlan();//method form Plan
		}
		
		return null; //as default
	}
}
