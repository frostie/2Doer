package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class SignupController {

    @FXML
    private TextField signUpFirstName;

    @FXML
    private TextField signUpLastName;

    @FXML
    private TextField signUpUsername;

    @FXML
    private TextField signUpLocation;

    @FXML
    private RadioButton signUpCheckboxMale;

    @FXML
    private ToggleGroup Gender;

    @FXML
    private RadioButton signUpCheckboxFemale;

    @FXML
    private TextField signUpPassword;

    @FXML
    private Button signUpButton;

    @FXML
    void initialize() {


    }

}