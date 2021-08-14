package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String item;
		double price, money, change, totalMoney = 0;
		System.out.println("What item would you like to buy?");
		item = scan.next();
		System.out.println("How much does it cost?");
		price = scan.nextDouble();

		do {
			System.out.println("How much money are you putting?");
			money = scan.nextDouble();
			if (money < price) {
				totalMoney += money;
				if (totalMoney > price) {
					change = totalMoney - price;
					System.out.println("You have given enough to buy " + item + ", your change is $" + change);
				} else if (totalMoney == price) {
					System.out.println("You have paid equal money needed for " + item);
				}
			}
		} while (totalMoney < price);
		System.out.println("Enjoy your purchase");

	}

}
