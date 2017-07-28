package fr.tp3;

/** 
@author avlas
@version 1.0, 27/07/2017
*/

public class TestArray1 {

	public static void main(String[] args) {
		int[] intArray = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		listTable(intArray);
		
		listReverseTable(intArray);
		
		listGreaterThan3(intArray);
		
		listOfPairs(intArray);
		
		showMaximum(intArray);	
		
		showMinimum(intArray);		
	}

	// Array - list all elements
	private static void listTable(int[] intArray) {
		System.out.print ("All the elements of the table by means of a loop : ");
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + ", ");
		}
		
		System.out.println ("\n");
	}
	
	// Array - list of reversed table
	private static void listReverseTable(int[] intArray) {
		System.out.print ("All elements in reverse order of the array : ");
		
		for(int i = intArray.length-1; i >= 0 ; i--) {
			System.out.print(intArray[i] + ", ");
		}
		
		System.out.println ("\n");
	}
	
	// Array - list greater than 3
	private static void listGreaterThan3(int[] intArray) {
		System.out.print ("List of integers greater than 3 : ");
		
		for(int i = 0; i < intArray.length; i++) {
			if(intArray[i] > 3){
				System.out.print(intArray[i] + ", ");
			}
		}
		
		System.out.println ("\n");
	}
	
	// Array - list even integers
	private static void listOfPairs(int[] intArray) {
		System.out.print ("List of the even integers : ");
		
		for(int i = 0; i < intArray.length; i++) {
			if((intArray[i] % 2) == 0){
				System.out.print(intArray[i] + ", ");
			}
		}
		
		System.out.println ("\n");
	}
	
	// Array - list maximum
	private static void showMaximum(int[] intArray) {
		int max = 0;
		
		for(int i = 0; i < intArray.length; i++) {	
			if(max == 0) {
				max = intArray[i];
			} else {
				if(intArray[i] > max) {
					max = intArray[i];
				} 
			}
		}
		
		System.out.println("Biggest item in the table : "+ max + "\n");
	}
	
	// Array - list minimum
	private static void showMinimum(int[] intArray) {
		int min = 0;
		
		for(int i = 0; i < intArray.length; i++) {	
			if(min == 0) {
				min = intArray[i];
			} else {
				if(intArray[i] < min) {
					min = intArray[i];
				} 
			}
		}
		
		System.out.println("Smallest item in the table : "+ min + "\n");
	}
}
