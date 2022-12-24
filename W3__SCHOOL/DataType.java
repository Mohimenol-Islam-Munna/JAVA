/*
 * Data Types in java:
 *  Data types are divided into two groups:
 
 *    Primitive data types:
        * byte,
        * short,
        * int,
        * long,
        * float,
        * double,
        * boolean and
        * char

 *    Non-primitive data types:
        * String,
        * Arrays and
        * Classes
 
 */

public class DataType {
    public static void main(String[] args) {
        System.out.println("Data Types in java");

        // primitive types

        // integer 
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 12233;

        // floating number 
        float f1 = 10.40f;
        System.out.println("f1 = " + f1);

        double d1 = 100.234d;
        System.out.println("d1 = "+ d1);

        // character 
        char c1 = 'B';
        System.out.println("c1 = "+ c1);

        // boolean 
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("b1 = , b2 = " + b1 +","+ b2);


        // Non-Primitives 

        // String 
        String name = "Munna";
        System.out.println("Name : " + name);

        // Array
        String[] names = {"asif vai", "soroar vai", "munna"};
        System.out.println("names = " + names);

    }
}