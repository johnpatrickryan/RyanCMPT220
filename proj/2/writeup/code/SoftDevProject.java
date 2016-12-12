/**
*Written by John Ryan
*Professor Rivas-Perea
*Due 12/9/16
*Abstract: The point of this program is to allow the user to create their own
*password within their own parameters. They can make it as long as they want
*and choose to have whatever they want in the password, all while randomly
*arranging the password.
*/
import java.util.Scanner;
import java.util.*;

public class SoftDevProject{

	public static void main(String[] args){
	
		try{
	  
	    Scanner Input = new Scanner(System.in);

			System.out.println("How many characters would you like the password to be? "
				+"It must be more than 3 characters and less than 20");
			int noc = Input.nextInt();
			//noc = number of characters
			//User puts in number of digits in password

			System.out.println("How many numbers would you like in the password?");
			int nip = Input.nextInt();
			//nip = numbers in password
			//User puts in amount of numbers

			System.out.println("How many letters would you like in the password?");
			int lip = Input.nextInt();
			//lip = letters in password
			//User puts in amount of letters

			System.out.println("How many symbols would you like in the password?");
			int sip = Input.nextInt();
			//sip = symbols in password
			//User puts in amount of symbols
		

			int[] intArray = new int[] {0,1,2,3,4,5,6,7,8,9};
			char[] charArray = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l',
				'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			char[] symArray = new char[] {'!','@','#','$','%','&','*','+','='};
			//Three arrays with numbers, letters, and symbols
			char[] newintArray = new char[nip];
			char[] newcharArray = new char[lip];
			char[] newsymArray = new char[sip];
			//Three arrays with the random numbers, letters, and symbols based on index numbers

			if (noc < 3 || noc > 20){
				System.out.print("The number of characters must be more than 3 and less than 20");
			}
			//Prevents too many or too little password length

			else if (nip + lip + sip != noc){
				System.out.print("You must make sure number of characters equals the sum of "
				 +"numbers, letters, and symbols");
			}
			//Prevents the total of the three elements not equaling the number of
			// digits in the password

			else if (nip < 0 || lip < 0 || sip < 0){
				System.out.print("The number of letters, symbols, and numbers cannot be less "
					+"than 0");
			}
			//Prevents the inputs from being less than 0

			else{
				int[] numin = new int[nip];
				int[] letin = new int[lip];
				int[] symin = new int[sip];	
				//Three arrays with the index numbers

				for (int n = 0; n < nip; n++){
					numin[n] = (int)(Math.random() *  10);
					newintArray[n] = Character.forDigit(intArray[numin[n]],10);
				}
				//Creates random index numbers 0-9, then creates a new array containing the numbers
				//based on the index numbers

				for (int l = 0; l < lip; l++){
					letin[l] = (int)(Math.random() * 26);
					newcharArray[l] = charArray[letin[l]];
				}
				//Creates random index numbers 0-25, then creates a new array containing the letters
				//based on the index numbers

				for (int s = 0; s < sip; s++){
					symin[s] = (int)(Math.random() * 9);
					newsymArray[s] = symArray[symin[s]];
				}
				//Creates random index numbers 0-8, then creates a new array containing the symbols
				//based on the index numbers

				int totalLength = nip + lip + sip;
				int count = 0;
				char[] passwordArray = new char[totalLength];

				for(int i = 0; i < newintArray.length; i++){
					passwordArray[i] = newintArray[i];
					count++;
				}
				//Adds the random numbers to a new array

				for(int i = 0; i < newsymArray.length; i++){
					passwordArray[count] = newsymArray[i];
					count++;
				}
				//Adds the random symbols to the same array

				for(int i = 0; i < newcharArray.length; i++){
					passwordArray[count] = newcharArray[i];
					count++;
				}
				//Adds the random letters to the same array
				
				for(int i = 0; i < (passwordArray.length * 2); i++){
					int rand1 = (int)(Math.random() * passwordArray.length);
					int rand2 = (int)(Math.random() * passwordArray.length);
					char temp = passwordArray[rand1];
					passwordArray[rand1] = passwordArray[rand2];
					passwordArray[rand2] = (char)(temp);
					}
				//Method to switch two index numbers based on two randomly generated numbers
				//Ensures that the final password is truly random and not in any order

				for(int i = 0; i < passwordArray.length; i++){
				  System.out.print(passwordArray[i]);
				}
				//Prints out the final randomized array

			}
		}
		catch (InputMismatchException e){
			System.out.print("You must enter a number");
		} 
		//Prevents the user from experiencing an error message if they enter anything
		//other than a number in the inputs

	}
}
