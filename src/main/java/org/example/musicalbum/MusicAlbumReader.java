package org.example.musicalbum;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MusicAlbumReader {
    static List<MusicAlbum> albums = new ArrayList<>();

    public static void readAlbumFromFile() {
        try (BufferedReader bReader = new BufferedReader(new FileReader("src/main/resources/res//Data.txt"))) {
            String line;
            String artist, title;
            int records, year;
            long downloads;
            MusicAlbum album;
            while ((line = bReader.readLine()) != null) {
                artist = line;
                title = bReader.readLine();
                records = Integer.parseInt(bReader.readLine());
                year = Integer.parseInt(bReader.readLine());
                downloads = Long.parseLong(bReader.readLine());
                album = new MusicAlbum(artist, title, records, year, downloads);
                albums.add(album);
                bReader.readLine();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
