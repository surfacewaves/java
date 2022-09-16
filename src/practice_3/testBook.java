package practice_3;

public class testBook {
    public static void main(String[] args) {
        Book book_1 = new Book();
        Book book_2 = new Book("Karamzin", "Poor Lisa", 1792);
        book_1.setName("Crime and punishment");
        System.out.println(book_1.getName());
        System.out.println(book_1);
        System.out.println(book_2);
    }
}
