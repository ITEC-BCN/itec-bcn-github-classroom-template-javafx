module org.example.templategithubjavafxkotlin {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens org.example.templategithubjavafxkotlin to javafx.fxml;
    exports org.example.templategithubjavafxkotlin;
}