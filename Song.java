public class Song {
    private String name;
    private String artist;
    private int releaseYear;
    private String explicit;

    // Constructor
    public Song(String name, String artist, int releaseYear, String explicit) {
        this.name = name;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.explicit = explicit;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getExplicit() {
        return explicit;
    }

   
    public String toString() {
        return "Song Name: " + name + "\n" +
               "Artist: " + artist + "\n" +
               "Release Year: " + releaseYear + "\n" +
               "Explicit: " + explicit;
    }

    public String toStringName() {
        return "Song Name: " + name;
    }

    public String toStringArtist() {
        return "Artist: " + artist;
    }

    public String toStringReleaseYear() {
        return "Release Year: " + releaseYear;
    }

    public String toStringExplicit() {
        return "Explicit: " + explicit;
    }
}