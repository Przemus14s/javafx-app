package example.com;

public class MusicAlbum {
    private String artist;
    private String album;
    private int records;
    private int year;
    private long numberOfDownloads;

    public MusicAlbum(String artist, String album, int records, int year, long numberOfDownloads) {
        this.artist = artist;
        this.album = album;
        this.records = records;
        this.year = year;
        this.numberOfDownloads = numberOfDownloads;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public int getRecords() {
        return records;
    }

    public int getYear() {
        return year;
    }

    public long getNumberOfDownloads() {
        return numberOfDownloads;
    }

    public long incrementDownload() {
        return ++numberOfDownloads;
    }
}
