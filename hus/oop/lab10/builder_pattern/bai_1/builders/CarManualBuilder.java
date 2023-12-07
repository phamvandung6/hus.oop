package hus.oop.lab10.builder_pattern.bai_1.builders;

import hus.oop.lab10.builder_pattern.bai_1.cars.Manual;

public class CarManualBuilder implements Builder {
    private Manual manual;

    public CarManualBuilder() {
        this.reset();
    }

    public Builder reset() {
        this.manual = new Manual();
        return this;
    }

    public Builder setSeats(String seatInstructions) {
        this.manual.setSeatInstructions(seatInstructions);
        return this;
    }

    public Builder setEngine(String engineInstructions) {
        this.manual.setEngineInstructions(engineInstructions);
        return this;
    }

    public Builder setTripComputer(boolean hasTripComputer) {
        this.manual.setTripComputerInstructions(hasTripComputer ? "Install trip computer" : "No trip computer");
        return this;
    }

    public Builder setGPS(boolean hasGPS) {
        this.manual.setGPSInstructions(hasGPS ? "Install GPS" : "No GPS");
        return this;
    }

    public Manual getProduct() {
        Manual product = this.manual;
        this.reset();
        return product;
    }
}
