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

		System.out.println("How many numbers would you like in the password?");
		int nip = Input.nextInt();
		//nip = numbers in password

		System.out.println("How many letters would you like in the password?");
		int lip = Input.nextInt();
		//lip = letters in password

		System.out.println("How many symbols would you like in the password?");
		int sip = Input.nextInt();
		//sip = symbols in password
	

		int[] intArray = new int[] {0,1,2,3,4,5,6,7,8,9};
		char[] charArray = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] symArray = new char[] {'!','@','#','$','%','&','*','+','='};
		char[] newintArray = new char[nip];
		char[] newcharArray = new char[lip];
		char[] newsymArray = new char[sip];

		if (noc < 3 || noc > 20){
			System.out.print("The number of characters must be more than 3 and less than 20");
		}

		else if (nip + lip + sip != noc){
			System.out.print("You must make sure number of characters equals the sum of "
			 +"numbers, letters, and symbols");
		}

		else if (nip < 0 || lip < 0 || sip < 0){
			System.out.print("The number of letters, symbols, and numbers cannot be less "
				+"than 0");
		}

		else{
		int[] numin = new int[nip];
		int[] letin = new int[lip];
		int[] symin = new int[sip];	
		for (int n = 0; n < nip; n++){
			numin[n] = (int)(Math.random() *  10);
			newintArray[n] = Character.forDigit(intArray[numin[n]],10);
		}

		for (int l = 0; l < lip; l++){
			letin[l] = (int)(Math.random() * 26);
			newcharArray[l] = charArray[letin[l]];
		}

		for (int s = 0; s < sip; s++){
			symin[s] = (int)(Math.random() * 9);
			newsymArray[s] = symArray[symin[s]];
		}

		int totalLength = nip + lip + sip;
		int count = 0;
		char[] passwordArray = new char[totalLength];

		for(int i = 0; i < newintArray.length; i++){
			passwordArray[i] = newintArray[i];
			count++;
		}

		for(int i = 0; i < newsymArray.length; i++){
			passwordArray[count] = newsymArray[i];
			count++;
		}

		for(int i = 0; i < newcharArray.length; i++){
			passwordArray[count] = newcharArray[i];
			count++;
		}
		

			for(int i = 0; i < (passwordArray.length * 2); i++){
				int rand1 = (int)(Math.random() * passwordArray.length);
				int rand2 = (int)(Math.random() * passwordArray.length);
				char temp = passwordArray[rand1];
				passwordArray[rand1] = passwordArray[rand2];
				passwordArray[rand2] = (char)(temp);


			}
			for(int i = 0; i < passwordArray.length; i++){
			System.out.print(passwordArray[i]);
			}

		}
	}
		catch (InputMismatchException e){
		System.out.print("You must enter a number");
	} 

	}
}
