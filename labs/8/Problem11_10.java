

/**
*Jack Ryan
*CMPT 220
*Problem 11.10
*November 3
*/
import java.util.ArrayList;
import java.util.Scanner;
public class problem11_10 {
	public static void main(String[] args) {

		MyStack stack = new MyStack();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 5 strings: ");
		for (int i = 0; i < 5; i++) stack.push(input.next());

		System.out.println("In reverse order:");
	while (stack.size() > 0) {
		System.out.println(stack.pop());
	    }
    }
}