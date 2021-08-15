package June01_5_Abstract_Class;

public class TestElectricity {

	
	public static void main(String[] args) {
		
		ElectricityPlan com=new CommercialPlan();
		com.setRate();
		com.calculateRate(150);
		
		ElectricityPlan dom=new DomesticPlan();
		dom.setRate();
		dom.calculateRate(50);
		
	}
}
