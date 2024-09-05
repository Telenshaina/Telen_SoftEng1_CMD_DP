package commandPattern;

public class DecreaseVolume implements Command {
    private MusicPlayer musicPlayer;

    public DecreaseVolume(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }

    public String execute(){
        return musicPlayer.decreaseVolume();
    }
}