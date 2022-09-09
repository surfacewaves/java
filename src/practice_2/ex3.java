package practice_2;

public class ex3 {
}

class Book {
    String name;
    int yearOfPublishing;
    {
        name = "none";
        yearOfPublishing = 0;
    }
    Book() {

    }
    Book(String name) {
        this.name = name;
    }
    Book(String name, int yearOfPublishing) {
        this.name = name;
        this.yearOfPublishing = yearOfPublishing;
    }
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
    int getYearOfPublishing() {
        return yearOfPublishing;
    }
    public String toString() {
        return name + " " + yearOfPublishing;
    }
}