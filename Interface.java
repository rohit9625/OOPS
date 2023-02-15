public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        //Eg. of multiple inheritance
        Bear b = new Bear();
        b.eat();
    }
}

//Interface - Interface is a blueprint of a class whether a class is a blueprint of an object
interface ChessPlayer {
    void moves();
}
//Classes implements ChessPlayer interface
class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down, Left, Right and Diagonal(in all 4 directions)");
    }
}
class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down, Right and Left");
    }
}
class King implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down, Left, Right and Diagonal(in all 4 directions but 1 step only)");
    }
}

//Multiple Inheritance using Interface
interface Herbivore {
    void eat();
}
interface Carnivore {
    void eat();
}
class Bear implements Herbivore, Carnivore{
    public void eat() {
        System.out.println("Eats Grass and Meat");
    }
}