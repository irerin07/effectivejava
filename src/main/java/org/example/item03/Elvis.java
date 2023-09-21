package org.example.item03;

/**
 * @author
 * @description elvis
 * @since 2023.09.21
 **********************************************************************************************************************/
public class Elvis {
  private static final Elvis INSTANCE = new Elvis();
  private Elvis() {

  }

  public static Elvis getInstance() {
    return INSTANCE;
  }

  public void leaveTheBuilding() {
    System.out.println("Whoa baby, I'm outta here!");
  }

}