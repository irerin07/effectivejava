package org.example;

import java.util.Collections;
import java.util.List;

import org.example.item03.supplier_example.Concert;
import org.example.item03.supplier_example.Elvis;

public class Main {
  public static void main(String[] args) {
    Concert concert = new Concert();
    concert.start(Elvis::getInstance);

  }
}