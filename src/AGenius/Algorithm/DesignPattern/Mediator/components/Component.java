package AGenius.Algorithm.DesignPattern.Mediator.components;

import AGenius.Algorithm.DesignPattern.Mediator.mediator.Mediator;

public interface Component {

    void setMediator(Mediator mediator);
    String getName();
}
