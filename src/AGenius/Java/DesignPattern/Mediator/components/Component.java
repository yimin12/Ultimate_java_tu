package AGenius.Java.DesignPattern.Mediator.components;

import AGenius.Java.DesignPattern.Mediator.mediator.Mediator;

public interface Component {

    void setMediator(Mediator mediator);
    String getName();
}
