package Design_Patterns.Iterator;

public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Java"));
        library.addBook(new Book("Design Pattern"));
        library.addBook(new Book("Spring Boot"));

        Iterator<Book> it = library.createIterator();

        System.out.println("Books in library...");
        while(it.hasNext()){
            System.out.println(it.next().getBookTitle());
        }
    }
}
