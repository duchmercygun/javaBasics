package Class09HomeWork;

public class Task6 {

    public static void main(String[] args) {


        String [] countries=new String[5];

        countries[0]="Italy";
        countries[1]="Spain";
        countries[2]="France";
        countries[3]="Switzerland";
        countries[4]="Germany";

        for (int j = 0; j < countries.length; j++) {

        switch (countries[j]){
            case("Italy"):
                System.out.println("Country: " + countries[j] + ", Capital: Rome");
                break;
            case("Spain"):
                System.out.println("Barcelona");
                break;
            case("France"):
                System.out.println("Paris");
                break;
            case("Switzerland"):
                System.out.println("Bern");
                break;
            case("Germany"):
                System.out.println("Berlin");
                break;
            default:
                System.out.println("Unknown");
        }
    }
}
}