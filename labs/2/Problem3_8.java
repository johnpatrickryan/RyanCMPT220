/*
*John Ryan
*RYANCMPT220
*Prof Rivas
*/


import java.util.Scanner;

public class Problem3_8 {

	public static void main(String[] strings){
		Scanner Input = new Scanner(System.in);
		int number1;
		int number2;
		int number3;
		int temp;


		System.out.print("Enter three integers: ");
		number1 = Input.nextInt();
		number2 = Input.nextInt();
		number3 = Input.nextInt();

		if (number1 > number2){
			temp = number1;
			number1 = number2;
			number2 = temp;
		}

		if (number2 > number3){
			temp = number2;
			number2 = number3;
			number3 = temp;
		}

		if (number1 > number2){
			temp = number1;
			number1 = number2;
			number2 = temp;
		}

		System.out.println("Sorted numbers: "+ number1 + number2 + number3);
	}
}