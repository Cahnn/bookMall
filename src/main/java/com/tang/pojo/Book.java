package com.tang.pojo;

public class Book {
    private int id;
    private String title;
    private String author;
    private String intro;
    private Float price;
    private int sold;
    private int inventory;

    public Book() {
    }

    public Book(int id, String title, String author, String intro, Float price, int sold, int inventory) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.intro = intro;
        this.price = price;
        this.sold = sold;
        this.inventory = inventory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", intro='" + intro + '\'' +
                ", price=" + price +
                ", sold=" + sold +
                ", inventory=" + inventory +
                '}';
    }
}
