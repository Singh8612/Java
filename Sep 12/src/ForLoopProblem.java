public class ForLoopProblem {
 public static void main(String [] args) {
     int sum=0;
     int i = 1;
     for (i = 1; i < 100; i++) {

         if (i % 2 != 0)continue;
         sum= sum+i;

         System.out.println(sum);
     }
 }

}
