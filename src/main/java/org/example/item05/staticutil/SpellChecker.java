package org.example.item05.staticutil;

import java.util.List;

import org.example.item05.DefaultDictionary;
import org.example.item05.Dictionary;

/**
 * @author 민경수
 * @description spell checker
 * @since 2023.10.04
 **********************************************************************************************************************/
public class SpellChecker {
  private static final Dictionary dictionary = new DefaultDictionary();

  private SpellChecker() {

  }

  public static boolean isValid(String word) {
    return dictionary.contains(word);
  }

  public static List<String> suggestions(String typo){
    return dictionary.closeWordsTo(typo);
  }
}