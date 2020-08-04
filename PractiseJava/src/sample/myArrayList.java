package sample;
import java.util.*;
import java.util.List; // List is an Interface
import java.util.ArrayList; // ArrayList is a Class which implements List interface
// Author : Saravanak1900@gmail.com
// Program to Remove ** DUPLICATE VALUES **  in List
// Method 1: Remove Duplicates by Comparing the Values in Array List 

public class myArrayList {

	public static void main(String[] args) {
    
	// Method 1 : Comparing the Values in Array List and Remove Duplicates	
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(2009);
		ll.add(1999);
		ll.add(9000);   // We can add Values to ArrayList without index
		ll.add(200); // Adding Values without index to Array List will add auto index
		ll.add(7778);
		ll.add(1009);
		ll.add(379);
		ll.add(0,89);
		ll.add(3, 7778); // We can Specify the Index for the Values )
		ll.add(8, 1999);
		System.out.println("Array List Last Index :: " +ll.lastIndexOf(ll));
		System.out.println("Array List Values - Assigned :: " +ll);
		System.out.println();
		// Sample : Get the Index of a Value in Array List
		// It gives index of the First Value Incase Duplicate entries in Array List
		System.out.println("index of Value 1999 -- > "+ll.indexOf(1999));
		System.out.println();
		// Sample : Get the Value from ArrayList based on the respective Index Value
		System.out.println("value of Index 2: ll[2] : -- > "+ll.get(2));
		System.out.println("value of Index 8 :ll[8] : -- > "+ll.get(8));
		
		// Get All Values in ArrayList Using Iterator
		System.out.println();
		Iterator it = ll.iterator();
		System.out.println();
		
		while (it.hasNext()) 
		{
			System.out.print(it.next() + " ");
		}
		
		System.out.println();

		for(int i=0;i<=ll.size()-1;i++)
		{
			
		  for(int j = i+1;j<ll.size()-1;j++)
		  {
			  
	    	if((ll.get(i)).equals(ll.get(j)))
		    {
			  System.out.println("Duplicate found at index :"+j +" "+"Value : "+ll.get(j));
			  System.out.println("Removing duplicate element at index"+j +" Value"+ll.get(j));
			  ll.remove(j);
      		}
	    	
		  }
		  
		}
		
		
		System.out.println("Result After Removing Duplicates in ArrayList"+ll);

	}
    
}
