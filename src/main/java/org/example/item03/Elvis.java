package org.example.item03;

/**
 * @author
 * @description elvis
 * @since 2023.09.21
 **********************************************************************************************************************/
public class Elvis implements IElvis{
  /**
   * 싱글톤 오브젝트
   */
  public static final Elvis INSTANCE = new Elvis();
  private static boolean cretaed;

  private Elvis() {
    if (cretaed) {
      throw new UnsupportedOperationException("Cannot be created by constructor");
    }

    cretaed = true;
  }

  public void leaveTheBuilding() {
    System.out.println("Whoa baby, I'm otta here!");
  }

  public void sing() {
    System.out.println("I'll have a blue~ Christmas without you~");
  }

  private Object readResolve() {
    return INSTANCE;
  }

}