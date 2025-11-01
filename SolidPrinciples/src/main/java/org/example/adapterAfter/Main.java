package org.example.adapterAfter;



public class Main {
  public static void main(String[] args) {
    Charger indianCharger = new IndianCharger();
    USCharger usCharger = new USCharger();
    Charger adaptedCharger = new UsToIndianAdapterCharger(usCharger);

    chargePhones(indianCharger);
    chargePhones(adaptedCharger);
  }


  public static void chargePhones(Charger charger) {
    charger.charge();
  }
}
