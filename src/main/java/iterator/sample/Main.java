package iterator.sample;

/**
 * @author ningxy
 * @date 2019/10/19
 */
public class Main {
    public static void main(String[] args) {
        int bookShelfMaxsize = 5;
        BookShelf bookShelf = new BookShelf(bookShelfMaxsize);

        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-legs"));
        bookShelf.appendBook(new Book("Book 5"));

        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getName());
        }
    }
}
