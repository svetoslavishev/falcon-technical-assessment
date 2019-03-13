package com.ishev.bookstorerestapi.models;

import javax.persistence.*;

@Entity
@Table(name = "item_book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_item_book")
    private int bookId;

    @Column(name = "id_item")
    private int itemId;

    @Column(name = "book_title")
    private String title;

    @Column(name = "book_author_name")
    private String authorName;

    @Column(name = "book_price")
    private double price;

    @Column(name = "book_stock")
    private int inStockQuantity;

    public Book() {

    }

    public Book(int bookId, int itemId, String title, String authorName, double price, int inStockQuantity) {
        setBookId(bookId);
        setItemId(itemId);
        setTitle(title);
        setAuthorName(authorName);
        setPrice(price);
        setInStockQuantity(inStockQuantity);
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInStockQuantity() {
        return inStockQuantity;
    }

    public void setInStockQuantity(int inStockQuantity) {
        this.inStockQuantity = inStockQuantity;
    }
}
