package june24.TypeCasting;

public class Child extends Parent {
    public String address;

    public Child(String name, int age, String address){
        super(name, age);
        this.address = address;
    }
}
