package June24.Modifier.AccessModifier.AllClass;

public class PrivateConstructorClass {
    private String name = "Private constructor class";

    private PrivateConstructorClass(String name){
        System.out.println("This is private constructor");

        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public static void main(String[] args){
        PrivateConstructorClass privateConstructorClass = new PrivateConstructorClass("North Korea");

        System.out.println("This is the the class which contain private constructor.");

        System.out.println("privateConstructor name by property : " + privateConstructorClass.name);

        System.out.println("privateConstructor name by getter method : " + privateConstructorClass.getName());
    }
}
