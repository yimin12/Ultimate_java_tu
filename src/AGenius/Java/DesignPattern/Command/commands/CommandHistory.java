package AGenius.Java.DesignPattern.Command.commands;

import java.util.Stack;

public class CommandHistory {

    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return this.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}
