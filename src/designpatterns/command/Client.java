package designpatterns.command;


// This pattern is used to solving the do / undo kind of problems , every operation was made to a command
// For refernce : https://notebook.zohopublic.in/public/notes/u3i1s7022b343ebda42819272312415abb520
public class Client {
    public static void main(String[] args) {
        AirConditionar airConditionar = new AirConditionar();

        RemoteControl remoObj = new RemoteControl();

        remoObj.setCommand(new ACTurnOnCommand(airConditionar));

        remoObj.pressButton();
        remoObj.undo();


    }
}
