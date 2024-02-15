package OOP.modifiers;

public abstract class AbstractClass {
    public String name = "Abstract class";

    public abstract String getName();

    public abstract void setName(String name);
}


class ImplementAbstractClass extends AbstractClass{
    public static void main(String[] args){
        System.out.println("implementation of abstract class");

        ImplementAbstractClass implementAbstractClass = new ImplementAbstractClass();

        System.out.println("implementAbstractClass :" + implementAbstractClass.name);

        implementAbstractClass.setName("Our abstract class");

        System.out.println("implementAbstractClass 2 :" + implementAbstractClass.name);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

class AnotherClass{
    public static void main(String[] args){
        System.out.println("Another class");

        // abstract class can not be initiated
        // AbstractClass abstractClass = new AbstractClass();
    }

}
