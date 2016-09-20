// == missing header
import java.util.Scanner;

public class lab2_6{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  
	
    System.out.println("Type an integer anywhere between 0 and 1000:");
    int inputNumber = input.nextInt();
    // == you are using tabs!!
	if (inputNumber < 1000 && inputNumber > 0){
	
	int first = (inputNumber % 10);
	int second = ((inputNumber / 10) %10);
	int third = ((inputNumber/ 100) %10);
	int sum = (first + second + third);
	
	System.out.println("The total of all of the digits from your input is: " + sum);
	}
	else {
		System.out.println("Your number was not within the bounds given");
	}
  }
}
