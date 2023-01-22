public class task4 {

    public static void main(String[] args) {

        // Create a 2D array or integer type where you will store odd and even numbers.
        // Develop a program which will identify/print the even numbers only.

        int[][] integers = new int[2][5];

        integers[0][0] = 2;
        integers[0][1] = 3;
        integers[0][2] = 6;
        integers[0][3] = 9;
        integers[0][4] = 10;

        integers[1][0] = 12;
        integers[1][1] = 13;
        integers[1][2] = 16;
        integers[1][3] = 15;
        integers[1][4] = 21;

        for (int row = 0; row < integers.length; row++) {
            for (int col = 0; col < integers[row].length; col++) {
                if (integers[row][col] % 2 == 0) {
                    System.out.println(integers[row][col]);
                }
            }



        }
    }
}
