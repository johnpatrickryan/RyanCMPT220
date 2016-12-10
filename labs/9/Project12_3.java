import java.util.Scanner;

public class Problem12_3 {

	public static void main(String[] args){

		int[] array1 = new int[100];

		for (int i = 0; i < array1.length; i++){
			array1[i] = (int) (Math.random() * 100);

		}

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an index: ");
		int indexnum = input.nextInt();

		try{
			System.out.println("Using an index number of " + indexnum + 
				", the corresponding number is "+ array1[indexnum]);
		}

		catch (IndexOutOfBoundsException e){
			System.out.println("Out of bounds");
		}
	

		
	}
}