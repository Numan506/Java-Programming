package Method;

import java.util.Scanner;

public class Exception_Problem {

    public static void main(String[] args) {

        int count = 1;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Please enter num1: ");
                int num1 = input.nextInt();

                System.out.print("Please enter num1: ");
                int num2 = input.nextInt();

                int result = num1 / num2;
                System.out.println("The result is: " + num1 + "/" + num2 + " = " + result);
                count = 2;
            } catch (Exception e) {
                System.out.println("Excaption error is: " + e);
                System.out.println("Please try again and given the Integer number ");
            }
        } while (count == 1);
        {
            System.out.println("The program is end.");
        }

    }
}
