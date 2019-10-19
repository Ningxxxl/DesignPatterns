package iterator.A1;

/**
 * @author ningxy
 * @date 2019/10/19
 */
public class BookShelfIterator implements Iterator<Book> {

    private BookShelf bookShelf;
    private int index = 0;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Book next() {
        Book book = bookShelf.getIndexAt(index);
        index++;
        return book;
    }
}
