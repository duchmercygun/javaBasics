package class4;

public class IfElseIfCondition {
    public static void main(String[] args) {

        int day = 8;

        if (day == 1) { // == to compare to values
            System.out.println("Monday");
        } else if(day==2){
            System.out.println("Tuesday");
        }else if(day==3){
            System.out.println("Wednesday");
        }else if(day==4){
            System.out.println("Thursday");
        }else if (day==5){
            System.out.println("Friday");
        }else if(day==6){
            System.out.println("Saturday");
        }else if(day==7){
            System.out.println("Sunday");
        }else{
            System.out.println("Please enter a day between 1 and 7");
        }

    }
}
