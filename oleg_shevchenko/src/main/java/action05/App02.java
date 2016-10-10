package action05;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App02 extends Application {

	public void start(Stage stage) throws Exception {
		stage.setTitle("Text fields");
		stage.setScene(buildScene());
		stage.show();
	}

	private Scene buildScene() {
		
		VBox vBox = new VBox();
		vBox.setPadding(new Insets(10,10,10,10));
		HBox hBox01 = new HBox();
		HBox hBox02 = new HBox();
		vBox.getChildren().add(hBox01);
		vBox.getChildren().add(hBox02);
		
		Button btn01 = new Button("Button-1");
		Button btn02 = new Button("Button-2");
		
		TextField tField01 = new TextField("text-1");
		TextField tField02 = new TextField("text-2");
		
		btn01.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				tField01.setText(tField02.getText() + tField01.getText());
				
			}
		});
		
		btn02.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				tField02.setText(tField02.getText() + tField01.getText());
			}
		});
		
		hBox01.getChildren().add(btn01);
		hBox01.getChildren().add(tField01);
		hBox02.getChildren().add(btn02);
		hBox02.getChildren().add(tField02);
		
		return new Scene(vBox, 300, 100);
	}
	

	
	public static void main(String[] args) {
		launch();
	}
}
