package June24.Modifier.AccessModifier.AllClass;

public class PublicClass {
    private String clsssName = "This is public class";

    public String getClassName(){
        return this.clsssName;
    }

    public String getDefaultClass(){
        return new DefaultClass().getNameOfClass();
    }
}
