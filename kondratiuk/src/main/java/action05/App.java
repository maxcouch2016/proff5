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

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("My first visua application!");
		stage.setScene(createScene2());
		stage.show();
	}

	private Scene createScene2() {
		HBox horisontal = new HBox();
		VBox vert1 = new VBox();
		Button btn2 = new Button("button2");
		Button btn1 = new Button("button1");
		TextField text1 = new TextField("text1");
		TextField text2 = new TextField("text2");
		btn1.setOnAction((e) -> {
			String str = "";
			str = text1.getText();
			text1.setText(text2.getText());
			text2.setText(str);
		});
//		btn1.setOnAction(new EventHandler<ActionEvent>() {
//
//			@Override
//			public void handle(ActionEvent arg0) {
//				String str = "";
//				str = text1.getText();
//				text1.setText(text2.getText());
//				text2.setText(str);
//
//			}
//		});
		btn2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				String str = "";
				str = text1.getText();
				text1.setText(text2.getText());
				text2.setText(str);

			}
		});

		vert1.getChildren().add(btn1);
		vert1.getChildren().add(btn2);
		horisontal.getChildren().add(vert1);
		VBox vert2 = new VBox();
		vert2.getChildren().add(text1);
		vert2.getChildren().add(text2);
		horisontal.getChildren().add(vert2);
		return new Scene(horisontal, 300, 300);
	}

	public static void main(String[] args) {
		launch();
	}

	public Scene createScene() {
		// HBox box = new HBox();
		VBox box = new VBox();
		Button btn1 = new Button("Button1");

		Button btn2 = new Button("Button2");

		btn2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Hi!!!!!!");

			}
		});

		btn1.setOnAction((e) -> System.out.println("Hi"));

		box.getChildren().add(btn1);
		box.getChildren().add(btn2);

		Scene scene = new Scene(box, 300, 200);

		return scene;
	}

	private Scene createScene1() {
		Group group = new Group();
		TextField textField = new TextField();
		textField.setText("My Text");
		textField.setLayoutX(10);
		textField.setLayoutY(10);
		Button btn = new Button();
		btn.setText("text");
		btn.setOnAction((e) -> System.out.println("Hello"));
		btn.setLayoutX(10);
		btn.setLayoutY(50);

		group.getChildren().add(textField);
		group.getChildren().add(btn);
		return new Scene(group, 300, 200);
	}

	class MyEventButton1 implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {

		}

	}

}
