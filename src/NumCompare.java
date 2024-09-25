import java.util.Scanner;

public class NumCompare {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        double num1 = 0;
        double num2 = 0;

        System.out.println("Hello - please input two numbers, separately.");

        if (scan.hasNextDouble()) {
            num1 = scan.nextDouble();
        } else {
            System.out.println("You have inputted an invalid response.");
            System.exit(0);
        }

        if (scan.hasNextDouble()) {
            num2 = scan.nextDouble();
        } else {
            System.out.println("You have inputted an invalid response.");
            System.exit(0);
        }

        if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2 + " .");
        } else if (num1>num2) {
            System.out.println(num1 + " is greater than " + num2 + " .");
        } else {
            System.out.println(num1 + " and " + num2 + " are equal.");
        }

    }
}