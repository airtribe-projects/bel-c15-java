package org.example.adapter.before;

public class Main {
  public static void main(String[] args) {
    Charger indianCharger = new IndianCharger();
    chargePhones(indianCharger);

    UsCharger usCharger = new UsCharger();
//    chargePhones(usCharger);
  }

    public static void chargePhones(Charger charger) {

    }
}
