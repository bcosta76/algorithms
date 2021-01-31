import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {
	
	public static void main(String[] args) {
		
		
		
		/*
		 * To sort classes, the calss being sorted needs to implement the interface Comparable<Class>
		 * If that is not possible, we can create a anonimous class from the interface Comparator<Class>
		 */
		
		// COMPARABLE
		List<Laptop> laps = new ArrayList<>();
		
		laps.add(new Laptop("Apple", 8, 1200));
		laps.add(new Laptop("Dell", 16, 800));
		laps.add(new Laptop("Accer", 12, 700));
		
		System.out.println("Before comparable");
		for(Laptop l : laps) {
			System.out.println(l);
		}
		
		Collections.sort(laps);
		
		System.out.println("After comparable");
		for(Laptop l : laps) {
			System.out.println(l);
		}
		
		
		// COMPARATOR
		
		List<Laptop2> laps2 = new ArrayList<>();
		
		laps2.add(new Laptop2("Apple", 8, 1200));
		laps2.add(new Laptop2("Dell", 16, 800));
		laps2.add(new Laptop2("Accer", 12, 700));
		
		Comparator<Laptop2> com = new Comparator<Laptop2>() {

			@Override
			public int compare(Laptop2 l1, Laptop2 l2) {
				if (l1.getPrice() > l2.getPrice())
					return 1;
				else if (l1.getPrice() < l2.getPrice())
					return -1;
				else
					return 0;
			}
			
		};
		
		System.out.println("Before comparator");
		
		for(Laptop2 l : laps2) {
			System.out.println(l);
		}
		
		Collections.sort(laps2, com);
		
		
		System.out.println("After comparator");
		
		for(Laptop2 l : laps2) {
			System.out.println(l);
		}
	}
}






