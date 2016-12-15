/*
*John Ryan
*CMPT220
*Prof Rivas
*/


import java.util.Scanner;

public class Problem3_11 {
  public static void main(String[] strings) {

    Scanner input = new Scanner(System.in);

    int numberOfDaysInMonth = 0;
    String nameOfMonth = "";

    System.out.print("Enter a month number: ");
    int month = input.nextInt();


    switch (month) {
      case 1:
        nameOfMonth = "January";
        numberOfDaysInMonth = 31;
        break;
      case 2:
        nameOfMonth = "February";
        numberOfDaysInMonth = 28;
        break;
      case 3:
        nameOfMonth = "March";
        numberOfDaysInMonth = 31;
        break;
      case 4:
        nameOfMonth = "April";
        numberOfDaysInMonth = 30;
        break;
      case 5:
        nameOfMonth = "May";
        numberOfDaysInMonth = 31;
        break;
      case 6:
        nameOfMonth = "June";
        numberOfDaysInMonth = 30;
        break;
      case 7:
        nameOfMonth = "July";
        numberOfDaysInMonth = 31;
        break;
      case 8:
        nameOfMonth = "August";
        numberOfDaysInMonth = 31;
        break;
      case 9:
        nameOfMonth = "September";
        numberOfDaysInMonth = 30;
        break;
      case 10:
        nameOfMonth = "October";
        numberOfDaysInMonth = 31;
        break;
      case 11:
        nameOfMonth = "November";
        numberOfDaysInMonth = 30;
        break;
      case 12:
        nameOfMonth = "December";
        numberOfDaysInMonth = 31;
    }
    System.out.print(nameOfMonth + " has " + numberOfDaysInMonth + " days");
  }
}