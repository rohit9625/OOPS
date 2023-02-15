public class StaticKeyword {
    public static void main(String[] args) {
        /*
        Student s1 = new Student();
        s1.schoolName = "CSS";

        Student s2 = new Student();
        System.out.println(s1.schoolName);

        Student s3 = new Student();
        s3.schoolName = "SSC";
        System.out.println(s2.schoolName);
        System.out.println(s3.schoolName);
        */

        Horse h =  new Horse();
        System.out.println(h.color);

    }
}
// static keyword - It is used to share the same variable or method of a given class
class Student {
    String name;
    int roll;
    //Static
    static String schoolName;

    void setName(String name) {
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
// super keyword - It is used to refer immediate parent class object
class Animal {
    String color = "black";
    Animal() {
        System.out.println("Animal constructor is called");
    }
}
class Horse extends Animal {
    Horse() {
        //super
        super.color = "brown"; //it changes the color property of immediate parent class
        System.out.println("Horse constructor is called");
    }
}