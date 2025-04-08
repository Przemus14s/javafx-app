package org.example.musicalbum;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button buttonLeft;

    @FXML
    private Button buttonRight;

    @FXML
    private ImageView image;

    @FXML
    private Button buttonDownload;

    @FXML
    private Label labelAuthor;

    @FXML
    private Label labelTitle;

    @FXML
    private Label labelNumberOfSongs;

    @FXML
    private Label labelYear;

    @FXML
    private Label labelNumber;

    Image prev = new Image(String.valueOf(getClass().getResource("/res/obraz3.png")));
    Image next = new Image(String.valueOf(getClass().getResource("/res/obraz2.png")));
    List<MusicAlbum> albums;
    static int currentIndex = 0;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ImageView imgLeft = new ImageView(prev);
        imgLeft.setFitHeight(70);
        buttonLeft.setGraphic(imgLeft);
        ImageView imgRight = new ImageView(next);
        imgRight.setFitHeight(70);
        buttonRight.setGraphic(imgRight);
        MusicAlbumReader.readAlbumFromFile();
        albums = MusicAlbumReader.albums;
//        for(MusicAlbum album : albums) System.out.println(album);
        getAlbum(0);

        buttonLeft.setOnAction(actionEvent -> {
            if (currentIndex == 0) currentIndex = albums.size()-1;
            else currentIndex --;
            getAlbum(currentIndex);

        });

        buttonRight.setOnAction(actionEvent -> {
            currentIndex = (currentIndex + 1) % albums.size();
        });

    }

    private void getAlbum(int index){
        labelAuthor.setText(albums.get(index).getArtist());
        labelTitle.setText(albums.get(index).getAlbum());
        labelNumberOfSongs.setText(albums.get(index).getRecords() + " utworów");
        labelYear.setText(String.valueOf(albums.get(index).getYear()));
        labelNumber.setText(String.valueOf(albums.get(index).getNumberOfDownloads()));

    }
}
