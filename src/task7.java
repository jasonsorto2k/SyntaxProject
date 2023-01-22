import java.util.Scanner;

public class task7 {

    public static void main(String[] args) {

        // 7) Write a java program to check whether a given number is prime or not?

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number:");

        int number = scan.nextInt();

        boolean isPrimeNumber = true;

        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                isPrimeNumber = false;
                break;
            }

        }
        if (isPrimeNumber) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }


    }
}

