public class NPKSensor extends Sensor {
    private double nitrogenLevel;
    private double phosphorusLevel;
    private double potassiumLevel;

    public NPKSensor() {
        super("NPK Sensor");
    }

    @Override
    public void readSensorData() {
        // Logic to read NPK data
    }

    // other methods specific to NPK...
}
