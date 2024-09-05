package commandPattern;

public class BrightnessDown implements Command {
    private Lights lights;

    public BrightnessDown (Lights lights){
        this.lights = lights;
    }

    public String execute() {
        return lights.levelDown();
    }
}
