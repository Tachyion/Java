package sample;

public class FactorialCalc {
	
	public static int fibo(int n) 
	{
	    System.out.println("Calling fibonacci with input: " + n);
	 
	    if (n < 2) {
	        return n;
	    }
	 
	    return n*fibo(n - 1);// + fibo(n - 2);
     }
	

	public static void main(String[] args) 
	{
		int f=5;
	    
		int res = FactorialCalc.fibo(f);
		System.out.println(+res);
 
    }
}
