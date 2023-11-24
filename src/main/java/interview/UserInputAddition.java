package interview;

import java.util.Scanner;

public class UserInputAddition {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Enter the input1");
            double input1 = scanner.nextDouble();
            System.out.println("Enter the input2");
            double input2 = scanner.nextDouble();

            double result = input1 + input2;

            System.out.println("result = " + result);
        } catch (Exception e) {
            System.out.println("provide valid input");
        } finally {
            scanner.close();

        }
    }

}
