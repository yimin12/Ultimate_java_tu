package AGenius.Algorithm.DesignPattern.State;

import AGenius.Algorithm.DesignPattern.State.ui.Player;
import AGenius.Algorithm.DesignPattern.State.ui.UI;

public class App {

    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
