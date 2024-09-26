import java.util.Scanner;

public class Vote {

	public static void main(String[] args) 
	{
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the age of the voter");
		n=sc.nextInt();
		if(n>=18)
		{
			System.out.println("You are eligible to vote");
			
		}
		else
		{
			System.out.println("You are not eligible to vote");
		}

	}

}
