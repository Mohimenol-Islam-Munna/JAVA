package OOP.modifiers;

public class AccessModifiers {
    public String name;
    protected String club;
    private int jersey;

    public AccessModifiers(String name, String club, int jersey){
        this.name = name;
        this.club = club;
        this.jersey = jersey;
    }

    public int getJersey(){
        return jersey;
    }

    public void printJersey(){
        System.out.println("jersey :" + jersey);
    }



    public static void main(String[] args){
        System.out.println("access modifier class");
    }
}
