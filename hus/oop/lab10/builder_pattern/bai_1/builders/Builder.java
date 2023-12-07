package hus.oop.lab10.builder_pattern.bai_1.builders;

public interface Builder {
    Builder reset();

    Builder setSeats(String seats);

    Builder setEngine(String engine);

    Builder setTripComputer(boolean hasTripComputer);

    Builder setGPS(boolean hasGPS);
}
