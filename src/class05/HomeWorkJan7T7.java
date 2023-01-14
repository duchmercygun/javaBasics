package class05;

import java.util.Scanner;

public class HomeWorkJan7T7 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your country");
        String country=scan.next();

        switch (country.toLowerCase()){
            case "philippines":
                System.out.println("Tagalog");
                break;
            case "spain":
                System.out.println("Spanish");
                break;
            case "usa":
                System.out.println("English");
                break;
            case "france":
                    System.out.println("French");
                    break;
            default:
                System.out.println("Unknown");
        }

        System.out.println("Enter your grade");



    }
}
