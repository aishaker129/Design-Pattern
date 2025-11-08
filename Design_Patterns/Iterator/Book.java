package Design_Patterns.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String bookTitle;

    public Book(String bookTitle){
        this.bookTitle = bookTitle;
    }

    public String getBookTitle(){
        return bookTitle;
    }
}

interface Iterator<T>{
    boolean hasNext();
    T next();
}

class BookIterator implements Iterator<Book>{
    private List<Book> books;
    private int position = 0;
    
    BookIterator(List<Book> books){
        this.books = books;
    }

    public boolean hasNext(){
        return position < books.size();
    }

    public Book next(){
        return books.get(position++);
    }
}

interface BookCollect{
    Iterator<Book> createIterator();
}

class Library implements BookCollect{
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public Iterator<Book> createIterator(){
        return new BookIterator(books);
    }
}
