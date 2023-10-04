package org.example.item03.serializable_example;

import java.io.Serializable;

/**
 * @author 민경수
 * @description book
 * @since 2023.09.22
 **********************************************************************************************************************/
public class Book implements Serializable {

  public static String name;
  public String isbn;
  private transient int stock;

  public Book(String isbn, int stock) {
    this.isbn = isbn;
    this.stock = stock;
  }

  @Override
  public String toString() {
    return "Book{" + "isbn='" + isbn + '\'' + ", stock=" + stock + '}' + name;
  }

  public static String getName() {
    return name;
  }

  public static void setName(String name) {
    Book.name = name;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }
}