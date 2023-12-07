package hus.oop.lab10.builder_pattern.bai_1;

import hus.oop.lab10.builder_pattern.bai_1.builders.CarBuilder;
import hus.oop.lab10.builder_pattern.bai_1.builders.CarManualBuilder;
import hus.oop.lab10.builder_pattern.bai_1.cars.Car;
import hus.oop.lab10.builder_pattern.bai_1.cars.Manual;
import hus.oop.lab10.builder_pattern.bai_1.director.Director;

public class Client {
  public static void main(String[] args) {
    Director director = new Director();

    // Create a car using the CarBuilder
    CarBuilder carBuilder = new CarBuilder();
    director.constructSportsCar(carBuilder);
    Car car = carBuilder.getProduct();
    System.out.println("Car seats: " + car.getSeats());
    System.out.println("Car engine: " + car.getEngine());
    System.out.println("Car has trip computer: " + car.hasTripComputer());
    System.out.println("Car has GPS: " + car.hasGPS());

    // Create a manual using the CarManualBuilder
    CarManualBuilder manualBuilder = new CarManualBuilder();
    director.constructSportsCar(manualBuilder);
    Manual manual = manualBuilder.getProduct();
    System.out.println("Manual seat instructions: " + manual.getSeatInstructions());
    System.out.println("Manual engine instructions: " + manual.getEngineInstructions());
    System.out.println("Manual trip computer instructions: " + manual.getTripComputerInstructions());
    System.out.println("Manual GPS instructions: " + manual.getGPSInstructions());
  }
}
