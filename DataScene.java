import org.code.theater.*;
import org.code.media.*;

public class DataScene extends Scene {
    private Song[] songArray;

    public DataScene() {
        songArray = createSong();
    }

    public Song[] createSong() {
        String[] names = FileReader.toStringArray("names.txt");
        String[] artists = FileReader.toStringArray("artists.txt");
        int[] releaseDates = FileReader.toIntArray("releaseDates.txt");
        String[] explicit = FileReader.toStringArray("explicit.txt"); 

       Song[] songArray = new Song[names.length];
       for (int i = 0; i < songArray.length; i++) {
         songArray[i] = new Song(names[i], artists[i], releaseDates[i], explicit[i]);
      }
      return songArray;
    }
  
    public void drawScene() {
        int randomIndex = (int) (Math.random() * songArray.length);  
        Song randomSong = songArray[randomIndex]; 
        boolean isNewest = isNewestSong(randomSong.getReleaseYear());

        clear("white");
        playSound("scratch.wav"); 
        drawImage("vinyl.png", 100, 30, 200);
        setTextStyle(Font.MONO, FontStyle.BOLD);
        drawText("Generating...", 130, 290);
        pause(6);
      
        if (isNewest) {
          clear("blue"); 
        } else {
          clear("white"); 
        }

       if(randomSong.getExplicit().equals("TRUE")){
   
      playSound("Alarm-sound-effect.wav"); 
      drawImage("warning.png", 50, 100, 250);
      setTextStyle(Font.MONO, FontStyle.BOLD);
   
    } else if (randomSong.getExplicit().equals("FALSE")){
   
   playSound("Confetti.wav"); 
      drawImage("kid-friendly.png", 25, 60, 350);
      setTextStyle(Font.SANS, FontStyle.BOLD);
   
    }
      setTextHeight(14);
        drawText(randomSong.toStringName(), 10, 220);
        drawText(randomSong.toStringArtist(), 10, 245);
        drawText(randomSong.toStringReleaseYear(), 10, 270);
        drawText(randomSong.toStringExplicit(), 10, 295);
    }


  public boolean isNewestSong(int year) {
    // max year
    boolean isNewest = true;
    for (Song song : songArray) {
      int maxYear = Math.max(song.getReleaseYear(), year);
      if (maxYear == song.getReleaseYear()) {
        isNewest = false;
      }
    }
    return isNewest;
  }
}
