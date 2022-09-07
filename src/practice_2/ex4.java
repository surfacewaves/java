package practice_2;

public class ex4 {
    public static void main (String args[]) {
        Dog dog = new Dog("Eren", 2);

        /*String name = dog.getName();
        int age = dog.getAge();
        System.out.println(name);
        System.out.println(age);*/

        int humanAge = dog.humanAge();
        System.out.printf("В человеческом возрасте: %d", humanAge);

        System.out.println("\n" + dog.toString());
    }
}

class Dog {
    private String name;
    private int age;
    {
        name = "mikasa";
        age = 1;
    }
    Dog() {}
    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void setName(String name) {
        this.name = name;
    }
    void setAge(int age) {
        this.age = age;
    }
    String getName() {
        return name;
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