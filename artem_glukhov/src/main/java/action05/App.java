package action05;

import org.apache.log4j.chainsaw.Main;

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
		stage.setTitle("My first visual application");
		stage.setScene(createScene1());
		stage.show();
		
	}
public static void main(String[] args) {
	launch(args);
}

public Scene createScene(){
	VBox box = new VBox();
	Button btn = new Button("button1");
	Button btn2 = new Button("button2");
	box.getChildren().add(btn);
	box.getChildren().add(btn2);
	
	
	
//	btn.setOnAction(new EventHandler() {
//		
//		@Override
//		public void handle(ActionEvent arg0) {
//		System.out.println("jgjglkf");
//			
//		}
//	};
	
	btn.setOnAction(e->{System.out.println("Опача1");});
	btn.setOnAction(e->{System.out.println("Опача2");});
	Scene scene =new Scene (box,300,200);
	return scene;
}

public Scene createScene1(){
//Group group = new Group();
VBox box1 = new VBox();

////TextField text = new TextField();
////text.setText("Text");
////text.setLayoutX(50);
////text.setLayoutY(10);
////TextField text1 = new TextField();
////text.setText("Text2");
////text.setLayoutX(50);
////text.setLayoutY(50);
//
//box1.getChildren().add(text);
//box1.getChildren().add(text1);
HBox box = new HBox();

Button btn = new Button();
btn.setText("Butt");
btn.setLayoutX(10);
btn.setLayoutY(10);

Button btn2 = new Button();
btn.setText("Butt2");
btn.setLayoutX(210);
btn.setLayoutY(110);

box.getChildren().add(btn);
box.getChildren().add(btn2);

return new Scene (box, 300,200);

}
}

