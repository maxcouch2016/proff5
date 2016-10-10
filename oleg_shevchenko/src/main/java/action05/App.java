package action05;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("My first visual application!");
		//stage.setScene(createScene());
		stage.setScene(createScene1());
		stage.show();
		
	}
	
	//Метод для создания сцены
	public Scene createScene() {
		HBox box = new HBox();
		Button btn01 = new Button("Кнопка");
		Button btn02 = new Button("Кнопка");
		//В элементе box добавляем в его "детей" кнопку(т.е. в getChildren добавляем add)
		box.getChildren().add(btn01);
		box.getChildren().add(btn02);
		
		//Обработчик нажатия на кнопку
		btn01.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("opacha 1");				
			}			
		});

		btn02.setOnAction(e->{System.out.println("opacha 2");});
		Scene scene  = new Scene(box, 300, 200);
		return scene;
	}
	
	//Еще одна версия сцены
	public Scene createScene1() {
		Group group = new Group();
		
		TextField text = new TextField();
		text.setText("my text");
		text.setLayoutX(10);
		text.setLayoutY(10);
		
		Button btn = new Button();
		btn.setText("button");
		btn.setLayoutX(10);
		btn.setLayoutY(50);
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				text.setText(text.getText() + " text");
			}			
		});
		
		group.getChildren().add(text);
		group.getChildren().add(btn);
		
		return new Scene(group, 300, 200);
	}

	public static void main(String[] args) {
		//launch(args);
		launch();
	}
}
