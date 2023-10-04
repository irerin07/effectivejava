package org.example.item05.dependencyinjection;

import java.util.function.Supplier;

import org.example.item05.PowerDictionary;
import org.example.item05.SuperPowerDictionary;

/**
 * @author 민경수
 * @description test
 * @since 2023.10.04
 **********************************************************************************************************************/
public class Test {
  private Supplier<? extends PowerDictionary> factory;

  public Test(Supplier<? extends PowerDictionary> factory) {
    this.factory = factory;
  }

  public PowerDictionary createObject() {
    return factory.get();
  }

}