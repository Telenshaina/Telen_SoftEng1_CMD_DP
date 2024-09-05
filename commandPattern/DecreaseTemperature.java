package commandPattern;

public class DecreaseTemperature implements Command{
    private Thermostat thermostat;

    public DecreaseTemperature (Thermostat thermostat){
        this.thermostat = thermostat;
    }

    public String execute(){
        return thermostat.decreaseTemperature();
    }

}