package june24.dataTypes;

public class DataTypes {

    // primitives types
    private byte byteType = 127;

    private short shortType = 32767;

    private int intType = 10;

    private long longType = 10000;

    private float floatType = 101.012345688881f;

    private double doubleType1 = 199.3342;

    private char charType = 'd';

    private boolean booleanType = true;

    // non primitives type or reference types
    private String stringType;

    private String stringType2 = "Munna";

   public static void main(String[] args){
       DataTypes dataTypes = new DataTypes();

       System.out.println("java data types :" + dataTypes.floatType);

       System.out.println("Default value of Reference Type :" + dataTypes.stringType);

       System.out.println("Reference type :" + dataTypes.stringType2);
   }
}