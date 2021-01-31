package pt.bruno.study.colletions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AppSets {
	public static void main(String[] args) {
		// sets do not accept duplicate items
		
		// HashSet does not retain order
		Set<String> set1 = new HashSet<String>();
		
		// LinkedHashSet remembers order you added items in
		Set<String> set2 = new LinkedHashSet<String>();
		
		// TreeSet orders in natural order
		Set<String> set3 = new TreeSet<String>();
		
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");
		
		// adding duplicate does nothing
		set1.add("mouse");
		
		System.out.println(set1);
		
		// iterate 
		
		for (String element : set1)
			System.out.println(element);
		
		// new way
		
		set1.forEach(System.out::println);
		
		
		// find
		
		if(set1.contains("penguin"))
				System.out.println("We got penguins!!");

	}
}
