package fr.tp3;

/** 
@author avlas
@version 1.0, 27/07/2017
*/

public class TestArray2 {

	public static void main(String[] args) {
		int[] intArray = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		calculateAverage(intArray);
		
		getElementIndex(intArray, 15);
		
		calculateDuplicates(intArray, 7);
	}

	// Array - average
	private static void calculateAverage(int[] intArray) {
		int average = 0;
		int sum = 0;

		for(int i = 0; i < intArray.length; i++) {
			sum += intArray[i];			
		}
	
		average = sum / intArray.length;
		System.out.println ("The average of the elements of the table : " + average + "\n");
	}

	// Array - index of an element 
	private static void getElementIndex(int[] intArray, int element) {
		int index = 0;

		for(int i = 0; i < intArray.length; i++) {
			if(intArray[i] == element) { 
				index = i;
			}			
		}
		
		System.out.println ("The index in the array of the element " + element + " : " + index + "\n");
	}
	
	// Array - algorithm to find the number of duplicate integers in the array
	private static void calculateDuplicates (int[] intArray, int nbToCheck) {
		int nbDuplicates = 0;

		//for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray.length; j++) {
				if(nbToCheck == intArray[j]) { 
					nbDuplicates++;
				}		
		//	}	
		}
		System.out.println("Number of duplicated integers in the array : " + nbDuplicates + "\n");
	}
}
