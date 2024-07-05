module com.example.bunga_bank {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bunga_bank to javafx.fxml;
    exports com.example.bunga_bank;
}