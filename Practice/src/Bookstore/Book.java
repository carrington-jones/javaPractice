package Bookstore;

public class Book extends Product{

    public Author author;

    public Book(String title, String price, Author author) {
        super(title, price);
        this.author = author;
    }
}
