/*
*John Ryan
*CMPT220
*Prof Rivas
*/


import java.util.Scanner;
public class Problem4_5 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of sides: ");
    double numOfSides = input.nextDouble();
    System.out.print("Enter the side: ");
    double length = input.nextDouble();


    double area = (numOfSides * length * length) / (4.0 * Math.tan(Math.PI / numOfSides));
    System.out.print("The area of the polygon is " + area);
  }
}