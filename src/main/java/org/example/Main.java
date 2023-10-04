package org.example;

import java.util.function.Supplier;

import org.example.item05.PowerDictionary;
import org.example.item05.SuperPowerDictionary;
import org.example.item05.dependencyinjection.Test;

public class Main {
  public static void main(String[] args) {
    Supplier<PowerDictionary> powerDictionarySupplier = () -> new PowerDictionary();
    Test test = new Test(powerDictionarySupplier);

    Supplier<SuperPowerDictionary> superPowerDictionarySupplier = () -> new SuperPowerDictionary();
    Test test2 = new Test(superPowerDictionarySupplier);
  }

}