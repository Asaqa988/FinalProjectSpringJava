package librarysystem.com.librarySystem.service;

import librarysystem.com.librarySystem.model.Book;

import java.util.List;

public class BookImpl implements  BookService {

    public String createBook(Book book) {

        return  "book has been added";
    }

    public String updatebook (Book book){

        return  "book has been updated !";
    }



    public String deleteExistedBook (String bookId){

        return  "book is deleted";
    }

    public List getAllBooks (){
        return  books ;
    }



    //    public Book getbookById (String bookId){
//
//        return  book;
//    }

    public List getbookByName (String bookName){

        return  books  ;
    }


}
