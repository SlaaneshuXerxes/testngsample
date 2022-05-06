import java.util.Scanner;

public class Calculation {

    public static void main(String[] args) {

        Calculation calculation = new Calculation();
        Scanner input = new Scanner(System.in);

        int choice = 0;
        int nr1;
        int nr2;

        while (choice != -1) {
            System.out.println("Enter a number");
            nr1 = input.nextInt();
            System.out.println("Enter another number");
            nr2 = input.nextInt();

            System.out.println(
                            "Choose a function for the chosen numbers:\n" +
                            "1) addition\n" +
                            "2) subtraction\n" +
                            "3) multiplication\n" +
                            "-1) exit program\n");
            System.out.print("Choice: ");
            choice = input.nextInt();

            switch (choice) {
                case -1: System.out.println("Exiting");
                break;
                case 1: System.out.println(nr1 + " + " + nr2 + " = " + calculation.addition(nr1, nr2));
                break;
                case 2: System.out.println(nr1 + " - " + nr2 + " = " + calculation.subtraction(nr1, nr2));
                break;
                case 3: System.out.println(nr1 + " * " + nr2 + " = " + calculation.multiplication(nr1, nr2));
                break;
                default: System.out.println( choice + " is a invalid choice, try again");
                continue;
            }
        }
    }

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }
}
