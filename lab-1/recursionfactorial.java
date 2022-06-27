
import java.io.*;
import java.util.*;


class recursionfactorial {

	
	static int factorial(int n)
	{

		if (n == 1)
			return 1;

		else{
		return n * factorial(n - 1);
    	}
	}

	
	public static void main(String[] args)
	{


		int ans = factorial(5);

		
		System.out.println("Factorial of 5 is :" + ans);
	}
}
