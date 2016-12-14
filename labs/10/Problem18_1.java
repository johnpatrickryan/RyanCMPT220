import java.math.BigInteger;
import java.util.Scanner;

public class Problem18_1 {

    public static void main(String[] args) {

        System.out.print("Enter an integer: ");
        int n = new Scanner(System.in).nextInt();

        System.out.println("It's factorial is: " + factorial(new BigInteger(n+"")));
    }

    private static BigInteger factorial(BigInteger n) {
        if (n.compareTo(BigInteger.ONE) == 0)
            return BigInteger.ONE;
        else
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));

    }
}