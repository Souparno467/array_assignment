package com.example;
//Author Souparno
 class BestScore {
	public static int[] firstSecond(int[]array){//checks if length is less than 2 ,if there is 1 element then it will mark it as the first best and -1 as second best
		if (array.length<2){
			return new int[]{array[0],-1};
		}
		int firstBest,secondBest; //comparing two elements
		if (array[0]>array[1]){
			firstBest=array[0];
			secondBest=array[1];
		}else{
			firstBest=array[1];
			secondBest=array[0];
		}
		for(int i=2;i<array.length;i++){ //loop through rest of the array
			int score=array[i];
			if (score>firstBest){       //update based on current score
				secondBest=firstBest;
				firstBest=score;
			}else if (score>secondBest&&score<firstBest){
				secondBest=score;
			}
		}
		return new int[]{firstBest,secondBest}; // returns both scores
	}
	public static void printBestScores(int[]r){ //method to print first and second best scores
		System.out.println("First and Second best scores are :");
        for (int score : r) {
            System.out.print(score + " ");
		}
	}
	public static void main(String[]args){// main method and calls print method
		int[] myArray={84,85,86,87,85,90,85,83,23,45,84,1,2,0};
		int[]r=firstSecond(myArray);
		printBestScores(r);
	}
}
