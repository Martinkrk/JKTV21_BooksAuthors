/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import myclasses.Author;
import myclasses.Book;

/**
 *
 * @author pupil
 */
public class Tools {
    public Author createAuthor(String first, String last){
        Author author = new Author();
        author.setFirstName(first);
        author.setLastName(last);
        return author;
    }
    public Book createBook(String title){
        Book book = new Book();
        book.setTitle(title);
        return book;
    }
}
