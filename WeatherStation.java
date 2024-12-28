public class WeatherStation {
    private compWeatherSensor weatherSensor;

    public WeatherStation() {
        weatherSensor = new compWeatherSensor();  // Composition
    }

    public void getWeatherData() {
        weatherSensor.readWeatherData();
    }
}
