/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author ASUS
 */
public class MountainTruck extends Truck {
    //the Mountaintruck subclass adds one fields
    public int seatHeight;
    private String gear;
    //the Mountaintruck subclass has one constructor
    public MountainTruck (int startHeight, int startCadence, int startSpeed, int startGear){
        super (startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }
    //the mountaintruck subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("mulai Berjalan");
        MountainTruck MB = new MountainTruck(0,0,0,0);
        System.out.println("gear="+ MB.gear);
        System.out.println("speed="+ MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("gear="+ MB.gear);
        System.out.println("speed="+ MB.speed);
        MB.speedUp(2);
        System.out.println("gear="+ MB.gear);
        System.out.println("speed="+ MB.speed);
    }
    
}
