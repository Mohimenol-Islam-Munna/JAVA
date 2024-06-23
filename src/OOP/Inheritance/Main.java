package OOP.Inheritance;

public class Main {
    public static void main(String[] args){
        System.out.println("inheritance");

        DerivedPlayer derivedPlayer = new DerivedPlayer("Messi", "for 4 years", 22333334, "Argentina");

        System.out.println("derived player: " + derivedPlayer.name);
    }
}


class BasePlayer{
    public String name;

    public String contact;

    private int salary;


    public  BasePlayer(String name, String contact, int salary){
        this.name = name;
        this.contact = contact;
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }
}

class DerivedPlayer extends BasePlayer{
    public String country;

    public DerivedPlayer(String name, String contact, int salary, String country){
        super(name, contact, salary);

        this.country = country;
    }

}
