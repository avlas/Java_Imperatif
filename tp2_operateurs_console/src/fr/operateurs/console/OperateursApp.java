package fr.operateurs.console;
import java.util.Scanner;

/** 
@author avlas
@version 1.0, 27/07/2017
*/

public class OperateursApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		if(in != null) {
			System.out.print("***** Application Operateurs ***** \nPlease enter the first number : ");
			int firstNumber = in.nextInt();
	
			System.out.print("Please enter the second number : ");		
			int secondNumber = in.nextInt();
				
			System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
			System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
			System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
			System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
			System.out.println(firstNumber + " % " + secondNumber + " = " + (firstNumber % secondNumber));
			
			in.close();
		}
	}
}
