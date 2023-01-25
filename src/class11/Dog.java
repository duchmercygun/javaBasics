package class11;

public class Dog {

    // OOP (Object-Oriented Programming are set of rules we follow to achieve below:
        // * representing real life entities
        // * code repetition is minimized
        // * change existing code and adding new features becomes easier
        // * helps write secure code

    // the entities are divided into two parts (attributes or properties/fields)
    String name;
    String breed;
    int age;
    double weight;
    String color;

    // behaviours
    void bark(){ // we use void for behaviours
        System.out.println("Woof Woof");
    }
    void sleep(){
        System.out.println("ZZZZZZzzzzzzZZZZZZ");
    }
    void eat(){
        System.out.println("Dog is eating.....");
    }



}
