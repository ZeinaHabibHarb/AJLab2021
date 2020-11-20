package ajlabsession1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class AJLabhw1 extends Application {
Stage window;

    @Override
    public void start(Stage primaryStage) {
window = primaryStage;
window.setTitle("Login From Window");
Image View image  = new Image View(new Image("https://picsum.photos/200"));
 

GridPane grid = new GridPane();
grid.setAlignment(Pos.CENTER);
grid.setHgap(10);
grid.setVgap(10);
grid.setPadding(new Insets(25));

Text scenetitle = new Text("Welcome");
welcomeTxt.setFont(Font.font("Tahoma", FontWeight.LIGHT, 25));
grid.add(welcomeTxt, 0, 0);

Label userName = new Label("User Name: ");
grid.add(userName, 0, 1);

TextField txtUser = new TextField();
txtUser.setPromptText("User Name");
grid.add(txtUser, 1, 1);

Label pw = new Label("Password");
grid.add(pw, 0, 2);

PasswordField pwBox = new PasswordField();
pwBox.setPromptText("Password");
grid.add(pwBox, 1, 2);

Button LoginBtn = new Button ("Sign in");
grid.add(LoginBtn, 1, 3);
HBox LoginBtn = new HBox (10);
hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
hbBtn.getChildren().add(btn);


Scene scene = new Scene(grid, 500, 500);
primaryStage.setTitle("JavaFX Welcome");
window.setScene(scene);
window.show();
}

 public static void main (String[] args){
Launch(args);
}
}
