package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class Controller implements Initializable {

	@FXML
	private MediaView mediaView;
	@FXML
	private Button playButton, pauseButton, resetButton;
	
	private File file;
	private Media media;
	private MediaPlayer mediaplay;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		file= new File("src/video/italiani.mp4");
		media= new Media(file.toURI().toString());
		mediaplay= new MediaPlayer(media);
		mediaView.setMediaPlayer(mediaplay);
	}

	public void playMedia() {
		mediaplay.play();
	}
	public void pauseMedia() {
		mediaplay.pause();
	}
	public void resetMedia() {
		mediaplay.seek(Duration.seconds(0.0));
	}
}
