package com.company.pr2;

class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.gender + ") at "+ this.email;
    }
}

public class TestAuthor{
    public static void main(String[] args) {
        Author author = new Author("Robunov", "Robunov@mail.ru", 'M');
        author.setEmail("Robunov@gmail.com");
        System.out.println(author);
    }
}
