package guiAssignment_200485862;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{ // opens the main window
        Parent root = FXMLLoader.load(getClass().getResource("seatArrangement.fxml"));
        primaryStage.setTitle("Seating Chart");
        primaryStage.setScene(new Scene(root, 490, 560));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
