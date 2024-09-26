class student
{
	int rno;
	String name;
	float per;
}

public class objectdemo {

	public static void main(String[] args) 
	{
		student s1;
		s1= new student();
		student s2=new student();
		s1.rno=1;
		s1.name="Akash";
		s1.per=85;
		System.out.println("Roll no:"+s1.rno);
		System.out.println("Name:"+s1.name);
		System.out.println("Percentage:"+s1.per);
		s2.rno=2;
		s2.name="Abhishek";
		s2.per=88;
		System.out.println("Roll no:"+s2.rno);
		System.out.println("Name:"+s2.name);
		System.out.println("Percentage:"+s2.per);
		
	}

}
