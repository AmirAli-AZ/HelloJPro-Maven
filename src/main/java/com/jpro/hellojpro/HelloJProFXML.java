package com.jpro.hellojpro;

import com.jpro.webapi.JProApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloJProFXML extends JProApplication
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception
    {
        //load user interface as FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/HelloJPro.fxml"));
        Scene scene = new Scene(loader.load());
        HelloJProFXMLController controller = loader.getController();
        controller.init(this);

        stage.setTitle("Hello jpro!");
        stage.setScene(scene);
        stage.show();
    }
}
