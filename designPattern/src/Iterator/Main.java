package Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the world in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Harry Potter"));

        // 명시적으로 Iterator를 사용하는 방법
        Iterator<Book> iterator = bookShelf.iterator();
        while(iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getName());
        }
        System.out.println();
    }
}
