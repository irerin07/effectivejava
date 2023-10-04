package org.example.item03.serializable_example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * @author 민경수
 * @description serializable exmaple
 * @since 2023.09.22
 **********************************************************************************************************************/
public class SerializableExmaple {

  private void serialize(Book book) {
    try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("book.obj"))) {
      out.writeObject(book);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private Book deserialize() {
    try (ObjectInput in = new ObjectInputStream(new FileInputStream("book.obj"))) {
      return (Book) in.readObject();
    } catch (IOException | ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }

  public static void main(String[] args) {
    Book book = new Book("123", 2);
    book.setName("test");

    SerializableExmaple serializableExmaple = new SerializableExmaple();
    serializableExmaple.serialize(book);
    book.setName("test123");

    Book deserialize = serializableExmaple.deserialize();

    System.out.println(book);
    System.out.println(deserialize);
  }

}