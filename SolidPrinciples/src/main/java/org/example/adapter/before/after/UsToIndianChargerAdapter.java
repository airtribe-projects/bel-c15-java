package org.example.adapter.before.after;



public class UsToIndianChargerAdapter implements Charger {

  private UsCharger _usCharger;

  public UsToIndianChargerAdapter(UsCharger usCharger) {
    _usCharger = usCharger;
  }

  @Override
  public void charge() {
    _usCharger.chargeInUsFormat();
  }
}
