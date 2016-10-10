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
		stage.setScene(createScene2());
		stage.show();
	}
	


	
	public Scene createScene(){
//		VBox box = new VBox(); //вертікальная рзметка
		HBox box = new HBox();
		
		Button btn1 = new Button("Button");
		Button btn2 = new Button("Button2");
		
		box.getChildren().add(btn1);
		box.getChildren().add(btn2);
//		
//		btn.setOnAction(new EventHandler<ActionEvent>() {
//			
//			@Override
//			public void handle(ActionEvent event) {
//				System.out.println("OPACHA");
//				
//			}
//		});
//		
		btn1.setOnAction(e->System.out.println("opacha"));
		btn2.setOnAction(e->System.out.println("opacha"));
		
		
		Scene scene = new Scene(box,300,300);
			return scene;
	}
	
		public Scene createScene1(){
			Group group = new Group();
			TextField text = new TextField();
			text.setText("my text");
			
			text.setLayoutX(10); // отступ от края окна
			text.setLayoutY(10);
			
			Button btn = new Button();
			btn.setText("bla");
			btn.setLayoutX(10);
			btn.setLayoutY(50);
			
			group.getChildren().add(text);
			group.getChildren().add(btn);
			
			return new Scene(group, 300, 200);
				
		}
				
		
		public Scene createScene2(){
			
			TextField text1 = new TextField();
			TextField text2 = new TextField();
			
			VBox boxV = new VBox(); //вертікальная рзметка
			HBox boxH1 = new HBox();
			HBox boxH2 = new HBox();
			
			boxV.getChildren().add(boxH1);
			boxV.getChildren().add(boxH2);
			Button btn1 = new Button("Button 1");

			text1.setText("");
			text2.setText("");
			
			
			boxH1.getChildren().add(btn1);
			boxH1.getChildren().add(text1);
			
			Button btn2 = new Button("Button 2");
			
			btn2.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					String str="";
					str = text1.getText();
					text1.setText(text2.getText());
					text2.setText(str);
					
				}
				
			});
			
			boxH2.getChildren().add(btn2);
			boxH2.getChildren().add(text2);
			
			
			return new Scene(boxV, 300, 200);
			
			
		}
		
		
	
	
	public static void main (String[] args){
		launch(); //запускає программу
	
	}	

}
