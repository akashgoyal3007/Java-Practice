package collection;
import java.util.Iterator;
import java.util.LinkedList;
 class LinkedListDemo {

	public static void main(String[] args) 
	{
		LinkedList<Integer> ls= new LinkedList<>();
		System.out.println(ls.isEmpty());
		System.out.println(ls);
		ls.add(1);
		ls.add(5);
		ls.add(4);
		ls.add(2);
		ls.add(null);
		ls.add(5);
		System.out.println(ls);
		System.out.println(ls.offer(50));
		System.out.println(ls.offer(2));
		System.out.println(ls);
		System.out.println(ls.poll());
		System.out.println(ls);
		System.out.println(ls.poll());
		System.out.println(ls);
		System.out.println(ls.peek());
		System.out.println(ls);
		System.out.println(ls.offerFirst(100));
		System.out.println(ls);
		System.out.println("********************************************");
		Iterator<Integer> itr=ls.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}

		
		
	}
 }


