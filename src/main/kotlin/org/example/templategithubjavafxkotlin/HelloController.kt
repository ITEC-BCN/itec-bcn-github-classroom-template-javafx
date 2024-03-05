package org.example.templategithubjavafxkotlin

import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.Label

class HelloController {
    // Capturem de la vista l'element welcomeText de tipus Label per a poder-lo usar
    @FXML
    private lateinit var welcomeText: Label
    // Capturem de la vista l'element buttonHello de tipus Button per a poder-lo usar
    @FXML
    private lateinit var buttonHello: Button

    // Definim mètodes a ser executats en resposta a events capturats a la vista
    @FXML
    private fun onHelloButtonClick() {
        welcomeText.text = "Welcome to JavaFX Application!"
    }
    @FXML
    private fun onbuttonHelloClick() {
        if (buttonHello.text.equals("Click Here!")) {
            buttonHello.text = "You clicked it!"
        }else
            buttonHello.text = "Click Here!"
    }

}