package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.*;
import javafx.stage.Stage;

import java.awt.*;
import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        primaryStage.setTitle("This is my Aminal :)");
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);

        scene.setOnMouseMoved(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                scene.setFill(Color.rgb((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
            }
        });

        Circle head = new Circle(250, 250, 150, Color.PINK);

        Ellipse nose = new Ellipse(250, 270, 80, 50);
        nose.setFill(Color.LIGHTPINK);

        Circle nostril1 = new Circle(210, 270, 15, Color.BLACK);
        Circle nostril2 = new Circle(290, 270, 15, Color.BLACK);

        Circle eye1 = new Circle(190, 180, 20, Color.BLACK);
        Circle eye2 = new Circle(310, 180, 20, Color.BLACK);

        Path ear1 = new Path( new MoveTo(140, 150),
                new ArcTo(100, 100, 0, 140, 70, false, true),
                new ArcTo(100, 100, 0, 190, 120, false, true),
                new ClosePath());
        ear1.setFill(Color.LIGHTPINK);
        ear1.setStroke(null);

        Path ear2 = new Path( new MoveTo(360, 150),
                new ArcTo(100, 100, 0, 360, 70, false, false),
                new ArcTo(100, 100, 0, 310, 120, false, false),
                new ClosePath());
        ear2.setFill(Color.LIGHTPINK);
        ear2.setStroke(null);

        root.getChildren().addAll(ear1, ear2, head, nose, nostril1, nostril2, eye1, eye2);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
