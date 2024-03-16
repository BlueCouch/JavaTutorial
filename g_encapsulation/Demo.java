package g_encapsulation;

class Human {
    
    private int age;
    private String name;
    
    public Human() {

    }

    public Human (String name) {
        this.age = 12;
        this.name = name;
    }
    
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}


public class Demo {
    public static void main(String[] args) {
        
        Human obj = new Human();
        obj.setAge(30);
        // obj.name = "Tony";

        System.out.println(obj.getName() + " : " + obj.getAge());


    }
}