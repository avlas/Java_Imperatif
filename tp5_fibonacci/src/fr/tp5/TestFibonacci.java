package fr.tp5;
import java.util.Scanner;

public class TestFibonacci {

	public static void main(String[] args) {
		System.out.println("Please give a limit for Fibonacci serie :");

		Scanner in = new Scanner(System.in);		
		while ( !in.hasNextInt() ) {
			System.out.println("Please give an integer : ");
			in.nextLine();					
		}

		int userLimit = in.nextInt();	

		while ( userLimit < 0 )  {
			System.out.println("Please give a positive integer : ");
			in.nextLine();	

			userLimit = in.nextInt();			
		}

		iterativeFibonacci_3Variables (userLimit);
		iterativeFibonacci_2Variables (userLimit);
		recursiveFibonacci (userLimit);

	}

	private static void iterativeFibonacci_3Variables (int userLimit) {
		int previous = 0;
		int next = 1;		
		int result = 0;

		System.out.println("Iterative Fibonacci using 3 variables : ");		
		
		for (int count = 1; count < userLimit; count++) {	
			result = previous + next;
			if (result == 1) {		
				System.out.print(result + " ");
			} 
			System.out.print(result + " ");

			previous = next;
			next = result;	
		}
		System.out.println("\n");		
	}

	private static void iterativeFibonacci_2Variables (int userLimit) {
		int previous = 0;
		int next = 1;
		
		System.out.println("Iterative Fibonacci using 2 variables : ");	
		
		while ( previous <= userLimit) {
			previous = previous + next;
			System.out.print(next + " ");
			System.out.print(previous + " ");
			next = previous + next;
		}
		System.out.println("\n");	
	}

	private static void recursiveFibonacci (int userLimit) {
		int index = 1;
		
		System.out.println("Recursive Fibonacci : ");	
		while (index <= userLimit) {
			System.out.print ( fibonacci(index) + " " );
			index++;
		}
		System.out.println("\n");
	}
	
	private static int fibonacci (int i) {
		if (i<= 2) return 1;
		return fibonacci(i - 1) + fibonacci(i - 2);
	}
}
