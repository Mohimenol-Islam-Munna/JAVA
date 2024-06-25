package June24.Modifier.NonAccessModifier;

public abstract class AbstractClass {
    public String name = "This is abstract class";

    public static String staticName = "This is static property of abstract class";

    public String findAddress(){
        return  "ddd";
    }

    public abstract String abstractMethod();
}
