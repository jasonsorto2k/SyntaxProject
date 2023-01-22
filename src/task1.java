public class task1 {

    public static void main(String[] args) {

        // Using Scanner create an array of integer values.
        // After the array is created, calculate the sum of all stored elements in that array.

        int[] integers = {1,44,67,8,5,43};
        int sum = 0;

        for (int i = 0; i < integers.length; i++) {
            sum = sum + integers[i];

        }
            System.out.println(sum);

        }
    }

