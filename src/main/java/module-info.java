module com.example.projeto_hotel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projeto_hotel to javafx.fxml;
    exports com.example.projeto_hotel;
}