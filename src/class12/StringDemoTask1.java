package class12;

import java.util.Scanner;

public class StringDemoTask1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter username ");
        String userName=scan.next();
        System.out.println("Please enter your password");
        String password=scan.next();
        System.out.println("Please enter your password again");
        String confirmPassword=scan.nextLine();
        if(userName.isEmpty() || password.isEmpty()) {
            System.out.println("Username and Password cannot be empty");
        }else if (password.length()<8){
            System.out.println("Password is too short");
        }else if(password.contains(userName)){
            System.out.println("Password cannot contain userName");
        }else if (password.equals(confirmPassword)){
            System.out.println("Password do not match");
        }else{
            System.out.println("Your username and password has been created");
        }



    }
}
