package org.example.item02;

import java.util.Objects;

/**
 * @author 민경수
 * @description nypizza
 * @since 2023.09.20
 **********************************************************************************************************************/
public class NYPizza extends Pizza{
  public enum Size {SMALL, MEDIUM, LARGE}
  private final Size size;

  public static class Builder extends Pizza.Builder<NYPizza.Builder> {
    private final Size size;

    public Builder(Size size) {
      this.size = Objects.requireNonNull(size);
    }

    @Override
    public NYPizza build() {
      return new NYPizza(this);
    }

    @Override
    protected Builder self() {
      return this;
    }

  }

  private NYPizza(Builder builder) {
    super(builder);
    this.size = builder.size;
  }

  @Override
  public String toString() {
    return toppings + "로 토핑한 뉴욕피자 사이즈 : " + size;
  }
}