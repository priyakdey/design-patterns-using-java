package com.priyakdey.design.patterns.structural.composite.example1;

public class FictionBook extends Book {

  String name;
  boolean checkedOut;
  boolean isAPlay;

  public FictionBook(String name, boolean isAPlay) {
    this.name = name;
    this.isAPlay = isAPlay;
    checkedOut = false;
  }

  public void checkout() {
    if(!checkedOut) {
      System.out.println("Checking out " + name + "\n");
      checkedOut = true;
    } else {
      System.out.println(name + " is already checked out\n");
    }
  }

  public void returnBook() {
    if(checkedOut) {
      System.out.println("Returning " + name + "\n");
      checkedOut = false;
    } else {
      System.out.println(name + " is not checked out\n");
    }
  }

}
