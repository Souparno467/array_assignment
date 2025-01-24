package com.example;
//Author Souparno
 class InToString {
	 static int[] arr= {1,2,3,4,5};
	 static String[] stringArray=new String[arr.length];
	 public static void main(String[]args) {
		 String[] result=convert(arr);
		 display(result);
	 }
static String[] convert(int[]arr) {
	for (int i=0;i<arr.length;i++) {
		stringArray[i]=String.valueOf(arr[i]);
		
	}
	return stringArray;
}
static void display(String[]args) {
	for(String x:args) {
		System.out.print(x+" ");
	}
}
}
