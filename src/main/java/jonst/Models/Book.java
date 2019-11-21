package jonst.Models;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
    private String author;
    private int year;
    private String category;
    private String title;
    private int pagesOfBook;



    public Book(String author, int year, String category, String title) {
        this.author = author;
        this.year = year;
        this.category = category;
        this.title = title;
        pagesOfBook = 100;
    }

    public Book(String author, int year, String category, String title, int pagesOfBook) {
        this(author, year, category, title);
        this.pagesOfBook = pagesOfBook;
    }


    public int returnPages(){
        return pagesOfBook;
    }




    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }


}
