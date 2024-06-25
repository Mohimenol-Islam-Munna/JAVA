package June24.Modifier.NonAccessModifier;

public class Main {
    // Non Access Modifier for class.

    // 1. Final: can't be inherited.
    //    public class Child extends FinalClass {
    //        public String address;
    //
    //        public Child(String address){
    //            this.address = address;
    //        }
    //    }

    // 2. Abstract: can't be instantiated.
    // AbstractClass abstractClass = new AbstractClass();


    // Non Access Modifier for property and method
    // 1. static: belong to class not instance.
    public static String name = "static property";

    public static void staticMethod(){
        System.out.println("static method");
    }

    // 2. final: can't override or modified.
    public final String constantProperty = "constant property";

    public final void constantMethod(){
        System.out.println("this is final method which would not be modified or override.");
    }

    public void setName(String name){
        // this.constantProperty = name; can't possible.

        this.name = name;
    }

    // 3. abstract
    // 4. Transient
    // 5. synchronized
    // 6. volatile


    // Non Access Modifier for constructor
    // No Non access modifier for constructor.



}
