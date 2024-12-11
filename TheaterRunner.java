import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {

DataScene song = new DataScene();
    song.drawScene();

    Theater.playScenes(song);
    
    
  }
}