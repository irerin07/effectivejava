package org.example.item02;

/**
 * @author
 * @description calzone
 * @since 2023.09.20
 **********************************************************************************************************************/
public class Calzone extends Pizza{
  private final boolean sauceInside;

  public static class Builder extends Pizza.Builder<Calzone.Builder> {
    private boolean sauceInside = false;

    public Builder sauceInside() {
      sauceInside = true;
      return this;
    }

    @Override
    public Calzone build() {
      return new Calzone(this);
    }

    @Override
    protected Builder self() {
      return this;
    }
  }

  private Calzone(Builder builder) {
    super(builder);
    sauceInside = builder.sauceInside;
  }

  @Override
  public String toString() {
    return String.format("%s");
  }

}