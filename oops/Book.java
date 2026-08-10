package oops;

public class Book {
    String title;
    String author;
    double price;
    public Book(){
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }
    public Book(String title, String author){
        this.title = title;
        this.author = author;
        price = 0.0;
    }
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Java", "srashti");
        Book book3 = new Book("Python", "ananya", 30000000.99);
        book1.display();
        book2.display();
        book3.display();
        
    }
}
