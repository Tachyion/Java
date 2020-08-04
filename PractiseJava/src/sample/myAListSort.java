package sample;

//import java.util.*;
import java.util.List; // List is an Interface
import java.util.Set; // Set is an Interface
import java.util.ArrayList; // ArrayList is a Class which implements List interface
import java.util.TreeSet;

// Author : saravanak1900@gmail.com 
// Program to Remove ** DUPLICATE VALUES ** and Sort Ascending  in ArrayList
// Method 2 : Remove Duplicates and Sort Ascending  By Converting ArryList to TreeSet 
//     ( TreeSet Removes Duplicates and Sorts in Ascending Order by Default)   

public class myAListSort {

	public static void main(String[] args) {

		// Method 2 : Convert the Array List to TreeSet to Remove Duplicates and Sort it
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(2009);
		ll.add(1999);
		ll.add(9000); // We can add Values to ArrayList without index
		ll.add(200); // Adding Values without index to Array List will add auto index
		ll.add(7778);
		ll.add(1009);
		ll.add(379);
		ll.add(0, 89);
		ll.add(3, 7778); // We can Specify the Index for the Values )
		ll.add(8, 1999);

		System.out.println("Array List Values - Assigned :: " + ll);

		// Create a Treeset object
		Set<Integer> ts = new TreeSet<Integer>();

		// The following command adds all ArrayList elements to TreeSet
		ts.addAll(ll);

		System.out.println("TreeSet Values - :: " + ts);

		// Clears or removes or truncates ArrayList object ll
		ll.clear();

		System.out.println("Array List Current Values - :: " + ll);

		// Add Sorted Non Duplicate Treeset object values to ArrayList

		ll.addAll(ts);

		System.out.println("Array List Current Values after updated - :: " + ll);

	}

}
