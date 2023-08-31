package Bicycle;

public class Bicycle {
    private BrakeLever brakeLever;
    private Pedal pedal;
    private  HandleBar handleBar;

    public Bicycle(BrakeLever brakeLever, Pedal pedal, HandleBar handleBar) {
        this.brakeLever = brakeLever;
        this.pedal = pedal;
        this.handleBar = handleBar;
    }
    public void activateBreaks(){
        this.brakeLever = brakeLever;
    }
}
