import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

/**
 * Created by falc0n on 19.08.2017.
 */

public class PasswordFormController {

    @FXML
    private PasswordField passwordField;

    @FXML
    private ImageView goImage;

    @FXML
    private Label statusField;

    @FXML
    void verify(MouseEvent event) {
        passwordCheck();
    }

    @FXML
    void passwordKeyPressed(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            passwordCheck();
        }
    }

    private void passwordCheck() {
        if (passwordField.getText().length() > 0) {
            String password = passwordField.getText();
            if (Password.isPassword(password)) {
                statusField.setTextFill(Color.GREEN);
                statusField.setText("Done");
                passwordField.setDisable(true);
            } else {
                statusField.setTextFill(Color.RED);
                statusField.setText("Error");
                passwordField.selectAll();
                passwordField.focusedProperty();
            }

        }
    }


}