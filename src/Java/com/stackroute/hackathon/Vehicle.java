package com.stackroute.hackathon;

public class Vehicle {
    public static void main(String args[])
    {
        String engine;
        int milege;
    }
}
class car extends Vehicle{
    int noofSeats;
    public int getNumberofSeats()
    {

    }

}
class Honda extends car{
    int noofSeats;
    int hondaSpeed;

  /* public int getNoofSeats() {
       return noofSeats;
   }

   public void setNoofSeats(int noofSeats) {
       this.noofSeats = noofSeats;
   }

   public void setHondaSpeed(int hondaSpeed) {
       this.hondaSpeed = hondaSpeed;
   }

   public int getHondagear() {
       return hondagear;
   }

   public void setHondagear(int hondagear) {
       this.hondagear = hondagear;
   }*/

    int hondagear;
    public int getNumberofSeats()
    {
        return this.noofSeats;
    }
    public void setSpeed(int speed)
    {
        hondaSpeed=speed;
    }
    public int getHondaSpeed()
    {
        return hondaSpeed;
    }

    public void setgear(int gear)
    {
        hondagear=gear;
    }
    public int getgear()
    {
        return hondagear;
    }

}