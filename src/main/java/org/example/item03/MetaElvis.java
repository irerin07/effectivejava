package org.example.item03;

/**
 * @author 민경수
 * @description meta elvis
 * @since 2023.09.21
 **********************************************************************************************************************/
public class MetaElvis<T> {

  private static final MetaElvis<Object> INSTANCE = new MetaElvis<>();

  private MetaElvis() {

  }

  // 제네릭 싱글톤 팩터리
  @SuppressWarnings("unchecked")
  public static <T> MetaElvis<T> getInstance() {
    return (MetaElvis<T>) INSTANCE;
  }

  public void say(T t) {
    System.out.println(t);
  }

  public void leaveTheBuilding() {
    System.out.println("Whoa baby, I'm outta here!");
  }

}