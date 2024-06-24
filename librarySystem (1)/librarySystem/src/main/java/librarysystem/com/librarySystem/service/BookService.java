package librarysystem.com.librarySystem.service;

import librarysystem.com.librarySystem.model.Book;

import java.util.List;

public interface BookService {

//    createBook

    String createBook(Book book);
    String updatebook(Book book);

    Book getbookById(String bookId);

    String deleteExistedBook(String bookId);

    List<Book> getAllBooks();

    List <Book> getbookByName (String bookName );




}
