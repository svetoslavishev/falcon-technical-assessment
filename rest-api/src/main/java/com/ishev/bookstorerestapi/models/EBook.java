package com.ishev.bookstorerestapi.models;

import javax.persistence.*;

@Entity
@Table(name = "item_ebook")
public class EBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_item_ebook")
    private int eBookId;

    @Column(name = "id_item")
    private int itemId;

    @Column(name = "ebook_title")
    private String title;

    @Column(name = "ebook_author_name")
    private String authorName;

    @Column(name = "ebook_price")
    private double price;

    @Column(name = "ebook_stock")
    private int inStockQuantity;

    public EBook() {

    }

    public EBook(int eBookId, int itemId, String title, String authorName, double price, int inStockQuantity) {
        setEBookId(eBookId);
        setItemId(itemId);
        setTitle(title);
        setAuthorName(authorName);
        setPrice(price);
        setInStockQuantity(inStockQuantity);
    }

    public int getEBookId() {
        return eBookId;
    }

    public void setEBookId(int bookId) {
        this.eBookId = bookId;
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
