package org.example.item03.method_reference_example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 민경수
 * @description person
 * @since 2023.09.22
 **********************************************************************************************************************/
public class Person {

  LocalDate birthday;

  public Person(LocalDate birthday) {
    this.birthday = birthday;
  }

  public int getAge() {
    return LocalDate.now().getYear() - birthday.getYear();
  }

  public int compareByAge(Person b) {
    return this.birthday.compareTo(b.birthday);
  }

  public static void main(String[] args) {
    List<LocalDate> dates = new ArrayList<>();
    dates.add(LocalDate.of(1989, 7, 21));
    dates.add(LocalDate.of(1988, 7, 21));
    dates.add(LocalDate.of(1987, 7, 21));

    List<Person> collect = dates.stream().map(Person::new).collect(Collectors.toList());

    List<Person> people = new ArrayList<>();
    people.add(new Person(LocalDate.of(1982, 7, 15)));
    people.add(new Person(LocalDate.of(2011, 8, 4)));
    people.add(new Person(LocalDate.of(2013, 4, 30)));

    people.sort(Person::compareByAge);
  }

}