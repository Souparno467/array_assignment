package com.example;
//Author Souparno
 class Question2 {
	public static int sumDiagonalElements(int[]array, int rows,int cols){//method to calculate diagonal elements
		int sum=0;
		for (int i=0;i< rows;i++){ //loop through rows and adds diagonal elements(i,i) to the sum
			if(i<cols){ 
				sum+= array[i*cols+i];//diagonal element at (i,i)
			}
		}
		return sum;
	}
	public static void main(String[]args){//main method
		int[] myArray2D={1,2,3,4,5,6};//representing 2x3 matrix
		System.out.println("Sum of diagonal elements:"+sumDiagonalElements(myArray2D,2,3));
	}

}
