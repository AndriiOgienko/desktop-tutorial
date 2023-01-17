package MethodsMy;

import java.util.Scanner;

public class First {

	static int add(int a, int b) {
		return a + b;

	}

	static int sub(int a, int b) {
		return a - b;
	}

	static int mul(int a, int b) {
		return a * b;
	}

	static int div(int a, int b) {

		if (b != 0) {
			return a / b;
		}
		return a - a;
	}

	public static void main(String[] args) {

		System.out.println("Write the mathematical action");
		Scanner in = new Scanner(System.in);
		String sign = in.next();

		System.out.println("Write the figures");
		int a = in.nextInt();
		int b = in.nextInt();

		if (sign == "+") {
			add(a, b);
			int sum = add(a,b);
			System.out.println(sum);
		} 
		else if (sign == "-") {
			sub(a,b);
		int sub = sub(a,b);
			System.out.println(sub);
		}
		if (sign == "*") {
			mul(a, b);
			int mul = mul(a, b);
			System.out.println(mul);
		} 
		else {
			div(a, b);
			int div = div(a, b);
			System.out.println(div);
		}
	}
}
