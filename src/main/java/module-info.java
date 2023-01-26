module com.example.jaretsdeckofcards {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jaretsdeckofcards to javafx.fxml;
    exports com.example.jaretsdeckofcards;
}