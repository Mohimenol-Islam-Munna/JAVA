public class JavaString{
    public static void main(String[] args){
        System.out.printf("Java String");

        String name = "Md Mohimenol Islam Munna. ";
        String sub = "CSE";

        System.out.print("\n java string length : " + name.length());
        System.out.print("\n java string uppercase : " + name.toUpperCase());
        System.out.print("\n java string lowercase : " + name.toLowerCase());
        System.out.print("\n java string indexOf : " + name.indexOf("Islam"));

        System.out.print("\n java string concatenation :1: " + name + "" + sub);
        System.out.print("\n java string concatenation :2: " + name.concat(sub));
    }
}