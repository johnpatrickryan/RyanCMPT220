/* 
*John Ryan
*CMPT 220
*Programming lab 2
*/


import java.util.Scanner;
public class programming {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the following as a percentage...");
	  System.out.print("midterm exam: ");		
	  double midgrade = input.nextInt();
	  System.out.print("final exam: ");		
	  double fingrade = input.nextInt();
	  System.out.print("projects: ");		
	  double projgrade = input.nextInt();
	  System.out.print("hw and labs: ");		
	  double labgrade = input.nextInt();

	  double midper = midgrade * .2;
	  double finper = fingrade * .2;
	  double projper = projgrade * .2;
	  double labper = labgrade * .4;

	  double classgrade = (midper + finper + projper + labper);

	  if (classgrade < 101 || classgrade >= 95){
	  	System.out.print("Your final grade is: A");
	  }

	  else if (classgrade < 95 || classgrade >= 90){
	  	System.out.print("Your final grade is: A-");
	  }

	  else if (classgrade < 90 || classgrade >= 87){
	  	System.out.print("Your final grade is: B+");
	  }

  	else if (classgrade < 87 || classgrade >= 83){
	  	System.out.print("Your final grade is: B");
	  }
	  else if (classgrade < 83 || classgrade >= 80){
	  	System.out.print("Your final grade is: B-");
	  }
	  else if (classgrade < 80 || classgrade >= 77){
	  	System.out.print("Your final grade is: C+");
	  }
	  else if (classgrade < 77 || classgrade >= 73){
	  	System.out.print("Your final grade is: C");
	  }
	  else if (classgrade < 73 || classgrade >= 70){
	  	System.out.print("Your final grade is: C-");
	  }
	  else if (classgrade < 70 || classgrade >= 65){
	  	System.out.print("Your final grade is: D");
	  }
	  else if (classgrade < 65 || classgrade >= 0){
	  	System.out.print("Your final grade is: F");
	  }
	}
}