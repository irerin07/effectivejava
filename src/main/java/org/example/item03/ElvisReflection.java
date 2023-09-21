package org.example.item03;

import java.lang.reflect.Constructor;
import java.util.List;

/**
 * @author
 * @description elvis reflection
 * @since 2023.09.21
 **********************************************************************************************************************/
public class ElvisReflection {

  public static void main(String[] args) {

    try {
      Constructor<Elvis> defaultConstructor = Elvis.class.getDeclaredConstructor();
      defaultConstructor.setAccessible(true);
      Elvis elvis1 = defaultConstructor.newInstance();
      Elvis elvis2 = defaultConstructor.newInstance();
      System.out.println(elvis1 == elvis2);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}