
public class argssum {

	public static void main(String[] args) {
		System.out.println("Arguments" +args[0]+args[1]+args[2]+args[3]+args[4]);
		
		double sum=0.0;
		for(int i=0;i<5;i++)
		{
			sum+=Double.parseDouble(args[i]);
			System.out.println("The sum of the values is"+sum);
		}
		

	}

}
