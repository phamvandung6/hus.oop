package hus.oop.lab10.builder_pattern.bai_1.cars;

public class Car {

    private String seats;
    private String engine;
    private boolean hasTripComputer;
    private boolean hasGPS;

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTripComputer(boolean hasTripComputer) {
        this.hasTripComputer = hasTripComputer;
    }

    public void setGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    public String getSeats() {
        return seats;
    }

    public String getEngine() {
        return engine;
    }

    public boolean hasTripComputer() {
        return hasTripComputer;
    }

    public boolean hasGPS() {
        return hasGPS;
    }
}
