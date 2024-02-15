package OOP.polymorphism;

public class Main {
    public static void main(String[] args){
        System.out.println("polymorphism main class");

        Base base = new Base("messi", "Mohamadan");
        System.out.println("Base class :" + base.playerClub());

        Derived derived = new Derived();
        System.out.println("Derived Class : " + derived.playerClub());
    }
}
