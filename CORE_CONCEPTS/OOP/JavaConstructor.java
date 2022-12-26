package OOP;

public class JavaConstructor {
    int id;
    String name;
    boolean isTrue;

    public JavaConstructor(int id, String name, boolean isTrue) {
        id = id;
        name = name;
        isTrue = isTrue;
    }

    public static void main(String[] args) {
        // constructor
        JavaConstructor constructorObj1 = new JavaConstructor(160133, "munna", true);

        System.out.println("constructorObj1 name ::" + constructorObj1.name);
    }

}
