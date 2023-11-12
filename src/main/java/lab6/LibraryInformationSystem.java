package lab6;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String publisher;
    private int year;

    public Book(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString(){
        return getTitle() + ", " + getPublisher()+ ", " +getYear();
    }

}

class Library{
    private List<Book> booksInLibrary = new ArrayList<Book>();
    public void addBook(Book book){
        booksInLibrary.add(book);
    }
    public void printBooks(){
        for (Book element : booksInLibrary){
            System.out.println(element);
        }
    }
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book:booksInLibrary){
            if (StringUtils.included(book.getTitle(), title)){
                found.add(book);
            }
        }
        return found;
    }
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book:booksInLibrary){
            if (StringUtils.included(book.getPublisher(), publisher)){
                found.add(book);
            }
        }
        return found;
    }
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book:booksInLibrary){
            if (year==book.getYear()){
                found.add(book);
            }
        }
        return found;
    }
}

class StringUtils {
    public static boolean included(String word, String searched) {
        if (word == null || searched == null) {
            return false;
        }

        word = word.trim().toUpperCase();
        searched = searched.trim().toUpperCase();

        return word.contains(searched);
    }
}