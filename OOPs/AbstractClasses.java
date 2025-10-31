package OOPs;

public class AbstractClasses {
    public static void main(String[] args) {
//        Animal obj = new Animal(); // Can't instantiate
        Horse an1 = new Horse();
        an1.eat();
        an1.walk();
        System.out.println(an1.color +"\n");

        Chicken an2 = new Chicken();
        an2.eat();
        an2.walk();
        System.out.println(an2.color +"\n");

        Mustang an3 = new Mustang();
        // Animal --> Horse --> Mustang
    }
}
abstract class Animal{
    String color;
    Animal(){
        color = "brown";
        System.out.println("Animal constructor called!");
    }
    void eat(){
        System.out.println("Animal eats!");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called!");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("Walks on four legs!");
    }
}
class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken constructor called!");
    }
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("Walks on two legs!");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called!");
    }
}
