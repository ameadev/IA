package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MainApp extends Application {
	Group root;	
	@Override
	public void start(Stage primaryStage) {
        
        root = new Group();
        Scene scene = new Scene(root, Settings.W_WIDTH, Settings.W_HEIGHT);
        scene.setFill(Color.WHITE);
        primaryStage.setTitle(Settings.APP_NAME);
        primaryStage.setScene(scene);
        primaryStage.show();
        showCard();

}
	public void showCard()
	{
		int j = 0;
		for(int i = 0; i < 100; i++)
		{
			if (j == 10) { j = 0; }
			Rectangle room = new Rectangle(Settings.W_WIDTH/10, Settings.W_HEIGHT/10);
			if(i < 10) { room.setX(0.0);}
			else if (i < 20){room.setX(Settings.W_WIDTH/10);}
			else if (i < 30){room.setX(2 * Settings.W_WIDTH/10);}
			else if (i < 40){room.setX(3 * Settings.W_WIDTH/10);}
			else if (i < 50){room.setX(4 * Settings.W_WIDTH/10);}
			else if (i < 60){room.setX(5 * Settings.W_WIDTH/10);}
			else if (i < 70){room.setX(6 * Settings.W_WIDTH/10);}
			else if (i < 80){room.setX(7 * Settings.W_WIDTH/10);}
			else if (i < 90){room.setX(8 * Settings.W_WIDTH/10);}
			else {room.setX(9 * Settings.W_WIDTH/10);}
			room.setY(j * (Settings.W_HEIGHT/10));
			room.setFill(Color.TRANSPARENT);

		    room.setStroke(Color.BLACK);
		    this.root.getChildren().add(room);
		    Circle dust = new Circle();
		    dust.setCenterX(room.getX()+20);
		    dust.setCenterY(room.getY()+20);
		    dust.setRadius(10);
		    dust.setFill(Color.BLACK);
		    Circle diamond = new Circle();
		    diamond.setCenterX(room.getX()+40);
		    diamond.setCenterY(room.getY()+40);
		    diamond.setRadius(10);
		    diamond.setFill(new DiamondColor().getColor());
		    this.root.getChildren().add(dust);
		    this.root.getChildren().add(diamond);
			j++;				
		}
	}
	public static void main(String[] args) {
		launch(args);

	}

}
