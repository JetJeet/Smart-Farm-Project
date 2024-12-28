public class Field {
    private String fieldName;
    private Sensor[] sensors;
    private Actuator[] actuators;
    private WeatherStation weatherStation;
    private Controller controller;

    public Field(String fieldName) {
        this.fieldName = fieldName;
    }

    public void addSensor(Sensor sensor) {
        // Logic to add sensor
    }

    public void addActuator(Actuator actuator) {
        // Logic to add actuator
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void setWeatherStation(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    // other methods...
}
