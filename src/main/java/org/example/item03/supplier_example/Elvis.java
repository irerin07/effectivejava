package org.example.item03.supplier_example;

/**
 * @author 민경수
 * @description elvis
 * @since 2023.09.21
 **********************************************************************************************************************/
public class Elvis implements Singer{

  private static final Elvis INSTANCE = new Elvis();

  private Elvis() { }

  public static Elvis getInstance() { return INSTANCE; }

  public void leaveTheBuilding() {
    System.out.println("Whoa baby, I'm outta here!");
  }


  @Override
  public void sing() {
    System.out.println("my way~");
  }

}