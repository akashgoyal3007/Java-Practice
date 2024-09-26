package collection;
import java.util.Enumeration;
import java.util.Vector;

public class vectorDemo {

	public static void main(String[] args) 
	{
		Vector<Integer>v=new Vector<>();
		System.out.println(v.isEmpty());
		System.out.println(v);
		v.add(null);
		v.add(1);
		v.add(2);
		v.add(5);
		v.add(2);
		v.add(4);
		System.out.println(v);
		System.out.println("Element at 3rd index is: "+v.elementAt(3));
		System.out.println(v.capacity());
		System.out.println(v.subList(2,5));
		System.out.println("**************************");
		Enumeration<Integer> e= v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		

		
	}

}
