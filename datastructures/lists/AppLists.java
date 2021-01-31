package pt.bruno.study.colletions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AppLists {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		// use array list when wanting to add or remove items from the end
		doTimings("ArrayList", arrayList);
		// use linked list when wanting to add or remove items for anywhere
		doTimings("LinkedList", linkedList);
	}
	
	private static void doTimings(String type, List<Integer> list) {
		// 1E5 = 100000
		for(int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		long start = System.currentTimeMillis();
		
		// add item sto the end
		//for(int i = 0; i < 1E5; i++) {
		//	list.add(i);
		//}		
		
		// add items in the beginning off the list
		for(int i = 0; i < 1E5; i++) {
			list.add(0, i);
		}
		
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: " + (end - start) + " ms for " + type);
	}
}
