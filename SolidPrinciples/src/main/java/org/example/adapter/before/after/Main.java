package org.example.adapter.before.after;



public class Main {

  public static void main(String[] args) {
    IndianCharger indianCharger = new IndianCharger();
    chargePhones(indianCharger);

    UsCharger usCharger = new UsCharger();
    Charger usToIndianChargerAdapter = new UsToIndianChargerAdapter(usCharger);
    chargePhones(usToIndianChargerAdapter);

  }

  public static void chargePhones(Charger charger) {
      charger.charge();
  }
}
