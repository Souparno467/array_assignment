package com.example;
//Author Souparno
 class Question1 {
	 public static int[]middle(int[]array){
			if (array.length<=2){
				return new int[0];     //returns empty array if length is less than or equals to 2
			}
				int[] result= new int[array.length-2];//Array having middle
				for(int i=1;i<array.length-1;i++){    //loop from second element to second last element
					result[i-1]=array[i];//shifts middle elements to new array result
				}
				return result;
			}
		public static void printArray(int[]array){
			for(int r:array){
				System.out.print(r +" ");    //prints elements sidewise with space
			}
		}
		public static void main(String[]args){   //Main method
			int[] myArray={1,2,3,4};
			int[]result=middle(myArray);
			printArray(result);//Prints the middle elements
		}
	}

