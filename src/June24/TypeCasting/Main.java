package June24.TypeCasting;

public class Main {

    public static void main(String[] args){
        System.out.println(" ---- Primitive Type Casting in java ---- ");

        // Primitive Type Casting

        // 1. Type Widening (Automatic)

        int intType2 = 120;

        long longType = intType2;

        double doubleType2 = intType2;

        System.out.println("Type widening int to long : " + longType);

        System.out.println("Type widening int to double : " + doubleType2);


        // 2. Type Narrowing

        double doubleType = 12.5;

        int intType = (int) doubleType;

        System.out.println("Type Narrowing : " + intType);

        System.out.println(" ---- Reference Type Casting in java ---- ");

        // Reference Type Casting

        // 1. Up Casting (Automatic)

        Parent child = new Child("ifti", 20, "mym");

        System.out.println("child name : " + child.name);

        System.out.println("child age : " + child.age);


        // 2. Down Casting
        // 2.1. First Up Casting
        Parent parent = new Child("adam", 20000, "Dhaka");

        // 2.2. Then Down Casting
        Child parentToChild = (Child) parent;

        System.out.println("Parent in Child : " + parentToChild.address);
    }
}

