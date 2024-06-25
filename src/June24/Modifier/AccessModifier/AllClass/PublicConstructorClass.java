package June24.Modifier.AccessModifier.AllClass;

public class PublicConstructorClass {
    private String name;
    public ProtectedConstructorClass protectedConstructorClass = new ProtectedConstructorClass("England");

    public PublicConstructorClass(String name){
        System.out.println("This is the public constructor");

        this.name = name;
    }


    public String getName(){
        return this.name;
    }

}
