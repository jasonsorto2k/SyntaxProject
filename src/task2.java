import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        // Using Scanner create an array of countries. When an array is created,
        // retrieve all values from it and while retrieving those values print capital for each country.
        // (use 2 different loops).

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 5 different countries:");

        String[] countries = new String[5];

        countries[0]=scan.next();
        countries[1]=scan.next();
        countries[2]=scan.next();
        countries[3]=scan.next();
        countries[4]=scan.next();

        for (int i = 0; i < countries.length; i++) {

            String country = countries[i];
            String capital = "";

            switch (country){

            case "Italy":
                capital = "Rome";
                break;

            case "France":
                capital = "Paris";
                break;

            case "Greece":
                capital = "Athens";
                break;

            case "Spain":
                capital = "Madrid";
                break;

            case "USA":
                capital = "Washington D.C";
                break;

            }
            System.out.println(capital+" is the capital of "+country);
        }
    }
}
