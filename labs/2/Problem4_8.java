/*
*John Ryan
*CMPT200
*Prof Rivas
*/

import java.util.Scanner;

public class Problem4_8 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter an ASCII code (0-127): ");
    int number = input.nextInt();

    System.out.println("The character for ASCII code " + number + " is " + (char) number);
  }
}