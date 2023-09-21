package org.example.item03;

/**
 * @author 민경수
 * @description elvis
 * @since 2023.09.21
 **********************************************************************************************************************/
public class Elvis implements IElvis{
  /**
   * 싱글톤 오브젝트
   */
  public static final Elvis INSTANCE = new Elvis();

  private Elvis() {}

  public void leaveTheBuilding() {
    System.out.println("Whoa baby, I'm otta here!");
  }

  public void sing() {
    System.out.println("I'll have a blue~ Christmas without you~");
  }

}