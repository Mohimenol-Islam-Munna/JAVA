package June24.Modifier.AccessModifier;

import June24.Modifier.AccessModifier.AllClass.ProtectedConstructorClass;
import June24.Modifier.AccessModifier.AllClass.PublicClass;
import June24.Modifier.AccessModifier.AllClass.PublicConstructorClass;

public class Main {
    // Access Modifier for class.
    // 1. public: access from anywhere.
    public PublicClass publicClass = new PublicClass();

    // 2. default: only accessible from the class of same package.
    // DefaultClass defaultClass = new DefaultClass(); (not possible to access default class in another package.)

    // Access modifier for properties and methods.
    // 1. public: can access from any class
    public String club;

    public String publicMethod(){
        return "This is return value of java's public method";
    }

    // 2. protected: can access in self and derived class.
    protected int age = 23;

    public String protectedMethod(){
        return "This is protected method";
    }

    // 3. private: can access in self method.
    private int income = 4444;

    private String privateMethod(){
        return "This is private method";
    }

    // 4. default: can accessible in self and same package.
    String defaultProperty = "This is default property";

    String defaultMethod(){
        return this.defaultProperty;
    }

    // Access modifier for constructor.
    // 1. public
    // 2. protected
    // 3. private

    public static void main(String[] args){
        System.out.println("Access modifier in java");

        Main accessModifier = new Main();

        System.out.println("public class name: " + accessModifier.publicClass.getClassName());

        System.out.println("Name of default class : " + accessModifier.publicClass.getDefaultClass());

        // class with public constructor
        PublicConstructorClass publicConstructorClass = new PublicConstructorClass("public constructor's class");

        System.out.println("publicConstructor : " + publicConstructorClass.getName());

        // class with protected constructor (can't access from outside the package)
        // ProtectedConstructorClass protectedConstructorClass = new ProtectedConstructorClass("Spain");
        System.out.println("protected constructor : " + publicConstructorClass.protectedConstructorClass.name);
    }
}

