package Class19;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E2AudioPlayer {
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
        FileInputStream fis=new FileInputStream("C:\\Users\\malik\\IdeaProjects\\JavaReview\\src\\main\\java\\Class19\\meditation-for-relax-new-age-ambient-meditative-241462.mp3");
        Player mpePlayer=new Player(fis);
        mpePlayer.play();
    }
}
