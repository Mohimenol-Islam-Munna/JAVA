package OOP;

public class ClassObject {
    public String name;
    public int age;

    boolean isDeveloper = true;
    protected char gender;
    private int phone;

    public ClassObject(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setPhone(int phone){
        this.phone = phone;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public int getPhone(){
        return phone;
    }

    public char getGender(){
        return gender;
    }
}