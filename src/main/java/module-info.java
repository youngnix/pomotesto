module nix.young.pomodoro {
    requires javafx.controls;
    requires javafx.fxml;


    opens nix.young.pomodoro to javafx.fxml;
    exports nix.young.pomodoro;
}