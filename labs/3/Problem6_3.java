/*
*John Ryan
*CMPT220
*Prof Rivas
*/

public class Problem6_3 {

  public static void main(String[] args) {

    System.out.printf("%-12s%8s\n", "Kilograms", "Pounds");

    for (int i = 1; i < 200; i++) {
      System.out.printf("%-12d%8.1f\n", i, i * 2.2);
    }
  }
}