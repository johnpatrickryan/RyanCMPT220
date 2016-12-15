/**
*Jack Ryan
*CMPT 220
*Chapter 3 Ex 4
*/

import java.util.Scanner;

public class Problem3_4{

	public static void main(String[] strings){

		int randomMonth = (int) (Math.random() * 12) + 1;

		for (int i = 0; i < 1000; i++){
			int randomMonth2 = (int) (Math.random() * 12) + 1;
			System.out.println(getMonthName(randomMonth2) + " " + randomMonth2);
		}

		System.out.println(getMonthName(randomMonth));
	}

	public static String getMonthName(int month){
		String monthName = "";
    switch (month) {
      case 1: monthName = "January"; break;
      case 2: monthName = "February"; break;
      case 3: monthName = "March"; break;
      case 4: monthName = "April"; break;
      case 5: monthName = "May"; break;
      case 6: monthName = "June"; break;
      case 7: monthName = "July"; break;
      case 8: monthName = "August"; break;
      case 9: monthName = "September"; break;
      case 10: monthName = "October"; break;
      case 11: monthName = "November"; break;
      case 12: monthName = "December"; break;

      default:
        monthName = "INVALID MONTH RANGE";
    }
  	return monthName;
	}
}