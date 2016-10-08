package action5;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("My First Visual Aplication!");
		stage.setScene(createScene());
		stage.show();
		
	}
	public static void main(String[] args) {
		launch();
	}
	
	public Scene createScene(){
		HBox box = new HBox();
		VBox vbox1 = new VBox();
		VBox vbox2 = new VBox();
		box.getChildren().add(vbox1);
		box.getChildren().add(vbox2);
		
		TextField text1 = new TextField("text 1");
		vbox1.getChildren().add(text1);
		TextField text2 = new TextField("text 2");
		vbox2.getChildren().add(text2);
		
		Button btn1 = new Button("Btn 1!");
		vbox1.getChildren().add(btn1);
		
		Button btn2 = new Button("Btn 2!");
		vbox2.getChildren().add(btn2);
		
		btn1.setOnAction(e -> text1.setText(String.valueOf(Math.random()*100)));
		btn2.setOnAction(e -> text2.setText(text1.getText()));
		
		Scene scene = new Scene(box, 300, 200);
		return scene;
	}
	
	public Scene createScene1(){
		Group group = new Group();
		
		TextField text = new TextField();
		text.setText("My text!");
		group.getChildren().add(text);
		
		Button btn = new Button();
		btn.setText("btn");
		btn.setLayoutX(50);
		btn.setLayoutY(100);
		group.getChildren().add(btn);
		
		btn.setOnAction(e -> text.setText(text.getText() + "Arr!  "));
		
		return new Scene(group, 300, 200);
	}
	
	String randomString(){
		
		return null;
	}
	
	class MyEvent implements EventHandler<Event>{

		@Override
		public void handle(Event arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
