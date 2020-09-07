package com.company;

public class Book {
    private String name;
    private String author;
    public Book(String n, String a){
        this.name=name;
        this.author=name;
    }
    public Book(String n){
        this.name=n;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public String toString(){
        return name+" was written by "+author;
    }
}
