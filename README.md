# Calcuate-Average
This program calulates average scores

##Project source can be download from https://github.com/iparker3964/Calcuate-Average.git

##Program Objective:

 Create a program that calculate the average scores. The program should allow the user to enter the amount of students we are going
 to do a calculation for and how many test scores for each student will be calculated. The output should be a list of the students name
 along with their average.
 
##Autor: Isaiah Parker

##How to run file
The program can be run from the command line prompt. 

##Sample Code
**Atributes**
```
double total[]={0};
double average=0;	
double testAmount = 0;
int numStudents;
int numScores;
```
**numStudents initialized by user**

Total number of students

```
System.out.println("Enter the number of students: ");
			if(!userInput.hasNextInt()){
				System.out.println("Invalid input!");
				System.exit(0);
		}
			else{
				numStudents= userInput.nextInt();
			
```
**numScores initialized by user**

Total Number of test scores 
  
```
	System.out.println("Enter the number of test scores per student: ");
			if(!userInput.hasNextInt()){
				System.out.println("Invalid input!");
				System.exit(0);
	}
			else{
				int numScores= userInput.nextInt();
```

**Initialze the Array with attributes value**

```
String[] studentNames = new String [numStudents];
int[] numPoints= new int [numScores];
String[] names = new String[numStudents];
float[][] studentScores = new float [numStudents][numScores];
```
**The nested for loop receives the value of the number of students and test scores**

```
for(int i = 0; i < studentNames.length; i++){
			System.out.println("Enter the name of the #"+(i+1)+" student: ");
			userInput.nextLine();
			names[i]= userInput.nextLine();
			for(int b = 0; b < numPoints.length; b++){
				System.out.println("Enter test score for the student #"+(i+1)+ "for test #"+ (b+1)+": ");
				if(!userInput.hasNextFloat()){
					System.out.println("invalid test score!");
				}
				else
				 studentScores[i][b] = userInput.nextFloat();
			}
```
**Prints out the average then sets it back to zero in order to calculate the next student average**

```
average = average / numScores;
			System.out.println(Math.round(average));
			System.out.println();
			average =0;
```





