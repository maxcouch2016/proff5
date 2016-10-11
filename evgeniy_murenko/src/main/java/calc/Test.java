package calc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Test extends Application {
	private TextField text;

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Application");
		stage.setScene(createScene());
		stage.show();
	}

	private Scene createScene() {
		GridPane grid = new GridPane();

		text = new TextField("");
		text.setTranslateX(10);
		text.setTranslateY(10);
		text.setPrefSize(240, 240);
		grid.getChildren().add(text);
		new ReadTextField().start();
		Scene scene = new Scene(grid, 260, 260);
		return scene;
	}

	class ReadTextField extends Thread {
		public void run() {
			while (true) {
				if (text.getText().length() == 0) {
					System.out.println(text.getText());
				} else {
					if (text.getText().charAt(text.getText().length() - 1) == '+') {
						text.setText("");
					} else {
						System.out.println(text.getText());
					}
				}

			}
		}
	}
}
