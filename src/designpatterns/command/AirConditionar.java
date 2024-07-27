package designpatterns.command;

public class AirConditionar {
    private boolean turnOn;
    private int temperature;

    public boolean isTurnOn() {
        return turnOn;
    }

    public void turnOn() {
        System.out.println("Turned AC On");
        this.turnOn = true;
    }
    public void turnOff() {
        System.out.println("Turned AC Off");
        this.turnOn = false;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
