package OOP.polymorphism;

public class Base {
    public String name;
    public String club;

    public Base(){

    }

    public Base(String name, String club){
        this.club = club;
        this.name = name;
    }

    public String playerClub(){
        return club;
    }
}
