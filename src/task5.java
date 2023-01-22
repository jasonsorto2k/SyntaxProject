public class task5 {

    public static void main(String[] args) {

        // Create a 2D array of integers.
        // Develop a program which will calculate the sum of even and odd numbers for that array.

        int [][] numbers={{10,19,18,17,16},
                {15,14,13,12,11},
                {10,21,35,44,50},
        };

        int sumEven=0;
        int sumOdd=0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0){
                    sumEven=sumEven+numbers[i][j];
                } else {
                    sumOdd=sumOdd+numbers[i][j];
                }
            }
        }

        System.out.println("Sum of Even numbers "+sumEven);
        System.out.println("Sum of Odd numbers "+sumOdd);

    }
}

