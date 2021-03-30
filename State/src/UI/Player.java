package UI;

import java.util.ArrayList;
import java.util.List;

import states.*;

public class Player {
    private State state;
    private boolean playing;
    private List<String> tracks = new ArrayList<>();
    private int currentTrack;

    public Player() {
        state = new ReadyState(this);
        setPlaying(true);
        for (int i = 1; i <= 10; i++) {
            tracks.add("Track " + i);
        }
        currentTrack = 0;
    }

    public String nextTrack() {
        currentTrack++;
        if(currentTrack > tracks.size() - 1){
            currentTrack = 0;
        }
        return "Playing " + tracks.get(currentTrack);
    }

    public String previousTrack() {
        currentTrack--;
        if (currentTrack < 0) {
            currentTrack = tracks.size() - 1;
        }
        return "Playing " + tracks.get(currentTrack);
    }

    public String startPlayback() {
        return "Playing " + tracks.get(currentTrack);
    }

    public void setCurrentTrackAfterStop() {
        this.currentTrack = 0;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean isPlaying) {
        this.playing = isPlaying;
    }

}
