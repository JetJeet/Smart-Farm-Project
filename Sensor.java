public abstract class Sensor {
    private String sensorType;
    private double value;

    public Sensor(String sensorType) {
        this.sensorType = sensorType;
    }

    public abstract void readSensorData();

    public double getValue() {
        return value;
    }
}
