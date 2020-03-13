package Class1;

import java.util.Scanner;

public class Calc {
	Scanner scn1 = new Scanner(System.in);

	public void inputverification(int x) {
		if (x <= 0) {
			System.out.println("Enter number which is greater than 0");
			System.exit(0);
		}
	}

	public void addition(int x) {
		int a[] = new int[x];
		int result = 0;
		for (int i = 0; i < x; i++) {
			System.out.println("Enter " + i + 1 + " Number:");
			a[i] = scn1.nextInt();
			result = a[i] + result;
		}
		System.out.println("Addition Total Is:" + result);
		scn1.close();

	}

	public void subtraction(int x) {
		int a[] = new int[x];
		int result = 0;
		for (int i = 0; i < x; i++) {
			System.out.println("Enter " + i + 1 + " Number:");
			a[i] = scn1.nextInt();
		}
		for (int i = 1; i < x; i++) {
			result = result - a[i];
		}

		System.out.println("Subtraction Total Is:" + result);
		scn1.close();
	}

	public void multplication(int x) {
		int mult, result = 1;
		mult = scn1.nextInt();
		result = mult * result;
		System.out.println("Multplication Total Is:" + result);
		scn1.close();

	}

	public void division(int x) {
		int a, b, quotient, remainder;
		a = scn1.nextInt();
		b = scn1.nextInt();
		quotient = a / b;
		remainder = a % b;
		System.out.println("Quotient  Is:" + quotient);
		System.out.println("Remainder  Is:" + remainder);
		scn1.close();
	}

}
