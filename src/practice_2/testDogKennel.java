package practice_2;

public class testDogKennel {
    public static void main(String[] args) {
        Dog dog_1 = new Dog();
        Dog dog_2 = new Dog("mikasa");
        Dog dog_3 = new Dog("lucky", 100);
        System.out.println(dog_2.getName());
        dog_2.setAge(1);
        dog_1.setName("unlucky");
        dog_1.setAge(0);
        System.out.println(dog_3.humanAge());
        System.out.println(dog_1);
        System.out.println(dog_2);
        System.out.println(dog_3);
    }
}
