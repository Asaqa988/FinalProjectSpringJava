package librarysystem.com.librarySystem.controller;


import librarysystem.com.librarySystem.model.Book;
import librarysystem.com.librarySystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

private final BookService bookService ;


@Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping("/{book_id}")

    public Book getBookById(@PathVariable("book_id") String bookId){

    return  bookService.getbookById(bookId);
    }

    @PostMapping

    public String addNewBook(@RequestBody Book book) {
    return  bookService.createBook(book);
    }

    @PutMapping
    public String updateBookInformation(@RequestBody Book book) {
        return  bookService.updatebook(book);
    }

    @DeleteMapping("/{book_id}")

    public String deleteBook(@PathVariable("book_id") String bookId) {
    return bookService.deleteExistedBook(bookId);
    }

    @GetMapping
    public List<Book> getAllBooks(){
    return  bookService.getAllBooks();
    }

    @GetMapping("/search")

    public List<Book> getBookByName (@RequestParam("name") String bookname){
    return bookService.getbookByName(bookname);
    }






}
