package AGenius.Java.DesignPattern.Mediator;

import AGenius.Java.DesignPattern.Mediator.components.*;
import AGenius.Java.DesignPattern.Mediator.mediator.Editor;
import AGenius.Java.DesignPattern.Mediator.mediator.Mediator;

import javax.swing.*;

public class App {

    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
