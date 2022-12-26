// There are two types of Type casting in java 
// 1. Widening(Automatically): small to large 
// 2. Narrowing(Manually): large to small 

public class TypeCasting {
    public static void main(String[] args){

        // Widening 
        int a = 10;
        long b = a;
        float c = a;

        System.out.printf("a = %d, b = %d, c = %f", a, b, c);

        // Narrowing
        double d1 = 45.234d;
        int e1 = (int) d1;
        System.out.printf("\n d1 = %f, e1 = %d", d1, e1);
        
        long f1 = 23456;
        int g1 = (int) f1;
        System.out.printf("\n f1 = %d, g1 = %d", f1, g1);

    }
}