package com.campusdual.classroom;

public class FuelTank {

  private int actualFuel = 10;



  public void showDetails() {
    int fuel = getActualFuel();
    System.out.println("La capacidad actual es de " + fuel + " litros.");
  }

  public int getActualFuel() {
    return this.actualFuel;
  }


  public void setActualFuel(int fuel){

      if (fuel > 0) {
          this.actualFuel = fuel;
      } else {
        System.out.println("Error: No se puede establecer un valor negativo");
      }
  }



}




