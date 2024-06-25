package June24.Modifier.AccessModifier.AllClass;

public class ProtectedConstructorClass {
    public String name;

    protected  ProtectedConstructorClass(String name){
        System.out.println("This is protected constructor.");

        this.name = name;
    }
}
