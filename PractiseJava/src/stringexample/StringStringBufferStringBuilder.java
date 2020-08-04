package stringexample;

public class StringStringBufferStringBuilder {

	public static void main(String[] args) {

		// String - String objects are IMMUTABLE
	    // String - String Variables are MUTABLE - you can manipulate the variable / values.
		
		// Example 1 :
		
		String a = "xyz";
		String b = "xyz";
		
		System.out.println("hashCode Value of a : " + a.hashCode()); // xyz is added to String pool in Memory
		System.out.println("hashCode Value of b : " + b.hashCode()); // Since xyz is available in Memory a reference is created to b
		System.out.println("Value stored in Variable a :"+a);
		System.out.println("Value stored in Variable a :"+b);

		// BOTH hasCode Values SHOULD be SAME because it refers one object and the same object for both a and b
		
		if (a==b) {
			System.out.println("a is EQUAL to b : Meaning hashcode of a is EQUAL to hashCode of b");
		    System.out.println("Value of a is not compared with Value of b in the if statement");
		    System.out.println("\n");
		}
		else {
		    	System.out.println("a is NOT equal to b");
		}
		
		// Lets take another Example with String Buffer
		
		String c = new String();
		
		// The above Statement Creates a new object in JVM memory with a new hashCode Value
		
		c = "valuex";
		String d = new String("valuex");
		// The above Statement assigns the value xyz to the String buffer object of c
		
		// Comparing a and c or b and c using == SHOULD RESULT in False Since the hashCode value of c is different
		
		System.out.println("hashCode Value of c is "+c.hashCode());
		
		
		if(a==c) {
			System.out.println("a and c are EQUAL");
		}
		else {
			System.out.println("a and c are NOT EQUAL");
		}
		
		// Comparing b and c
		
		if(d==c) {
			System.out.println("d and c are EQUAL - COMPARISON using == ");
		}
		else {
			System.out.println("d and c are NOT EQUAL - COMPARISON using == ");

		}
		
		if(d.equals(c)) {
			System.out.println("d and c are EQUAL - COMPARISON using equals()");
		}
		else {
			System.out.println("d and c are NOT EQUAL - COMPARISON using equals()");

		}
		System.out.println();

		// StringBuffer is Thread Safe ( i.e Synchronized ) and it is MUTABLE
		System.out.println("StringBuffer is Thread Safe ( i.e Synchronized ) and it is MUTABLE");
		
		StringBuffer s1 = new StringBuffer("s1");
		
		System.out.println("s1 StringBuffer hashCode Initial Value :" +s1.hashCode());
		
		// Append Some Text to s1 and Check the hashCode Value - it should remain same - it is mutable
		
		s1.append("test");
		
		System.out.println("s1 StringBuffer hashCode After appending a string :" +s1.hashCode());
		System.out.println("s1 StringBuffer Variable Value After appending a string :" +s1);

		System.out.println("It Clearly Proves StringBuffer is MUTABLE hashCode After appending a string is same as original but value of 's1' changes:" +s1.hashCode());
        System.out.println();

		// Lets add some Text to "c" variable which we created earlier and see the difference in hashCode
		
		
		System.out.println("hashCode value of String Variable 'c' :" +c.hashCode());
		System.out.println("Value of String Variable 'c' before adding some text to it :" +c);

		c = c + "te1";

		System.out.println("hashCode value of String Variable 'c'after adding some text to it :" +c.hashCode());
		System.out.println("Value of String Variable 'c'after adding some text to it :" +c);

		// The Above Clearly Shows 'String' Objects are immutable in String class and MUTABLE in StringBuffer class
		System.out.println();
		System.out.println("String Builder is NOT Thread Safe ( i.e NOT Synchronized ) - It is also MUTABLE like StringBuffer");
		System.out.println("String Builder is same as StringBuffer except Thread Safety");

		// Example : StringBuilder sbl = new sbl("StringBuilder1"); 

		
		
		
		
	}

}
