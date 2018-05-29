package Polymorphism;

public class Launcher {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(3,5);
        c.add(1,2,3);
        c.add(1.2, 2.0);
    }
}
