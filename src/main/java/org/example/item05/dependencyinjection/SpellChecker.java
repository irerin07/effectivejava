package org.example.item05.dependencyinjection;

import java.util.List;

import org.example.item05.Dictionary;

/**
 * @author 민경수
 * @description spell checker
 * @since 2023.10.04
 **********************************************************************************************************************/
public class SpellChecker {

  private final Dictionary dictionary;

  public SpellChecker(Dictionary dictionary) {
    this.dictionary = dictionary;
  }

  public boolean isValid(String word) {
    return dictionary.contains(word);
  }

  public List<String> suggestions(String typo){
    return dictionary.closeWordsTo(typo);
  }

}