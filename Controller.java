public class Controller {
    private Sprinkler sprinkler;
    private Motor motor;

    public Controller() {
        this.sprinkler = new Sprinkler();
        this.motor = new Motor();
    }

    public void controlWatering(MoistureSensor moistureSensor) {
        if (moistureSensor.getValue() < 30.0) {
            sprinkler.executeAction();  // Start sprinkling if moisture is low
            motor.executeAction();      // Activate pump or motor
        }
    }
}
