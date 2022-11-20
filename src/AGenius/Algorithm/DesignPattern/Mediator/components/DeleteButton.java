package AGenius.Algorithm.DesignPattern.Mediator.components;

import AGenius.Algorithm.DesignPattern.Mediator.mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class DeleteButton extends JButton implements Component {

    private Mediator mediator;

    public DeleteButton() {
        super("Del");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent event) {
        mediator.deleteNote();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
