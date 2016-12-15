import ToolKit.BMI;
public class Problem10_2 {

	public static void main(String[] args){

		BMI p = new BMI("Ryan", 20, 250, 6, 3);
		System.out.printf("Name: %s Age: %d Weight: %.2f Feet: %.2f Inches: %.2f\n",
							p.getName(), p.getAge(), p.getWeight(), p.getFeet(), p.getInches());
	}
}