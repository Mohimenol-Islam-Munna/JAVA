package OOP.modifiers;

public class NonAccessModifiers {
    public static void main(String[] args){
        System.out.println("non access modifier class");

        NonAccessModifiers nonAccessModifiers = new NonAccessModifiers();

        System.out.println("non am :" + nonAccessModifiers.name);

        System.out.println("final method :" + nonAccessModifiers.finalMethod("final methods go", "dhaka"));
    }


    public final String name = "final property";

    public final String finalMethod(String name){
        return name;
    }

    public String finalMethod(String name, String address){
        return name + address;
    }

   /*
       final variable in java is like constant. so it's value can't be changed.
       public void setName(String name){
            this.name = name;
        }
    */
}

