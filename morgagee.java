package homeMorgage;

import java.util.Scanner;

public class morgagee {
	
	public  static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the base morgage");
		int morgageHome = sc.nextInt();
		System.out.println("Enter the downpayment");
		int downPayment = sc.nextInt();
		System.out.println("Enter the credit score");
		int creditScore = sc.nextInt();
		double interestRate = 0;
		double finalMorgage= 0;
		
		if (creditScore > 750) {
			interestRate = 0.1;
			
		}
		
		if (creditScore > 650 && creditScore<=750) {
			interestRate = 0.2;
		}
		
		if (creditScore > 600 && creditScore<=650) {
			interestRate = 0.3;
		}
		
		
		double baseMorgage;
		double interestMorgage = baseMorgage = interestRate;
		System.out.println(interestMorgage);
		
		finalMorgage = baseMorgage + interestMorgage;
		System.out.println(finalMorgage);
		
		
		
		
	}


}
