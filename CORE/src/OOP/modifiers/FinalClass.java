package OOP.modifiers;

// no inheritance from final class
public final class FinalClass {
    public String name = "Final Class";
}

class OtherClass {
    public String name = "Other Class";

    public static void main(String[] args){
        FinalClass finalClassInstance = new FinalClass();

        System.out.println("others class");
        System.out.println("Final Class :" + finalClassInstance.name);
    }
}

class ChildClass extends OtherClass{
    public static void main(String[] args){
        ChildClass childClass = new ChildClass();

        System.out.println("Other Class: " + childClass.name);
    }
}


/* class AnotherChildClass extends FinalClass{
    // this is wrong.
    // It's not possible to inherite a final class/
}
*/
