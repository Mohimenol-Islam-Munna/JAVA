/* 

variable syntax:
    dataType variableName = value

*/

public class Variable {
    public static void main(String[] args) {
        System.out.println("variables in java");

        String name = "munna";
        int id = 160133;

        System.out.println("Name : " + name);
        System.out.println("Id :" + id);

        String sub;
        sub = "CSE";
        System.out.println("Subject : " + sub);

        int a, b, c;
        a = 10;
        b = c = 20;
        System.out.println("Multiple Variable : " + a + b + c);
        System.out.println(a + b + c);
        System.out.println(a + b + c + " : Multiple Variable");
    }
}
