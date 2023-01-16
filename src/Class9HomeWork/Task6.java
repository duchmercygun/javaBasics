package Class9HomeWork;

public class Task6 {

    public static void main(String[] args) {

        int i=1;
        String [] countries=new String[5];

        countries[0]="Italy";
        countries[1]="Spain";
        countries[2]="France";
        countries[3]="Switzerland";
        countries[4]="Germany";

        switch (i){
            case(0):
                System.out.println("Rome");
                break;
            case(1):
                System.out.println("Barcelona");
                break;
            case(2):
                System.out.println("Paris");
                break;
            case(3):
                System.out.println("Bern");
                break;
            case(4):
                System.out.println("Berlin");
                break;
            default:
                System.out.println("Unknown");
        }
    }
}
