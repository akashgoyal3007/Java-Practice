import java.util.Scanner;
public class leapyear 
				{
				public static void main(String[] args) 
				{
		        Scanner scanner = new Scanner(System.in);

		        // Input year
		        System.out.print("Enter a year: ");
		        int year = scanner.nextInt();

		        // Check if leap year
		        boolean isLeap = false;

		        if (year % 4 == 0) {
		            if (year % 100 != 0 || year % 400 == 0) 
		            {
		                isLeap = true;
		            }
		        }

		        // Output result
		        if (isLeap) 
		        {
		            System.out.println(year + " is a leap year.");
		        } 
		        else 
		        {
		            System.out.println(year + " is not a leap year.");
		        }
		        

		    }
		


	}


