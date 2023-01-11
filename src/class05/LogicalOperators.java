package class05;

public class LogicalOperators {
    public static void main(String[] args) {

        /*
        logical operators => they are other sets of symbols that we can use to combine multiple boolean values.

        (!) not operator => this is used to negate the boolean values if something
        they only works with boolean

         */

        System.out.println(!true);
        System.out.println(!false);
        boolean rich = true;
        System.out.println(!rich);

        int number = 9;
        if (number != 1) {
            System.out.println("Hello World!");
        } else {
            System.out.println("Hello Java");
        }

        String country = "China";

        if (!country.equals("BadCountry")) ;{
            System.out.println("you are welcome");
        }
    }
}