
public class ClaArithmetic {

	public static void main(String[] args) {
	
		System.out.println("Argument1:"+args[0]);
		System.out.println("Argument2:"+args[1]);
		System.out.println("Argument3:"+args[2]);
		System.out.println("Argument4:"+args[3]);
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		float c=Float.parseFloat(args[2]);
		float d=Float.parseFloat(args[3]);
		System.out.println("Sum:"+(a+b));
		System.out.println("Mul:"+(c*d));
		System.out.println("Div:"+(a/b));
		System.out.println("Sub:"+(c-d));
	}

}
