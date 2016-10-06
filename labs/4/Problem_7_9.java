import java.util.Scanner;

public class Problem_7_9{
	static final int num = 10;
	public static void main(String[] args){

		double[] a = new double[num];
		Scanner input = new Scanner(System.in);

		System.out.print("Enter " + num + " numbers: ");
		for (int s = 0; s < a.length; s++) a[s] = input.nextDouble();

		System.out.println("The smallest number is: " + min(a));
	}

	public static double min(double[] array){
		double min = array[0];
		for (int s = 0; s < array.length; s++){

			if (min > array[s]) min = array[s];
		}

		return min;
	}
}