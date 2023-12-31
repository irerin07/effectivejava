package org.example.item03;

/**
 * @author
 * @description concert
 * @since 2023.09.21
 **********************************************************************************************************************/
public class Concert {

  private boolean lightsOn;

  private boolean mainStateOpen;

  private IElvis elvis;

  public Concert(IElvis elvis) {
    this.elvis = elvis;
  }

  public void perform() {
    mainStateOpen = true;
    lightsOn = true;
    elvis.sing();
  }

  public boolean isLightsOn() {
    return lightsOn;
  }

  public boolean isMainStateOpen() {
    return mainStateOpen;
  }

}