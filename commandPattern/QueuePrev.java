package commandPattern;

public class QueuePrev implements Command {
    private MusicPlayer musicPlayer;

    public QueuePrev (MusicPlayer musicPlayer){
        this.musicPlayer =  musicPlayer;
    }

    public String execute() {
        return musicPlayer.queuePrev();
    }

}
