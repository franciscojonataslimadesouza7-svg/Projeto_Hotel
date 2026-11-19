module com.example.projeto_hotel {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.projeto_hotel to javafx.fxml;
    opens com.example.projeto_hotel.Controller to javafx.fxml;
    opens com.example.projeto_hotel.dominio to javafx.base;

    exports com.example.projeto_hotel;
}