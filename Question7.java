package com.example;
//Author Souparno
 class Question7 {
	 public static void main(String[] args) {
	        
	        double[] arr = {1.2, 2.4, 3.5, 4.5, 5.6};
	        
	        // Call the method to process the arrays and calculate the sum
	        reverseSumArrays(arr);
	    }
	 static void reverseSumArrays(double[] arr) {
	        //  array to store the reversed array
	        double[] reversedArray = new double[arr.length];

	        // Reverse the array
	        for (int i = 0; i < arr.length; i++) {
	            reversedArray[i] = arr[arr.length - 1 - i];
	        }

	        // Calculate and print the sum of both arrays' elements
	        double sum = 0;
	        
	        System.out.println("Original Array: "+"\n--------------------");
	        for (double num : arr) {
	            System.out.print(num + " ");
	        }

	        System.out.println("\nReversed Array: "+"\n--------------------");
	        for (double num : reversedArray) {
	            System.out.print(num + " ");
	        }

	        // To Calculate the sum of  elements in both arrays
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i] + reversedArray[i];
	        }

	        System.out.println("\n------------------"+"\nSum of elements of two arrays is:- " + sum);
	    }
	 
	 
	 
}
