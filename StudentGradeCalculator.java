package Calculator;
import java.util.Scanner;

public class StudentGradeCalculator {
	


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input number of subjects
	        System.out.print("Enter the number of subjects: ");
	        int numSubjects = scanner.nextInt();

	        // Array to store marks
	        int[] marks = new int[numSubjects];

	        // Input marks
	        for (int i = 0; i < numSubjects; i++) {
	            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
	            marks[i] = scanner.nextInt();
	        }

	        // Calculate total marks
	        int totalMarks = calculateTotalMarks(marks);

	        // Calculate average percentage
	        double averagePercentage = calculateAveragePercentage(totalMarks, numSubjects);

	        // Determine grade
	        char grade = determineGrade(averagePercentage);

	        // Display results
	        displayResults(totalMarks, averagePercentage, grade);

	        scanner.close();
	    }

	    // Method to calculate total marks
	    private static int calculateTotalMarks(int[] marks) {
	        int total = 0;
	        for (int mark : marks) {
	            total += mark;
	        }
	        return total;
	    }

	    // Method to calculate average percentage
	    private static double calculateAveragePercentage(int totalMarks, int numSubjects) {
	        return (totalMarks / (double) (numSubjects * 100)) * 100;
	    }

	    // Method to determine grade based on average percentage
	    private static char determineGrade(double averagePercentage) {
	        if (averagePercentage >= 90) {
	            return 'A';
	        } else if (averagePercentage >= 80) {
	            return 'B';
	        } else if (averagePercentage >= 70) {
	            return 'C';
	        } else if (averagePercentage >= 60) {
	            return 'D';
	        } else {
	            return 'F';
	        }
	    }

	    // Method to display the results
	    private static void displayResults(int totalMarks, double averagePercentage, char grade) {
	        System.out.println("\nResults:");
	        System.out.println("Total Marks: " + totalMarks);
	        System.out.printf("Average Percentage: %.2f%%%n", averagePercentage);
	        System.out.println("Grade: " + grade);
	    }
	}

