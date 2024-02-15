package mypack;
public class MyPackClass{
    // create static method 
    static String firstStaticMethod(){
        return "My First Method Return Value";
    }

    // create method 
    int firstMethod(){
        return 100;
    }

    // method with parameter
    int sum(int a, int b){
        return a + b;
    }

    // method overloading
    int sameMethod(int a){
        return a;
    }

    int sameMethod(int a, int b){
        return a + b;
    }

    int sameMethod(int a, int b, int c){
        return a * b * c;
    }

    public static void main(String[] args) {
        System.out.println("java simple package is created ::");

        // call static method 
        String mfm = firstStaticMethod();
        System.out.println("mfm :" + mfm);

        // create object
        MyPackClass obj = new MyPackClass();

        System.out.println("access method ::" + obj.firstMethod());
        System.out.println("sum method ::" + obj.sum(1, 1));
        System.out.println("method overloading :1:" + obj.sameMethod(1));
        System.out.println("method overloading :2:" + obj.sameMethod(1, 2));
        System.out.println("method overloading :3:" + obj.sameMethod(1, 2, 3));
    }
}