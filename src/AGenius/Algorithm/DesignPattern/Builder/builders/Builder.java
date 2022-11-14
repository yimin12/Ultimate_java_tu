package AGenius.Algorithm.DesignPattern.Builder.builders;

import AGenius.Algorithm.DesignPattern.Builder.cars.CarType;
import AGenius.Algorithm.DesignPattern.Builder.components.Engine;
import AGenius.Algorithm.DesignPattern.Builder.components.GPSNavigator;
import AGenius.Algorithm.DesignPattern.Builder.components.Transmission;
import AGenius.Algorithm.DesignPattern.Builder.components.TripComputer;

public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
