//Basic oops concept
public class OOPS{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Rohit";
        s1.age = 21;
        s1.percentage = 7.1f;
        s1.marks[0] = 80;
        s1.marks[1] = 90;
        s1.marks[2] = 100;


        //Creating new object s2
        Student s2 = new Student(s1);

        s1.marks[1] = 99;
        System.out.println("Student s1 :-");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.percentage);
        for(int i=0; i<3; i++){
            System.out.println(s1.marks[i]);
        }

        
        System.out.println();

        System.out.println("Student s2 :-");
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.percentage);
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
        
    }

}

//Pen class
class Pen{
    private String color;
    private int tip;

    //Constructor
    Pen(){
        
    }

    void setColor(String newColor){
        this.color = newColor;
    }

    String getColor(){
        return this.color;
    }

    void setTip(int tip){
        this.tip = tip;
    }

    int getTip(){
        return this.tip;
    }

}

//Student Class
class Student{
    String name;
    int age;
    float percentage;
    int marks[];

    Student(){
        marks = new int[3];

    }

    //Shallow Constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.age = s1.age;
    //     this.percentage = s1.percentage;
    //     this.marks = s1.marks;
    // }

    //Deep Constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        this.percentage = s1.percentage;
       for(int i=0; i<marks.length; i++){
        this.marks[i] = s1.marks[i];
       }
    }

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy+chem+math)/3;
    }
}

//Bank Account class
class bankAcc{
    public String userName;
    private String password;
    
    public void setPassword(String pwd){
        password = pwd;
    }

    String getPassword(){
        return this.password;
    }
    

}