package com.company.pr1;

import com.company.pr1.Book;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("Harry in the forest", "Gerst", 1999);

        System.out.println();
        System.out.println(book.toString());
    }
}
