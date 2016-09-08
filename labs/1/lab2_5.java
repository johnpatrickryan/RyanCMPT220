import java.util.Scanner;

public class lab2_5{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);      
 
    System.out.println("Enter Subtotal");
    double subtotal = input.nextDouble();
 
    System.out.println("Enter gratuity rate without the % symbol");
	double gratuity =input.nextDouble();
	
	double subgratuity = (subtotal*(gratuity/100));
	
	double total = (subgratuity + subtotal);
	

 
    System.out.println(" If the subtotal is $"+ subtotal +" and the gratuity rate is  " + gratuity + "%, the tip would be $" + subgratuity + " and your total would be $" + total);
  }
}