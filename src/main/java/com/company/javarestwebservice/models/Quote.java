package com.company.javarestwebservice.models;

public class Quote {

    private String quote;
    private String author;
    private int id;

    public Quote(String quote, String author, int id) {
        this.quote = quote;
        this.author = author;
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
