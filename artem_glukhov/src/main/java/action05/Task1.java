package action05;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Task1 extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Task1!");
		stage.setScene(createScene());
		stage.show();		
	}
	TextField text1 = new TextField();
	TextField text2 = new TextField();
	Button btn1 = new Button("кнопа 1");
	Button btn2 = new Button("кнопа 2");
	
	public Scene createScene(){
		HBox mainBox = new HBox();
		
		VBox box1 = createVBox(btn1, text1, text2);
		VBox box2 = createVBox(btn2, text2, text1);
		
		mainBox.getChildren().add(box1);
		mainBox.getChildren().add(box2);		
		
		Scene scene = new Scene(mainBox, 300, 200);
		return scene;
	}
	public VBox createVBox(Button btn, TextField textOut, TextField textIn){
		VBox box = new VBox();
		
		box.getChildren().add(btn);
		box.getChildren().add(textOut);
		
		btn.setOnAction(new MyTaskEvent(textOut, textIn));
		return box;
		
	}
	
	class MyTaskEvent implements EventHandler<ActionEvent> {
		TextField textOut;
		TextField textIn;
		public MyTaskEvent(TextField text1, TextField text2){
			textOut = text1;
			textIn = text2;
		}
		@Override
		public void handle(ActionEvent event) {
			textIn.setText(textOut.getText());
			textOut.setText("");
		}
	}
	public static void main(String[] args) {
		//launch(args);
		launch();
	}
}















