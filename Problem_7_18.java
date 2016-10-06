public class Problem_7_18{

	public static void main(String[] args){

		double[] num = new double[100];

		for (int o = 0; o < num.length; o++){
			num[o] = Math.random() * 200;
		}
		bubbleSort(num);
		printArray(num, 10);
	}

	public static void printArray(double[] array, int numPer){
		for (int o = 0; o < array.length; o++ ){

			System.out.printf("%4.0f ", array[o]);
			if ((o + 1) % numPer == 0) System.out.println(" ");
		}
	}
	public static void bubbleSort(double[] num){

		boolean change;
		do{
			change = false;
			for (int o = 0; o < num.length -1; o++){

				if (num[0] > num[o + 1]){
					double con = num[o];
					num[o] = num[o + 1];
					num[o + 1] = con;
					change = true;
				}
			}
		} while (change);
	}
}