package org.example.adapter;

public class Main {

  public static void main(String[] args) {
    Charger indianCharger = new IndianCharger();
    USCharger usCharger = new USCharger();

    chargePhones(indianCharger);
//    chargePhones(usCharger);
  }


  public static void chargePhones(Charger charger) {
    charger.charge();
  }
}
