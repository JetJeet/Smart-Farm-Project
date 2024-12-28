public abstract class Actuator {
    private String actuatorType;

    public Actuator(String actuatorType) {
        this.actuatorType = actuatorType;
    }

    public abstract void executeAction();
}

