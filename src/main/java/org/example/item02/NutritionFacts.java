package org.example.item02;

/**
 * @author 민경수
 * @description nutrition facts
 * @since 2023.09.19
 **********************************************************************************************************************/
public class NutritionFacts {
  private final int servingSize;
  private final int servings;
  private final int calories;
  private final int fat;
  private final int sodium;
  private final int carbohydrate;


  public static class Builder {
    // 필수 매개변수
    private final int servingSize;
    private final int servings;

    // 섵낵 매개변수 - 기본값으로 초기화한다.
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public Builder(int servingSize, int servings) {
      this.servingSize = servingSize;
      this.servings = servings;
    }

    public Builder calories(int val) {
      calories = val;
      return this;
    }

    public Builder fat(int val) {
      calories = val;
      return this;
    }

    public Builder sodium(int val) {
      calories = val;
      return this;
    }

    public Builder carbohydrate(int val) {
      calories = val;
      return this;
    }

    public NutritionFacts build() {
      return new NutritionFacts(this);
    }
  }

  private NutritionFacts(Builder builder) {
    servingSize = builder.servingSize;
    servings = builder.servings;
    calories = builder.calories;
    fat = builder.fat;
    sodium = builder.sodium;
    carbohydrate = builder.carbohydrate;
  }




}