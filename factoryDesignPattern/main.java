package factoryDesignPattern;

import java.util.Scanner;

class main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		System.out.print("Enter the paln name : ");
		String planName = input.nextLine();
		
		System.out.print("Enter the number of units : ");
		int units = input.nextInt();
		
		getPlanFactory palnFactory = new getPlanFactory();
		Plan p = palnFactory.getPlan(planName);
		
		System.out.print("Bill amount for "+ planName + " of "+ units + " units is : ");
		p.getRate();
		p.calculateBill(units);
	}

}
