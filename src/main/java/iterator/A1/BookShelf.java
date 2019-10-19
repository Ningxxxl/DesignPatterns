package iterator.A1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ningxy
 * @date 2019/10/19
 */
public class BookShelf implements Aggregate {

    private List<Book> books;
    private int last = 0;

    public BookShelf(int initialSize) {
        books = new ArrayList<>(initialSize);
    }

    public int getLength() {
        return last;
    }

    public Book getIndexAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
        last++;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
