package hus.oop.lab10.builder_pattern.bai_1.builders;

import hus.oop.lab10.builder_pattern.bai_1.cars.Car;

public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public Builder reset() {
        this.car = new Car();
        return this;
    }

    @Override
    public Builder setSeats(String seats) {
        this.car.setSeats(seats);
        return this;
    }

    @Override
    public Builder setEngine(String engine) {
        this.car.setEngine(engine);
        return this;
    }

    @Override
    public Builder setTripComputer(boolean hasTripComputer) {
        this.car.setTripComputer(hasTripComputer);
        return this;
    }

    @Override
    public Builder setGPS(boolean hasGPS) {
        this.car.setGPS(hasGPS);
        return this;
    }

    public Car getProduct() {
        Car product = this.car;
        this.reset();
        return product;
    }

}