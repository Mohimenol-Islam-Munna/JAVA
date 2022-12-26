public class JavaMethods {

    static String myName(String name) {
        return name;
    }

    public static void main(String[] args) {
        System.out.println("My name is " + myName("munna"));

        System.out.println("Student Information :: " + student("ifti", 10, "eight", "madrasa"));

        System.out.println("Student Information :: " + student());
    }

    // Method Overloading ::
    /*
     * With method overloading, multiple methods can have the same name with
     * different parameters.
     */

    static String student(String name, int roll, String className, String schoolName) {
        return "\n" + "Name : " + name + "\nRoll : " + roll + "\nClass : " + className
                + "\nSchool Name : " + schoolName;
    }

    static String student() {
        return "method overloading of student method";
    }
}