package Bicycle;

public class DriveSystem {
    private Gear gear;
    private Wheel wheel;
    public void increaseRPM( Gear gear, Wheel wheel){
        this.gear = gear;
        this.wheel = wheel;
    }
}
