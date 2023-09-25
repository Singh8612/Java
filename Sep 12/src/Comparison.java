public class Comparison {
    public static void main(String [] args){
        int x=10;
        int y=11;

        int a= 20;
        int b=15;

        boolean result = x<=y           ||    a>b;
        System.out.println(result);

        boolean result1= x!=y            &&    a<b;
        System.out.println(result1);

        boolean result2= x>=y            ||   a>=b;
        System.out.println(result2);

        boolean result3= x<=y            &&   a==b;
        System.out.println(result3);

    }
}
