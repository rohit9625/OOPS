public class Abstraction {
    public static void main(String[] args) {
        //We can't create a object of an abstract class
        /*
        Animal a = new Animal(); //Gives error
        */
        //Create object of Horse class
        /*
        Horse h = new Horse();
        h.eat();
        h.walk();
        */

        //Create object of Chicken clas
        /*
        Chicken c = new Chicken();
        c.eat();
        c.walk();
        //When calling constructor of Chicken it first call parent constructor then chicken constructor
        System.out.println(c.color);
        //calling changeColor of class Chicken
        c.changeColor();
        System.out.println(c.color);
        */

        //Create object of class Mustang
        Mustang m = new Mustang();

    }
}

abstract class Animal {
    //Color
    String color;

    //Constructor
    Animal() {
        color = "brown";
        System.out.println("Animal Constructor is called");
    }

    void eat() {
        System.out.println("Eats");
    }

    //Abstract method
    abstract void walk(); //Doesn't has implementation
} 
//Class derived from abstract class Animal
class Horse extends Animal {
    Horse() {
        System.out.println("Horse Constructor is called");
    }
    void walk() {
        System.out.println("Walks on 4 legs");
    }

    //ChangeColor
    void changeColor() {
        color = "black";
    }
}
//Class derived from Horse class
class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang Constructor is called");
    }
}
//Class derived from abstract class Animal
class Chicken extends Animal {
    Chicken() {
        color = "white";
    }
    void walk() {
        System.out.println("Walks on 2 legs");
    }

    void changeColor() {
        color = "white";
    }
}