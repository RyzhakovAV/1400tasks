package com.company.test;

public class Book extends Closet{
    public String name;
    public String autor;
    public int count;

    public Book(String name, String autor, int count) {
        this.name = name;
        this.autor = autor;
        this.count = count;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                ", count=" + count +
                '}';
    }
}
