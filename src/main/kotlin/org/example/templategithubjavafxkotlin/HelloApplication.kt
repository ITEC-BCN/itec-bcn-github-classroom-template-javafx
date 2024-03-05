package org.example.templategithubjavafxkotlin

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class HelloApplication : Application() {
    override fun start(stage: Stage) {
        // Definim el fitxer de la vista que volem usar a l'objecte fxmlLoader
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("hello-view.fxml"))

        // Definim la finestra de l'escena que volem crear i les seves mides en píxels
        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)

        // Definim el nom de la finestra que s'obrirà
        stage.title = "Title Scene!"

        // Assignem la vista creada a l'stage (element principal de la app)
        stage.scene = scene

        // Mostrem l'stage
        stage.show()
    }
}

fun main() {
    Application.launch(HelloApplication::class.java)
}