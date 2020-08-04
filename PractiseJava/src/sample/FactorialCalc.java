package sample;

public class FactorialCalc {
	
	public static int factorial(int n) 
	{
	    System.out.println("Calling factorial with input: " + n);
	 
	    if (n < 2) {
	        return n;
	    }
	 
	    return n*factorial(n - 1);
     }
	

	public static void main(String[] args) 
	{
		int f=5;
	    
		int res = FactorialCalc.factorial(f);
		System.out.println();
		System.out.println("Factorial Result : "+res);
 
    }
}

