package designpatterns.command;

public class ACTurnOnCommand implements ICommand{
    AirConditionar airConditionar;
    ACTurnOnCommand(AirConditionar airConditionar){
        this.airConditionar=airConditionar;
    }
    @Override
    public void execute(){
        this.airConditionar.turnOn();
    }
    @Override
    public void undo(){
        this.airConditionar.turnOff();
    }
}
