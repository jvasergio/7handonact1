package runanimal;
import java.util.Scanner;
abstract class Animal{
    abstract void eat();
    abstract void sleep();
    abstract void makeSound();
}
class Bird extends Animal{
    void eat(){
        System.out.print("Birds love to eat seeds and ");
    }
    void sleep(){
        System.out.println("sleep for 10-12 hours a day. ");
    }
    void makeSound(){
        System.out.println("Tweet tweet");
    }
}
class Cat extends Animal{
    void eat(){
        System.out.print("Birds love to eat fish and ");
    }
    void sleep(){
        System.out.println("sleep for 12-16 hours a day. ");
    }
    void makeSound(){
        System.out.println("Meow meow");
    }
}
class Cat extends Animal{
    void eat(){
        System.out.print("Birds love to eat meat and ");
    }
    void sleep(){
        System.out.println("sleep for 12-14 hours a day. ");
    }
    void makeSound(){
        System.out.println("Woof woof");
    }
}
public class RunAnimal {
    public static void main(String[] args) {
        Scanner in =  new Scanner (System.in);
        System.out.print("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
        String choose = in.nextLine();
        if (choose.equalsIgnoreCase("B")){
            Bird b =  new Bird();
            b.eat();
            b.sleep();
            b.makeSound();
        }
        else if (choose.equalsIgnoreCase("C")){
            Cat c = new Cat();
            c.eat();
            c.sleep();
            c.makeSound();
        }
        else if (choose.equalsIgnoreCase("D")){
            Dog d = new Dog();
            d.eat();
            d.sleep();
            d.makeSound();
        }
        else {
            System.out.println("Invalid input.");
        }
    }
}
