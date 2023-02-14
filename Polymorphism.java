public class Polymorphism{
    public static void main(String[] args){
        //Creating object of Calculator class
        /*Calculator calc = new Calculator();
        System.out.println(calc.sum(140,3));
        System.out.println(calc.sum(1.40f,0.03f));
        System.out.println(calc.sum(0.5f,0.5f,0.5f));*/

        //Creating object of class Animal
        Animal x = new Animal();
        x.eat();

        //Creating object of class Cow
        Cow y = new Cow();
        y.eat();

        //Crating object of class Lion
        Lion z = new Lion();
        z.eat();
    }
}

//Polymosphism is of two types - Compile Time and Run Time Polymorphism
//-->Compile Time Polymorphism
//>>Method Overloading - Multiple methods with the same name but different parameters
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    float sum(float a, float b, float c){
        return a+b+c;
    }
}

//-->Run Time Polymorphism
//>>Method overriding - When parent and child classes both contains same method with different definition
//Let a class Animal
class Animal{
    void eat(){
        System.out.println("Eats anything");
    }
}
//Classes derived from Animal
class Cow extends Animal{
    void eat(){
        System.out.println("Eats Grass");
    }
}
class Lion extends Animal{
    void eat(){
        System.out.println("Eats Flesh");
    }
}
