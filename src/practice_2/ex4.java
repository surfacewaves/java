package practice_2;

public class ex4 {
}

class Dog {
    private String name;
    private int age;
    {
        name = "none";
        age = 0;
    }
    Dog() {

    }
    Dog(String name) {
        this.name = name;
    }
    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    void setAge(int age) {
        this.age = age;
    }
    int getAge() {
        return age;
    }
    int humanAge() {
        return age * 7;
    }
    public String toString() {
        return name + " " + age;
    }
}