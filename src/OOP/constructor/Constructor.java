package OOP.constructor;

public class Constructor {
    public static void main(String[] args){

        PublicConstructor publicConstructor = new PublicConstructor("Public constructor");
        System.out.println("public constructor :" + publicConstructor.name);

        ProtectedConstructor protectedConstructor = new ProtectedConstructor("Protected Constructor");
        System.out.println("protected constructor :" + protectedConstructor.name);

        System.out.println("private constructor :" + PrivateConstructor.getSingleton().getName());
    }
}

class PublicConstructor{
    public String name;
    public PublicConstructor(String name){
        this.name = name;
    }
}

class ProtectedConstructor{
    public String name;

    protected ProtectedConstructor(String name){
        this.name = name;
    }
}

class PrivateConstructor{
    private String name;

    private static PrivateConstructor privateConstructor = new PrivateConstructor("private constructor in class itself");

    private PrivateConstructor(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

   public static PrivateConstructor getSingleton(){
        return privateConstructor;
   }
}
