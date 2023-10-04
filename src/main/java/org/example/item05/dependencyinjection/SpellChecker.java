package org.example.item05.dependencyinjection;

import java.util.List;
import java.util.function.Supplier;

import org.example.item05.PowerDictionary;

/**
 * @author 민경수
 * @description spell checker
 * @since 2023.10.04
 **********************************************************************************************************************/
public class SpellChecker {

  private final PowerDictionary dictionary;

  public SpellChecker(PowerDictionary dictionary) {
    this.dictionary = dictionary;
  }

  public SpellChecker(Supplier<PowerDictionary> powerDictionaryFactory) {
    this.dictionary = powerDictionaryFactory.get();
  }

  public boolean isValid(String word) {
    return dictionary.contains(word);
  }

  public List<String> suggestions(String typo){
    return dictionary.closeWordsTo(typo);
  }

}