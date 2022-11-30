package AGenius.Java.DesignPattern.State;

import AGenius.Java.DesignPattern.State.ui.Player;
import AGenius.Java.DesignPattern.State.ui.UI;

public class App {

    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
