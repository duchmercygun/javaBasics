package class05;

import java.util.Scanner;
public class HomeWorkJan7T4 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your birth month");
        String month=keyboard.next();

       if(month.equals("December") || month.equals("January") || month.equals("February")){
           System.out.println("You were born winter");
       }else if(month.equals("March") || month.equals("April") || month.equals("May")){
           System.out.println("You were born spring");
       }else if(month.equals("June") || month.equals("July") || month.equals("August")){
           System.out.println("You were born summer");
       }else if(month.equals("September") || month.equals("October") || month.equals("November")){
           System.out.println("You were born fall");
       }
        }

    }

