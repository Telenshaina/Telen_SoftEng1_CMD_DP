package commandPattern;

public class LightsOn implements Command {
    private Lights lights;

    public LightsOn(Lights lights){
        this.lights = lights;
    }

    public String execute() {
        return lights.turnOn();
    }

}