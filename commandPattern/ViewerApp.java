package commandPattern;

public class ViewerApp {
    public static void main(String[] args){
        Tv tv = new Tv();
        Lights lights = new Lights();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();


        RemoteControl rc = new RemoteControl();
        //tv
        PowerOn powerOn = new PowerOn(tv);
        rc.setCommand(powerOn);
        System.out.println(rc.clickButton());
        PowerOff powerOff = new PowerOff(tv);
        rc.setCommand(powerOff);
        System.out.println(rc.clickButton());

        //lights
        LightsOn lightsOn = new LightsOn(lights);
        rc.setCommand(lightsOn);
        System.out.println(rc.clickButton());
        BrightnessUp brightnessUp = new BrightnessUp(lights);
        rc.setCommand(brightnessUp);
        System.out.println(rc.clickButton());
        BrightnessDown brightnessDown = new BrightnessDown(lights);
        rc.setCommand(brightnessDown);
        System.out.println(rc.clickButton());
        LightsOff lightsOff = new LightsOff(lights);
        rc.setCommand(lightsOff);
        System.out.println(rc.clickButton());


        //thermo
        IncreaseTemperature increaseTemp = new IncreaseTemperature(thermostat);
        rc.setCommand(increaseTemp);
        System.out.println(rc.clickButton());
        DecreaseTemperature decreaseTemp = new DecreaseTemperature(thermostat);
        rc.setCommand(decreaseTemp);
        System.out.println(rc.clickButton());

        //music
        IncreaseVolume increaseVol = new IncreaseVolume(musicPlayer);
        rc.setCommand(increaseVol);
        System.out.println(rc.clickButton());
        DecreaseVolume decreaseVol = new DecreaseVolume(musicPlayer);
        rc.setCommand(decreaseVol);
        System.out.println(rc.clickButton());
        QueueNext queueNext = new QueueNext(musicPlayer);
        rc.setCommand(queueNext);
        System.out.println(rc.clickButton());
        QueuePrev queuePrev = new QueuePrev(musicPlayer);
        rc.setCommand(queuePrev);
        System.out.println(rc.clickButton());

    }
}