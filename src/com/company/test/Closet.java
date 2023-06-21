package com.company.test;

public class Closet{
    public Book[] closet = new Book[Main.size];
    public int i = 0;

    public void add(Book book) {
        closet[i] = book;
        i++;
    }

}
