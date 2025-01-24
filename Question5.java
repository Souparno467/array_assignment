package com.example;
//Author Souparno
 class Student {
	  static void updateMarks(int rollNo, String certification, int[] rolls, String[] names, double[] marks) {
	        // Using a switch-case to update marks based on the certification
	        for (int i = 0; i < rolls.length; i++) {
	            if (rolls[i] == rollNo) {
	                switch (certification) {
	                    case "OCJP":
	                        marks[i] += 90;
	                        break;
	                    case "OCA":
	                        marks[i] += 80;
	                        break;
	                    case "MCSA":
	                        marks[i] += 77;
	                        break;
	                    case "GCP":
	                        marks[i] += 92;
	                        break;
	                    default:
	                        System.out.println("Invalid certification.");
	                        return;
	                }
	                System.out.println("Marks updated successfully for " + names[i]);
	                System.out.println("New marks: " + marks[i]);
	                return;
	            }
	        }
	        System.out.println("Student with roll number " + rollNo + " not found.");
	    }
	   static void displayStudentDetails(int[] rolls, String[] names, double[] marks, int rollNo, String certification) {
	        // Display the  details of students
	        System.out.println("Initial Student Details:");
	        System.out.println("--------------------------");
	        for (int i = 0; i < rolls.length; i++) {
	            System.out.println("Roll: " + rolls[i] + ", Name: " + names[i] + ", Marks: " + marks[i]);
	        }

	        //  method to update marks based on the certification
	        updateMarks(rollNo, certification, rolls, names, marks);

	        // Display the updated details of students
	        System.out.println("\nUpdated Student Details:");
	        System.out.println("----------------------------");
	        for (int i = 0; i < rolls.length; i++) {
	            System.out.println("Roll: " + rolls[i] + ", Name: " + names[i] + ", Marks: " + marks[i]);
	        }
	  }
	   
	        public static void main(String[] args) {
	            // Creating arrays for student data (roll, name, and marks)
	            int[] rolls = {1, 2, 3};
	            String[] names = {"Souparno", "Ankan", "Aditya"};
	            double[] marks = {70, 80, 85};

	            //  providing roll number and certification type for updating marks
	            int rollNo = 1; //  roll number
	            String certification = "MCSA"; //  certification

	            // Calling the method to display details and update marks
	            displayStudentDetails(rolls, names, marks, rollNo, certification);
	        }
	  
	  
	  

}
