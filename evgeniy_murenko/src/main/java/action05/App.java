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

public class App extends Application {

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("My first visual application");
		stage.setScene(createScene2());
		stage.show();
	}

	public Scene createScene1() {
		VBox mainBox = new VBox();
		
		HBox box1 = new HBox();
		
		
		Button btn1 = new Button("Button1");
		box1.getChildren().add(btn1);
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("!!!!");
			}
		});
		
		TextField text1 = new TextField();
		box1.getChildren().add(text1);
				
		Button btn2 = new Button("Button2");
		mainBox.getChildren().add(btn2);
		btn2.setOnAction(e->{System.out.println("asas");});
		
		mainBox.getChildren().add(box1);
		
		Scene scene = new Scene(mainBox, 300, 200);
		return scene;
	}
	
	
	public Scene createScene2(){
		Group group = new Group();
		
		TextField text = new TextField();
		text.setText("text");
		text.setLayoutX(10);
		text.setLayoutY(10);
		
		Button btn1 = new Button("Button");
		btn1.setLayoutX(10);
		btn1.setLayoutY(50);
		
		group.getChildren().add(btn1);
		btn1.setOnAction(e->{text.setText(text.getText() + "@");});
		
		group.getChildren().add(text);
		
		Scene scene = new Scene(group, 300, 200);
		return scene;
	}
}
