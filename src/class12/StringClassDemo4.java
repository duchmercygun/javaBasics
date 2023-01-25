package class12;

public class StringClassDemo4 {
    public static void main(String[] args) {

        String str="";
        System.out.println(str.isEmpty());
    }

    public static class StringClassDemo3 {
        public static void main(String[] args) {
            String firstName="Akhter";
            String lastName="Lava";
            System.out.println(firstName+ " " +lastName);
            System.out.println(firstName.concat(" " +lastName));
        }
    }
}
