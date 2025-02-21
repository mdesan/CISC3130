package Homework.Hw2;

import java.util.Objects;

public class Book implements Comparable<Book>{

    private String title, author;
    private int publicationYear;
    private double price;

    public Book(String title, String author, int publicationYear, double price) {
        this.title = Objects.requireNonNull(title);
        this.author = Objects.requireNonNull(author);
        this.publicationYear = publicationYear;
        this.price = price;
    }



    public static void main(String[] args){
    }


    @Override
    public int compareTo(Book other) {
        if(this.publicationYear != other.publicationYear){
            return Integer.compare(this.publicationYear, other.publicationYear);
        }
        if (this.price != other.price){
            return Double.compare(this.price, other.price);
        }
        if(!this.author.equals(other.author)){
            return this.author.compareTo(other.author);
        }
        if(!this.title.equals(other.title)){
            return this.title.compareTo(other.title);
        }
        return 0;

    }
}
