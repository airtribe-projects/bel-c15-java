package org.example.adapterAfter;

public class UsToIndianAdapterCharger implements Charger {

  private USCharger _usCharger;

  public UsToIndianAdapterCharger(USCharger usCharger) {
    _usCharger = usCharger;
  }

  @Override
  public void charge() {
    _usCharger.chargeInUsFormat();
  }
}
