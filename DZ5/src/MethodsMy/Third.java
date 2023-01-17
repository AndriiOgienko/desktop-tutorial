package MethodsMy;

import java.util.Scanner;

public class Third {
	static float debt(float a) 
	{
		if(a==700)
	    return 0;
		
		else if (a<700)
			return 700-a;
		
		else
	    return 700-a;
		}
	
	
	public static void main(String[] args) {

		System.out.println("Write the sum, that was paid by the customer");
		Scanner in = new Scanner(System.in);
		Float a = in.nextFloat();
		float res = debt (a);
		System.out.println("The debt of customer is    " + res);
}
}