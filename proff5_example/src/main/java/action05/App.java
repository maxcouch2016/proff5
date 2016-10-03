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

public class App extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("My first visual application!");
		stage.setScene(createScene1());
		stage.show();		
	}
	
	public Scene createScene(){
		VBox box = new VBox();
		Button btn1 = new Button("Кнопа 1");
		Button btn2 = new Button("Кнопа 2");
		
		box.getChildren().add(btn1);
		box.getChildren().add(btn2);
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("opacha 1");
				
			}
		});

		btn2.setOnAction(e->{System.out.println("opacha 2");});
		
		Scene scene = new Scene(box, 300, 200);
		return scene;
	}
	public Scene createScene1(){
		Group group = new Group();
		
		TextField text = new TextField();
		text.setText("my text");
		text.setLayoutX(10);
		text.setLayoutY(10);
		
		Button btn = new Button();
		btn.setText("b");
		btn.setLayoutX(10);
		btn.setLayoutY(50);
		btn.setOnAction(new MyEvent());
		
		group.getChildren().add(text);
		group.getChildren().add(btn);
		
		return new Scene(group, 300, 200);
		
	}
	public static void main(String[] args) {
		//launch(args);
		launch();
	}
	class MyEvent implements EventHandler<ActionEvent> {
		
		@Override
		public void handle(ActionEvent event) {
			System.out.println("opacha 1");
			
		}
	}
}















