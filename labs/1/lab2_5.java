// == missing header
import java.util.Scanner;

public class lab1_pt2{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);      
 
    System.out.println("Please enter the following as a percentage");
	
    // == you are using tabs!!
	System.out.println("Midterm Exam");
    double midterm = input.nextDouble();
 
    System.out.println("Final Exam");
    double final = input.nextDouble();
	
	System.out.println("Projects");
    double projects = input.nextDouble();
	
	System.out.println("Homework and Labs");
    double homework = input.nextDouble();
	
	double finalGrade = ((midterm / 20) + (final / 20) + (projects / 20) + (homework/40));
	
	if (midterm <= 100 && midterm >= 0 && final <= 100 && final >= 0 && projects <= 100 && projects >= 0 && homework <= 100 && homework >= 0 &&){
		System.out.println("Your final grade is: " + finalGrade +"%");
	}
	else {
		System.out.println("Your grade from each section may not exceed 100 or be below 0")
	}
 
    
  }
}
