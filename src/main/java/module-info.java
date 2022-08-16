module com.jpro.hellojpro {
    requires javafx.controls;
    requires javafx.fxml;
    requires jpro.webapi;

    opens com.jpro.hellojpro to javafx.fxml;
    exports com.jpro.hellojpro;
}