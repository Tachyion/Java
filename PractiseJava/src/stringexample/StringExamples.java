package stringexample;
public class StringExamples {

	public static void main(String[] args) {

     
		String s1 = "Chennai";
		String s2 = "London";
		String s3="";
		
		// Reverse a String
		
		int l=s1.length();
		System.out.println("Length of String s1 is : "+l);
		for(int i=l-1;i>=0;i--) {
			
			s3 = s3 + s1.charAt(i);
			
			System.out.print(s1.charAt(i));

		}
		System.out.println("\nReversed String :"+s3);
		
		// Swapping String Without Temporary Variable
		
		s1=s1+s2;
		
		System.out.println("Step 1: s1 = s1+s2 :"+s1);
		
        //s2 = s1.substring(s1.length()-s2.length(), s2.length());
        s2 = s1.substring(0,s1.length()-s2.length());

		System.out.println("Step 2: value of s2 :"+s2);
		
		s1 = s1.substring(s2.length(),s1.length());
		
		System.out.println("Step 3: value of s1 :"+s1);


		//System.out.println("Reverse Value :"+s2.charAt(2));
		
	}

}
