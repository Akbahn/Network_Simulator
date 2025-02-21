module org.example.network_simulator {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.network_simulator to javafx.fxml;
    exports org.example.network_simulator;
}