package application;

import java.util.Locale;
import java.util.Scanner;

import model.services.InterestService;
import model.services.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		System.out.println("Payment after three months:");
		InterestService interestService = new UsaInterestService(0.01);
		System.out.printf("%.2f ", interestService.calculateInterest(amount, months));
		
		sc.close();

	}

}
