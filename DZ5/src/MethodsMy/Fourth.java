package MethodsMy;

public class Fourth {
	static int delivery(int n)
	{
		if(n==0)
			return 1;
		else
			return n * delivery(n - 1);
	}

	public static void main(String[] args) {
		int factorial = delivery(4);
		
		System.out.println(factorial);
	}

}


