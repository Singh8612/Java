import java.util.Scanner;

public class DoLoopProblems {
    public static void main(String [] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your number");
        int number= scanner.nextInt();

        int i=1;
        int limit=10;

        do {
            int result = number * i;

            System.out.println(result);
            i++;
         }while(i<=10);



    }
}

