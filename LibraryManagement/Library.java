import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
    }

    public void listBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void removeBook(String isbn) {
        books.removeIf(b -> b.getIsbn().equals(isbn));
    }
}
