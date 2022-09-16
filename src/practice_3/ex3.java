package practice_3;

public class ex3 {
}

class Book {
    protected String author = "none";
    protected String name = "none";
    protected int yearOfPublishing = 0;
    Book() {

    }
    Book(String author,String name, int yearOfPublishing) {
        this.author = author;
        this.name = name;
        this.yearOfPublishing = yearOfPublishing;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
    public int getYearOfPublishing() {
        return yearOfPublishing;
    }
    public String toString() {
        return "author: " + author + ", " + "name: " + name + ", " + "year of publishing: " + " " + yearOfPublishing;
    }
}