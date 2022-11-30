package AGenius.Java.DesignPattern.Bridge;

import AGenius.Java.DesignPattern.Bridge.devices.Device;
import AGenius.Java.DesignPattern.Bridge.devices.Radio;
import AGenius.Java.DesignPattern.Bridge.devices.Tv;
import AGenius.Java.DesignPattern.Bridge.remotes.AdvancedRemote;
import AGenius.Java.DesignPattern.Bridge.remotes.BasicRemote;

public class App {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
