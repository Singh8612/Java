import java.util.Scanner;

public class scannercalculator {

    public static void main(String[] args) {


        System.out.println("Welcome to my calculator");
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for division");

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your input ");
        int input= scanner.nextInt();

        int x = 10;
        int y = 20;
        if (input==1) {


            if (input == '+') {
                int sum = x + y;
                System.out.println(" Sum of x and y " + sum);

            } else if (input == '-') {
                int sub = x - y;
                System.out.println("Subtraction of x and y " + sub);

            } else if (input == '*') {

                int Mul = x * y;
                System.out.println("Multilication of x and y " + Mul);

            } else if (input == '/') {

                int div = x - y;
                System.out.println("Divison of x and y" + div);
            }

        }
    }
}

