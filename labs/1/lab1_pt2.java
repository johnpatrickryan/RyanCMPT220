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
    double finalex = input.nextDouble();
	
	System.out.println("Projects");
    double projects = input.nextDouble();
	
	System.out.println("Homework and Labs");
    double homework = input.nextDouble();
	
	double finalGrade = ((midterm * 0.2) + (finalex * 0.2) + (projects * 0.2) + (homework * 0.4));
	
	System.out.println("Your final grade is: " + finalGrade +"%");
 
    
  }
}
