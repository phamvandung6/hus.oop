package hus.oop.lab10.builder_pattern.bai_1.cars;

public class Manual {
    private String seatInstructions;
    private String engineInstructions;
    private String tripComputerInstructions;
    private String gpsInstructions;

    public void setSeatInstructions(String seatInstructions) {
        this.seatInstructions = seatInstructions;
    }

    public void setEngineInstructions(String engineInstructions) {
        this.engineInstructions = engineInstructions;
    }

    public void setTripComputerInstructions(String tripComputerInstructions) {
        this.tripComputerInstructions = tripComputerInstructions;
    }

    public void setGPSInstructions(String gpsInstructions) {
        this.gpsInstructions = gpsInstructions;
    }

    public String getSeatInstructions() {
        return seatInstructions;
    }

    public String getEngineInstructions() {
        return engineInstructions;
    }

    public String getTripComputerInstructions() {
        return tripComputerInstructions;
    }

    public String getGPSInstructions() {
        return gpsInstructions;
    }
}
