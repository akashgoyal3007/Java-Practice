package collection;
// LinkedHashSet=class
// it implements set interface
// order-Insertion
// Duplicate- Not allowed
//Null-allowed
import java.util.LinkedHashSet;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer>lh=  new LinkedHashSet<>();
		System.out.println(lh.isEmpty());
		System.out.println(lh);
		lh.add(10);
		lh.add(40);
		lh.add(30);
		lh.add(20);
		lh.add(10);
		System.out.println(lh);


	}

}
