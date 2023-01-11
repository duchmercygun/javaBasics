package class3;

import java.sql.SQLOutput;

public class IfElse3 {
    public static void main(String[] args) {

            char c='M';
            if(c=='M'){
                System.out.println("Male");
            }

            String name="Nat"; // with non primitive data types such as String we can't use == symbol

            if(name.equals("Sam")) {
                System.out.println("Amazing Student");
            } // ! symbol can change true to false and false to true

            if(!name.equals("Sam")) {
                System.out.println("Super Amazing Student");
            }
            boolean hungry=true;

            if(!hungry){
                System.out.println(hungry);
                System.out.println("let's eat");
            }
        }
    }

