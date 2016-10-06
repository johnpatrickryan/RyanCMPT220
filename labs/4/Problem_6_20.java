import java.util.Scanner;

public class Problem_6_20{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String r = input.nextLine();

		system.out.println("The number of letters in the string is: " + countLetters(r));
	}

	public static int countLetters(String r){
		int letterCount = 0;
		for (int i = 0; i <r.length(); i++){
			if (isLetter(r.charAt(i))){
				countLetter++;
			}
		}
		return countLetter;
	}

	public static boolean isLetter( char ch){
		return ((ch <= 'z' && ch >= 'a') || (ch <= 'Z' && ch >= 'A'));
	}
}