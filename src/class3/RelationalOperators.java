package class3;

import java.sql.SQLOutput;

public class RelationalOperators { // result is always TRUE or FALSE

    public static void main(String[] args) {
        int number=10;
        int number2=10;
        System.out.println(number+number2);
        boolean result=20>10;
        System.out.println(result);

        System.out.println(20>10); //is 20 greater than 10 => true  (>) greater than
        System.out.println(5>10); // is 5 greater than 10 => false
        System.out.println(5!=10); // is 5 not equal to 10 => true  (!=) not equal to
        System.out.println(5==10); // is 5 equal to 10 => false  (==) equal to
        System.out.println(5==5);  // is 5 equal to 5 => true
        System.out.println(10>=20); // is 10 greater or equal to 20 => false (>=) greater than or equal
        System.out.println(10<=20); // is 10 less than or equal to 20 => true (<=) less than or equal
        System.out.println(10<=10); // is 10 less than or equal to 10 => true
    }

}
