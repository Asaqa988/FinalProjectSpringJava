package librarysystem.com.librarySystem.service;

import librarysystem.com.librarySystem.model.Book;

import java.util.List;

public class BookImpl implements  BookService {
    private final BookRepository bookRepository ;

    public BookImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }















@Override
    public String createBook(Book book) {
     bookRepository.save(book);
        return  "book has been added";
    }

    @Override
    public String updatebook(Book book) {
        bookRepository.save(book);
        return "book has been updated";
    }

    @Override
    public Book getbookById(String bookId) {

        return   bookRepository.findById(bookId).orElse(null);

    }

    @Override
    public String deleteExistedBook(String bookId) {
        bookRepository.deleteById(bookId);

        return "book has been deleted";
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> getbookByName(String bookName) {
        return bookRepository.findByBookName(bookName);
    }


}
