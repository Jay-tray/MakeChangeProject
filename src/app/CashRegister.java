package app;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// User story one
		System.out.println("How much did the item cost?");
		double amount = sc.nextDouble();
		// User story two
		System.out.println("How much money are you tendering?");
		double tendered = sc.nextDouble();
		System.out.println("");
		// User story three
		if (amount > tendered) {
			System.out.println("That's not enough, pony up!");
		} else if (amount == tendered) {
			System.out.println("Thank you have a wonderful day!");
		} else {
			double changeAmount = tendered - amount;
			int count20DollarBills = (int) (changeAmount / 20);

			if (count20DollarBills != 0) {
				if (count20DollarBills == 1)
					System.out.print(count20DollarBills + " twenty dollar bill, ");
				else
					System.out.print(count20DollarBills + " twenty dollar bills, ");
			}

			changeAmount = convert(changeAmount, 20);
			int count10DollarBills = (int) (changeAmount / 10);

			if (count10DollarBills != 0) {
				if (count10DollarBills == 1)
					System.out.print(count10DollarBills + " ten dollar bill, ");
				else
					System.out.print(count10DollarBills + " ten dollar bills, ");
			}
			changeAmount = convert(changeAmount, 10);
			int count5DollarBills = (int) (changeAmount / 5);

			if (count5DollarBills != 0) {
				if (count5DollarBills == 1)
					System.out.print(count5DollarBills + " five dollar bill, ");
				else
					System.out.print(count5DollarBills + " five dollar bills, ");

			}
			changeAmount = convert(changeAmount, 5);
			int count1DollarBills = (int) (changeAmount / 1);

			if (count1DollarBills != 0) {
				if (count1DollarBills == 1)
					System.out.print(count1DollarBills + " one dollar bill, ");
				else
					System.out.print(count1DollarBills + " one dollar bills, ");
			}
			changeAmount = convert(changeAmount, 1);
			int countQuarters = (int) (changeAmount / .25);

			if (countQuarters != 0) {
				if (countQuarters == 1)
					System.out.print(countQuarters + " quarter, ");
				else
					System.out.print(countQuarters + " quarters, ");
			}

			changeAmount = convert(changeAmount, .25);
			int countDimes = (int) (changeAmount * 10);

			if (countDimes != 0) {
				if (countDimes == 1)
					System.out.print(countDimes + " dime, ");
				else
					System.out.print(countDimes + " dimes, ");

			}
			changeAmount = convert(changeAmount, .10);
			int countNickels = (int) (changeAmount * 20);

			if (countNickels != 0) {
				if (countNickels == 1)
					System.out.print(countNickels + " nickle, ");
				else
					System.out.print(countNickels + " nickles, ");
			}
			changeAmount = convert(changeAmount, .05);
			int countPennies = (int) (.1 + (changeAmount * 100));

			if (countPennies != 0) {
				if (countPennies == 1)
					System.out.print(countPennies + " penny.");
				else
					System.out.print(countPennies + " pennies.");
			}
		}
	}
	public static double convert(double a, double b) {
		int result = (int) Math.floor(a/b);
		return a - result * b;
	}
}