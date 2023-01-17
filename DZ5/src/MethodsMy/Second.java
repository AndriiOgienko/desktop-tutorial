package MethodsMy;

import java.util.Scanner;

public class Second {
	static float convert(float a, float b) {
		return a * b;

	}
	
	public static void main(String[] args) {

		System.out.println("Write the sum in your currency");
		Scanner in = new Scanner(System.in);
		Float a = in.nextFloat();

		System.out.println("Write the exchange rate");
		Float b = in.nextFloat();
		convert (a, b);
		Float res = convert(a,b);
		System.out.println("The sum in other currency is   " + res);
}
}
