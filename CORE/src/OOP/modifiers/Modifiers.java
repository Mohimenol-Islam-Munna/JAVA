package OOP.modifiers;

public class Modifiers {
    public static void main(String[] args){
        System.out.println("modifiers class");

        AccessModifiers player = new AccessModifiers("Jaker Ali", "Cumilla Victorians", 39);

        System.out.println("player nmae: " + player.name + "\nPlayer Club: " + player.club + "\nPlayer Jersey: " + player.getJersey());
    }
}


