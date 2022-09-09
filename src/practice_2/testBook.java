package practice_2;

public class testBook {
    public static void main(String[] args) {
        Book book_1 = new Book();
        Book book_2 = new Book("Crime and punishment");
        Book book_3 = new Book("Poor Lisa", 1792);
        book_2.setYearOfPublishing(1866);
        System.out.println(book_2.getYearOfPublishing());
        System.out.println(book_1);
        System.out.println(book_2);
        System.out.println(book_3);
    }
}
