package class05;

public class HomeWorkJan7T2 {
    public static void main(String[] args) {

        int day = 12;

        if (day == 1 || day == 2 || day == 3 || day == 4 | day == 5) {
            System.out.println("It is a weekday");
        }else if(day==6 || day==7){
            System.out.println("It is a weekend");
        }else{
            System.out.println("invalid day");
        }
    }
}