module org.example.musicalbum {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.musicalbum to javafx.fxml;
    exports org.example.musicalbum;
}