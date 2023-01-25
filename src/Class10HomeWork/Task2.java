package Class10HomeWork;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 5 countries");
        String[] countries = new String[5];

        for (int i = 0; i < countries.length; i++) {
            countries[i] = scan.nextLine();
        }

        for (String country : countries) {
            String capital = null;
            switch (country){
                case("Italy"):
                    capital = "Rome";
                    break;
                case("Spain"):
                    capital = "Barcelona";
                    break;
                case("France"):
                    capital = "Paris";
                    break;
                case("Switzerland"):
                    capital = "Bern";
                    break;
                case("Germany"):
                    capital = "Berlin";
                    break;
                default:
                    capital = "Unknown";
            }

            System.out.println("Country: " + country + ", Capital: " + capital);
        }
    }
}
