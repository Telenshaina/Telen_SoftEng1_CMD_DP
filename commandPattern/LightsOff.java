package commandPattern;

public class LightsOff implements Command {
    private Lights lights;

    public LightsOff(Lights lights){
        this.lights = lights;
    }

    public String execute() {
        return lights.turnOff();
    }

}