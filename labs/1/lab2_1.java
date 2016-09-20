// == missing header
import java.util.Scanner;

public class lab2_1{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);      
 
    System.out.println("Enter temperature in Celsius");
    double celsius = input.nextDouble();
 
    double fahrenheit = (((9.0/5.0)* celsius) + 32.0);
 
    System.out.println(" fahrenheit "+ fahrenheit +" is " + celsius + " in celsius ");
  }
}
