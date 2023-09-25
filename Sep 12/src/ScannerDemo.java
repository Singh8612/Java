import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        int num;
        int num2;
        double x;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number ");
        num = scanner.nextInt();

        System.out.println("Enter the second number ");
        num2 = scanner.nextInt();

        int sum= num + num2;
        System.out.println("Sum of num and num2 " + sum);
    }
    }