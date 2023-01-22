public class task6 {

    public static void main(String[] args) {

        // 6) Write a program to swap 2 numbers without a temporary variable?

        int a=5;
        int b=10;

        System.out.println("Before: ");
        System.out.println("x = "+a);
        System.out.println("y = "+b);

        System.out.println("*************************");

        a=a*b;   //50 (a=5*10)
        b=a/b;  //5 (b=50/10)
        a=a/b; //10 (a=50/5)

        System.out.println("After: ");
        System.out.println("x = "+a);
        System.out.println("y = "+b);

        System.out.println("*************************");



    }
}

