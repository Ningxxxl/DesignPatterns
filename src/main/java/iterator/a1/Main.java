package iterator.a1;

/**
 * BookShelf 该用ArrayList实现
 *
 * @author ningxy
 * @date 2019/10/19
 */
public class Main {
    public static void main(String[] args) {
        int initialSize = 3;
        BookShelf bookShelf = new BookShelf(initialSize);
        bookShelf.appendBook(new Book("Book 1"));
        bookShelf.appendBook(new Book("Book 2"));
        bookShelf.appendBook(new Book("Book 3"));
        bookShelf.appendBook(new Book("Book 4"));

        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
