public class Inheritance{
    public static void main(String[] args){
        //Creating an object of derived class
        /* Fish shark = new Fish();
         System.out.println("shark :-");
         shark.eat();
         shark.breath();
         shark.swim(); */

        //Creating an object of Dog class
        /* Dog cutie = new Dog();
         System.out.println("cutie :-");
         cutie.eat();
         cutie.legs = 4;
         cutie.breed = "Pomerenian"; */

        // System.out.println("Legs : "+cutie.legs);
        // System.out.println("Breed : "+cutie.breed);

        //Creating object of Bird class
        /*Bird parrot = new Bird();
        System.out.println("parrot :-");
        parrot.eat();
        parrot.breath();
        parrot.fly();*/

        System.out.println();
        //Creating object of Human class
        /*Human rohit = new Human();
        System.out.println("rohit :-");
        rohit.legs = 2;
        rohit.eat();
        rohit.breath();
        rohit.walk();
        System.out.println("Legs : "+rohit.legs);*/

        //Crating object of Goldfish class
        Goldfish nimo = new Goldfish();
        System.out.println("nimo :-");
        nimo.eat();
        nimo.fins = 2;
        nimo.swim();
        System.out.println("Fins : "+nimo.fins);
    }
}
//-->Single Level Inheritance(line 47-65)
//Let a class Animal
class Animal{
    //Property 1
    void eat(){
        System.out.println("Eats");
    }
    // Property 2
    void breath(){
        System.out.println("Breaths");
    }
}
//Class derived from <<Animal>>
class Fish extends Animal{
    int fins;
    //Special Property
    void swim(){
        System.out.println("Swims");
    }
}


//-->Hierarchial Inheritance (line 69-80)
//Class derived from <<Animal>>
class Bird extends Animal{
    void fly(){
        System.out.println("Flies");
    }
}
//Class derived from <<Animal>>
class Human extends Mammal{
    void walk(){
        System.out.println("Walks");
    }
}


//-->Multi-level Inheritance(line 83-91)
// Class derived from Animals
class Mammal extends Animal{
    int legs;
}
//Class derived from Mamals
class Dog extends Mammal{
    String breed;
}

//-->Hybrid Inheritance(line 93-116)
//Classes derived from Fish
class Goldfish extends Fish{
    void diet(){
        System.out.println("Omnivore");
    }
}
class Whale extends Fish{
    void size(){
        System.out.println("Very large");
    }
}
//Classes derived from Mammal
class Cat extends Mammal{
    void body(){
        System.out.println("Light and Flexible");
    }
}
//Classes derived from Bird
class peacock extends Bird{
    void color(){
        System.out.println("Navy Blue");
    }
}
