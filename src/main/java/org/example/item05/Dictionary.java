package org.example.item05;

import java.util.List;

/**
 * @author 민경수
 * @description dictionary
 * @since 2023.10.04
 **********************************************************************************************************************/
public interface Dictionary {

  public boolean contains(String word);

  public List<String> closeWordsTo(String typo);

}