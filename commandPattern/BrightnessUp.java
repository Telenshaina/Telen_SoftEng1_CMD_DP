package commandPattern;

public class BrightnessUp implements Command{
    private Lights lights;

    public BrightnessUp (Lights lights){
        this.lights = lights;
    }

    public String execute() {
        return lights.levelUp();
    }
}