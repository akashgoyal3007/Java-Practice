
public class datatypedemo 
{
	int n1; // instance variable--default value 0
	char ch;//default value
	float f;//default value 0.0
	String str;//default value null
	double d;//default value 0.0
	public static void main(String[] args) 
	{
		int a=9;// local variable
		System.out.println("Value of a:"+a);
		datatypedemo obj=new datatypedemo(); //object creation
		System.out.println("Value of integer:"+obj.n1);
		System.out.println("Value of character:"+obj.ch);
		System.out.println("Value of floatr:"+obj.f);
		System.out.println("Value of string:"+obj.str);
		System.out.println("Value of double:"+obj.d);
		
		
	}

}
