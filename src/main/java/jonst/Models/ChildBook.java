package jonst.Models;

import jonst.App;

import java.util.Arrays;

public class ChildBook extends Book {

    protected static Book[] bookList = new Book[0];

    public ChildBook(String author, int year, String category, String title) {
        super(author, year, category, title);

        this.addToList(this);
    }

    public ChildBook(String author, int year, String category, String title, int pagesOfBook) {
        super(author, year, category, title, pagesOfBook);

        this.addToList(this);
    }

    public static Book[] showChildBook(){

        return bookList;
    }


    public void addToList(Book book){
        bookList = Arrays.copyOf(bookList, bookList.length+1);

        bookList[bookList.length-1] = book;
    }

    public static String searchChildBook(){
        System.out.print("Title: ");
        String searchLine = App.inputData.nextLine();

        for (Book book : bookList) {

            if(searchLine.trim().equals(book.getTitle())){
                return (book.getAuthor() + ": " + book.getTitle() + "(" + book.getYear() + ")");
            }

        }
        return "Book does not exist!";
    }

}
