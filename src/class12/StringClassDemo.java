package class12;

public class StringClassDemo {

    public static void main(String[] args) {

        // creating an object of the String Class
        String strObj=new String("Java");
        // another way of creating an object of String class a shorter way
        // mostly this is how we create the objects of String class
        String strObj2="Java";
        System.out.println(strObj2.length());
        String dtr="Banana";
        int len=strObj.length();
        System.out.println(len);
        String name="Hamid poya ";
        if(name.length()>10){
            System.out.println("Name can't be more than 10 letters");
        }


    }
}
