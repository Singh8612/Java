import java.util.Scanner;

public class TerminateOperator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no.");
        int number = scanner.nextInt();
        System.out.println((number >= 0) ? "positive" : "negative");

    }
}
