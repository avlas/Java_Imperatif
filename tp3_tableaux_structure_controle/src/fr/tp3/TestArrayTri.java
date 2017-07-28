package fr.tp3;

import java.util.Arrays;

/** 
@author avlas
@version 1.0, 27/07/2017
*/

public class TestArrayTri {

	public static void main(String[] args) {
		int[] intArray = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		// Sort - imperative
		sortArray(intArray);
		
		// Sort - using objects
		Arrays.sort(intArray);
		System.out.println("\n Ascending sort of the table using methode : " + Arrays.toString(intArray));
		
	}
	
	// Array - sort imperative
	public static void sortArray(int[] nonSortedArray) {
	    int[] sortedArray = new int[nonSortedArray.length];
	    int temp;
	    
	    for (int i = 0; i < nonSortedArray.length-1; i++) {
	        for (int j = i + 1; j < nonSortedArray.length; j++) {
	            if (nonSortedArray[i] > nonSortedArray[j]) {
	                temp = nonSortedArray[i];
	                nonSortedArray[i] = nonSortedArray[j];
	                nonSortedArray[j] = temp;
	                sortedArray = nonSortedArray;
	            }
	        }
	    }

		System.out.print("Ascending sort of the table using algorithm : ");
		for(int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + ", ");
		}
	}
}
