package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.example.item03.supplier_example.Concert;
import org.example.item03.supplier_example.Elvis;

public class Main {
  public static void main(String[] args) {
    List<LocalDate> dates = new ArrayList<>();
    dates.add(LocalDate.of(1989, 7, 21));
    dates.add(LocalDate.of(1989, 7, 22));
    dates.add(LocalDate.of(1989, 7, 23));

    Predicate<LocalDate> localDatePredicate = d -> d.isBefore(LocalDate.of(2000, 1, 1));
    Function<LocalDate, Integer> getYear = LocalDate::getYear;

    List<Integer> collect = dates.stream()
      .filter(localDatePredicate)
      .map(getYear)
      .collect(Collectors.toList());
  }

}