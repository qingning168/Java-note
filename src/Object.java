class ObjectTest{
    string name;
    int age;
    public void setName(name,age){
        this.name = name;
        this.age = age;
    }
}

public class ObjectMain{
    public static void main(String[] args){
        ObjectTest obj = new ObjectTest();
        obj.setName("xiaoming",18);
    }
}
