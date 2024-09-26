package collection;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer>s=new HashSet<>();
		System.out.println(s.isEmpty());
		System.out.println(s);
		s.add(null);
		s.add(1);
		s.add(2);
		s.add(5);
		s.add(2);
		s.add(4);
		System.out.println(s);
		HashSet<Integer>hs=new HashSet<>();
		hs.add(30);
		hs.add(33);
		hs.add(32);
		hs.add(330);
		System.out.println(hs);
		System.out.println(hs);
		s.addAll(hs);
		System.out.println(s);\

		
		
		


	}

}
