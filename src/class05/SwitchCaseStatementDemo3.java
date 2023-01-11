package class05;

public class SwitchCaseStatementDemo3 {
    public static void main(String[] args) {

        /* Switch statements = we can only use byte,short,int,char and String
        = can not use relational operators in switch statements
        */

        String day="tuesday";
        switch (day){
            case "Monday":
                System.out.println("1");
                break;
            case "tuesday":
                System.out.println("2");
                break;
            case "Wednesday":
                System.out.println("3");
                break;
            default:
                System.out.println("Wrong Day");
        }
    }
}

