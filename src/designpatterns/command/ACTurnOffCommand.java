package designpatterns.command;

public class ACTurnOffCommand implements ICommand{
    AirConditionar airConditionar;
    ACTurnOffCommand(AirConditionar airConditionar){
        this.airConditionar=airConditionar;
    }
    @Override
    public void execute(){
        this.airConditionar.turnOff();
    }
    @Override
    public void undo(){
        this.airConditionar.turnOn();
    }
}
