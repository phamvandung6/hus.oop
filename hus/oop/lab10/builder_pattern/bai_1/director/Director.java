package hus.oop.lab10.builder_pattern.bai_1.director;

import hus.oop.lab10.builder_pattern.bai_1.builders.Builder;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.reset()
                .setSeats("2")
                .setEngine("SportEngine")
                .setTripComputer(true)
                .setGPS(true);
    }

    public void constructSUV(Builder builder) {
        builder.reset().setSeats("5").setEngine("SUVEngine").setTripComputer(false).setGPS(true);
    }
}