package org.example.item05;

import java.util.List;

/**
 * @author 민경수
 * @description default dictionary
 * @since 2023.10.04
 **********************************************************************************************************************/
public class DefaultDictionary implements Dictionary{

  public boolean contains(String word) {
    return false;
  }

  public List<String> closeWordsTo(String typo) {
    return null;
  }

}