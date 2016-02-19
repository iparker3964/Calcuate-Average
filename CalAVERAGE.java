/**
*
*
*this program calulates average scores
*
* @ author: Isaiah Parker
*/

import java.util.Scanner;
public class CalAVERAGE {
	
		public static void main(String [] args){
		double total[]={0};
		double average=0;	
		double testAmount = 0;
		int numStudents;
		Scanner userInput = new Scanner(System.in);

		System.out.println("Grade Average Calculator");
		System.out.println();
		System.out.println("Enter the number of students: ");
			if(!userInput.hasNextInt()){
				System.out.println("Invalid input!");
				System.exit(0);
		}
			else{
				numStudents= userInput.nextInt();
			
		
		System.out.println("Enter the number of test scores per student: ");
			if(!userInput.hasNextInt()){
				System.out.println("Invalid input!");
				System.exit(0);
	}
			else{
				int numScores= userInput.nextInt();
		// intialize arrays
		String[] studentNames = new String [numStudents];
		int[] numPoints= new int [numScores];
		String[] names = new String[numStudents];
		float[][] studentScores = new float [numStudents][numScores];
		// loop receives names and scores
		for(int i = 0; i < studentNames.length; i++){
			System.out.println("Enter the name of the #"+(i+1)+" student: ");
			userInput.nextLine();
			names[i]= userInput.nextLine();
			// userInput.nextLine();
			for(int b = 0; b < numPoints.length; b++){
				System.out.println("Enter test score for the student #"+(i+1)+ "for test #"+ (b+1)+": ");
				if(!userInput.hasNextFloat()){
					System.out.println("invalid test score!");
				}
				else
				 studentScores[i][b] = userInput.nextFloat();
				//userInput.nextDouble();
				//total[b]+= test;
				//testAmount = test;
			}
			//average = testAmount / numScores;
			//System.out.println(average);
		}
		System.out.println("Averages for Each Student: ");
		for(int i =0; i< studentNames.length; i++){
			System.out.print(names[i] + ": ");
			for(int b=0; b <numPoints.length; b++){
				average += studentScores[i][b];
			}
			average = average / numScores;
			System.out.println(Math.round(average));
			System.out.println();
			average =0;
		}
		//average = average / numScores;
		//System.out.println(Math.round(average);
		}
			}
		}
}






