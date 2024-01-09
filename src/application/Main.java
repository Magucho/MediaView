package application;
	
import java.io.File;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;


public class Main extends Application {
	
	
	@Override
	public void start(Stage stage) throws Exception{
		
	try {
		Parent root= FXMLLoader.load(getClass().getResource("Main.fxml"));
	 
		//File file= new File("src/video/italiani.mp4");
		//MediaPlayer org= new MediaPlayer(new Media(file.toURI().toString()));
		
		
		//MediaView view= new MediaView(org);
		//org.setAutoPlay(true);
		
		//Group escenario= new Group();
		//escenario.getChildren().add(view);
		Scene scene= new Scene(root);// escenario ,480 , 640

		Image ima= new Image("imagenP.png");
		stage.getIcons().add(ima);
		stage.setScene(scene);
		stage.show();
	}catch(Exception e) {
		e.printStackTrace();
	}	   
		/*try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}*/
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
