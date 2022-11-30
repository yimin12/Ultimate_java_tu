package AGenius.Java.DesignPattern.Builder.components;

public class GPSNavigator {

    private String route;

    public GPSNavigator() {
        this.route = "10 Summer Street, Apt 809, Malden, Gateway Center";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
