package AGenius.Java.DesignPattern.Builder.builders;

import AGenius.Java.DesignPattern.Builder.cars.CarType;
import AGenius.Java.DesignPattern.Builder.components.Engine;
import AGenius.Java.DesignPattern.Builder.components.GPSNavigator;
import AGenius.Java.DesignPattern.Builder.components.Transmission;
import AGenius.Java.DesignPattern.Builder.components.TripComputer;

public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
