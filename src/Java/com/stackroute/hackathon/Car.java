package com.stackroute.hackathon;

class Car {


   int wheel;
   int engine1=0;
   private int engine;


       Car(int ccylinder,String nname)
       {
           wheel = 4;
           System.out.print(ccylinder);
           System.out.print(nname);


       }


    public static void break()
    {
        System.out.println("stop");
    }
    public int getEngine() {
        return engine;
    }
    public void setEngine (int engine){
        engine1 = engine;
    }

}
public class Audi extends Car {
    public static void main(String args[]) {
        Car objcar = new Car(123,"audi");

    }
    int engine, cylinder, wheel;
    String name;
    public int getEngine() {
        return engine;
    }
    public void setEngine (int engine){
        this.engine = engine;
    }
    public int getCylinder () {
        return cylinder;
    }
    public void setCylinder ( int cylinder){
        this.cylinder = cylinder;
    }

    void break()
    {
        System.out.println("stop");
    }
}
