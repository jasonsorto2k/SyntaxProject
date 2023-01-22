public class task11 {

    public static void main(String[] args) {

        // 11) Write a program to print out duplicate elements from an Array of Strings?

        String[] arr = {"Lucio", "Reinhardt", "Kenji", "Lucio", "Moira", "Loki", "Moira"};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if( (arr[i].equals(arr[j])) && (i != j) )
                {
                    System.out.println("The duplicate name is: "+arr[j]);
                }
            }
        }



    }
}

