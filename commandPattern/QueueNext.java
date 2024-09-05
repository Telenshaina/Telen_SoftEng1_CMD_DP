package commandPattern;

public class QueueNext implements Command {
    private MusicPlayer musicPlayer;

    public QueueNext(MusicPlayer musicPlayer){
        this.musicPlayer =  musicPlayer;
    }

    public String execute() {
        return musicPlayer.queueNext();
    }


}