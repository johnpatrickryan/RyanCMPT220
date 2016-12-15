/*
*John Ryan
*CMPT220
*Professor Rivas
*/

public class Exercise7_18 {

	public static void main(String[] args){

		double[] number = new double[100];

		for (int i = 0; i < number.length; i ++){
			number[i] = Math.random() * 200;
		}
		bubbleSort(number);
		printArray(number, 10);
	}

	public static void printArray(double[] array, int numberPerLine){

		for (int i= 0; i < array.length; i++){
			System.out.printf("%4.0f ", array[i]);
			if ((i + 1) % numberPerLine == 0) System.out.println("");
		}
	}

	public static void bubbleSort(double[] numbers){
		
		boolean change;
		do{
			change = false;
			for (int i = 0; i < numbers.length - 1; i ++){
				if (numbers[i] > numbers [i + 1]){
					double temp = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = (int)temp;
					change = true;
				}
			}
		}
		while (change);
	}
}