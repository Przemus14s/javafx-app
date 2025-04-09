package example.com;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MusicApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MusicApp.class.getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 795, 300);
        stage.setTitle("Moje dźwięki, Wykonał: Przemek");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}