package assignment_5;

import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Saving Account Name: ");
		String name = scan.next();
		System.out.print("Saving Account Balance: ");
		String bal = scan.next();
		System.out.print("Saving Account Number: ");
		int num = scan.nextInt();
		System.out.println("Saving Account Interest Rate: ");
		double rate = scan.nextDouble();
		
		Saving s1 = new Saving(num, name, bal, rate);
		s1.display();
		
		System.out.print("Current Account Name: ");
		name = scan.next();
		System.out.print("Current Account Balance: ");
		bal = scan.next();
		System.out.print("Current Account Number: ");
		num = scan.nextInt();
		System.out.println("Current Account Interest Rate: ");
		rate = scan.nextDouble();
		
		Current c1 = new Current(num, name, bal, rate);
		c1.display();
		
		scan.close();
	}
}
