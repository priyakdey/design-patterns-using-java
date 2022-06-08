package com.priyakdey.design.patterns.structural.composite.example1;

import java.util.ArrayList;

public class BookCollection extends Book {

  private ArrayList<Book> books = new ArrayList();

  public void addBook(Book book) {
    books.add(book);
  }


  public void checkout() {
    books.forEach(Book::checkout);
  }

  public void returnBook() {
    books.forEach(Book::returnBook);
  }


}
