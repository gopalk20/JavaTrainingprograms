package Class1;

import java.util.Scanner;

public class Calculator {
	Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int option, n;
		restart;
		Scanner scn = new Scanner(System.in);
		Calc obj = new Calc();
		System.out.println("Calculator");
		System.out.println("Enter your option to perform calculation");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multplication");
		System.out.println("4.Division");
		option = scn.nextInt();

		switch (option) {
		case 1:
			System.out.println("Enter total number to be add");
			n = scn.nextInt();
			obj.inputverification(n);
			obj.addition(n);
			break;
		case 2:
			System.out.println("Enter total number to be subtract");
			n = scn.nextInt();
			obj.inputverification(n);
			obj.subtraction(n);
			break;
		case 3:
			System.out.println("Enter total number to be Multplication");
			n = scn.nextInt();
			obj.inputverification(n);
			obj.multplication(n);
			break;
		case 4:
			System.out.println("Enter total number to be division");
			n = scn.nextInt();
			obj.inputverification(n);
			if (n > 2) {
				System.out.println("In Division only 2 numbers allowed");
				System.exit(0);
			} else {
				obj.division(n);
			}
			break;
		}
		System.out.println("Do you like to calculate again if yes press Y");
		Char c;
		c.getchar();
		if (c=='Y' or c=='y')
			goto restart;
	}
}
