package com.company.pr1;

class Book {
    private String author;
    private String nameOfBook;
    private int year;

    public Book(String name, String author, int year) {
        this.nameOfBook = name;
        this.author = author;
        this.year = year;
    }

    public void set_Author(String auth){
        this.author = auth;
    }

    public void setName(String name){
        this.nameOfBook = name;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String getAuthor(){
        return author;
    }

    public String getName(){
        return nameOfBook;
    }

    public int getYear(){
        return year;
    }

    @Override
    public String toString() {
        return  "Book: " + '\n' +
                "name = " + nameOfBook + '\n' +
                "year = " + year + '\n' +
                "author = " + author;
    }
}
