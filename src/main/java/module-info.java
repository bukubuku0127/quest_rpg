module com.example.quest_rpg {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.quest_rpg to javafx.fxml;
    exports com.example.quest_rpg;
}