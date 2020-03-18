package ba.unsa.etf.rs.tutorijal2;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {

    public Label helloWorld;

    public void OnClick(ActionEvent actionEvent) {

        helloWorld.setText("Hello World!");
    }
}
