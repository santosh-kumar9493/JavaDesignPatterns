package designpatterns.command;

import java.util.Stack;

public class RemoteControl {
    Stack<ICommand> commands;
    private ICommand command;

    public RemoteControl() {
        this.commands = new Stack<>();
    }

    public void setCommand(ICommand command){
        this.command=command;
    }
    public void pressButton(){
        this.command.execute();
        commands.add(this.command);
    }

    public void undo(){
        while(!commands.isEmpty()){
            commands.pop().undo();
        }
    }
}
