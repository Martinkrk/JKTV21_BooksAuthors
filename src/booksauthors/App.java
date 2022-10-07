package booksauthors;

import myclasses.Author;
import myclasses.Book;
import tools.Tools;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pupil
 */
public class App {
    public void run(){
        Tools tool = new Tools();
        Book[] books = new Book[5];
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Create 5 books!");
        for(int i=0; i < 5;i++){
            System.out.println("Title of the book: ");
            books[i] = tool.createBook(scn.nextLine());
            System.out.println("How many authors?");
            int authorsNum = scn.nextInt();
            scn.nextLine();
            for(int j=0;j < authorsNum; j++){
                System.out.printf("Author %d. Enter first name%n", j+1);
                String first = scn.nextLine();
                System.out.printf("Author %d. Enter last name%n", j+1);
                String last = scn.nextLine();
                
                books[i].addAuthor(tool.createAuthor(first, last)); 
            }
        }
        System.out.println(books[0]);
    }
}
