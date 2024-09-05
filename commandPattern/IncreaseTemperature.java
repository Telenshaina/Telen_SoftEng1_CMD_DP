package commandPattern;

public class IncreaseTemperature implements Command{
    private Thermostat thermostat;

    public IncreaseTemperature(Thermostat thermostat){
        this.thermostat =   thermostat;
    }

    public String execute() {
        return thermostat.increaseTemperature();
    }

}