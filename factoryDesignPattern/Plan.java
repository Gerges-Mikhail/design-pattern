package factoryDesignPattern;
	
	//abstract class
public abstract class Plan {
	//  #rate:double
	protected double rate ;
	
	//+getRate() : void 
	abstract void getRate();
	
	//+calculateBill(int units) : void 
	public void calculateBill(int units) {
		System.out.print("Bill = "+ units*rate);
	}
	
}
