package librarysystem.com.librarySystem.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    @Column(name = "book_ID")

    private  String bookid ;

    @Column(name = "book_Name")

    private String bookname ;

    @Column(name = "book_Author")

    private String bookAuthor ;

    @Column(name = "book_category")

    private String bookCategory;


    public Book() {
    }

    public Book(String bookid, String bookname, String bookAuthor, String bookCategory) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.bookAuthor = bookAuthor;
        this.bookCategory = bookCategory;
    }

    public String getBookid() {
        return bookid;
    }




    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }
}
