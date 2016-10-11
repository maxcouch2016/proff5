package calc;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MyCalcVer2 extends Application {

	private Button btn0;
	private Button btn1;
	private Button btn2;
	private Button btn3;
	private Button btn4;
	private Button btn5;
	private Button btn6;
	private Button btn7;
	private Button btn8;
	private Button btn9;
	private Button btnPlus;
	private Button btnMinus;
	private Button btnMulty;
	private Button btnDivide;
	private Button btnEquls;
	private Button btnPoint;
	private Button btnTemp;
	private Button btnC;
	private Button btnCE;

	private TextField text;
	private Label textTemp;

	private char action = ' ';
	private String tempString1 = "";
	private boolean flagSecondValue;
	private boolean flagRepitEquls;
	private boolean flagTempButton;

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("MyCalculation");
		stage.setScene(createScene());
		stage.show();
	}

	private Scene createScene() {
		GridPane grid = new GridPane();

		text = new TextField("0");
		text.setTranslateX(10);
		text.setTranslateY(10);
		text.setPrefSize(190, 50);
		grid.getChildren().add(text);

		textTemp = new Label("Temp");
		textTemp.setTranslateX(215);
		textTemp.setTranslateY(10);
		textTemp.setPrefSize(100, 50);
		grid.getChildren().add(textTemp);

		btn7 = new Button("7");
		btn7.setTranslateX(10);
		btn7.setTranslateY(65);
		btn7.setPrefSize(40, 40);
		grid.getChildren().add(btn7);

		btn8 = new Button("8");
		btn8.setTranslateX(55);
		btn8.setTranslateY(65);
		btn8.setPrefSize(40, 40);
		grid.getChildren().add(btn8);

		btn9 = new Button("9");
		btn9.setTranslateX(100);
		btn9.setTranslateY(65);
		btn9.setPrefSize(40, 40);
		grid.getChildren().add(btn9);

		btn4 = new Button("4");
		btn4.setTranslateX(10);
		btn4.setTranslateY(110);
		btn4.setPrefSize(40, 40);
		grid.getChildren().add(btn4);

		btn5 = new Button("5");
		btn5.setTranslateX(55);
		btn5.setTranslateY(110);
		btn5.setPrefSize(40, 40);
		grid.getChildren().add(btn5);

		btn6 = new Button("6");
		btn6.setTranslateX(100);
		btn6.setTranslateY(110);
		btn6.setPrefSize(40, 40);
		grid.getChildren().add(btn6);

		btn1 = new Button("1");
		btn1.setTranslateX(10);
		btn1.setTranslateY(155);
		btn1.setPrefSize(40, 40);
		grid.getChildren().add(btn1);

		btn2 = new Button("2");
		btn2.setTranslateX(55);
		btn2.setTranslateY(155);
		btn2.setPrefSize(40, 40);
		grid.getChildren().add(btn2);

		btn3 = new Button("3");
		btn3.setTranslateX(100);
		btn3.setTranslateY(155);
		btn3.setPrefSize(40, 40);
		grid.getChildren().add(btn3);

		btn0 = new Button("0");
		btn0.setTranslateX(10);
		btn0.setTranslateY(200);
		btn0.setPrefSize(85, 40);
		grid.getChildren().add(btn0);

		btnPoint = new Button(",");
		btnPoint.setTranslateX(100);
		btnPoint.setTranslateY(200);
		btnPoint.setPrefSize(40, 40);
		grid.getChildren().add(btnPoint);

		btnDivide = new Button("/");
		btnDivide.setTranslateX(165);
		btnDivide.setTranslateY(65);
		btnDivide.setPrefSize(40, 40);
		grid.getChildren().add(btnDivide);

		btnMulty = new Button("*");
		btnMulty.setTranslateX(165);
		btnMulty.setTranslateY(110);
		btnMulty.setPrefSize(40, 40);
		grid.getChildren().add(btnMulty);

		btnMinus = new Button("-");
		btnMinus.setTranslateX(165);
		btnMinus.setTranslateY(155);
		btnMinus.setPrefSize(40, 40);
		grid.getChildren().add(btnMinus);

		btnPlus = new Button("+");
		btnPlus.setTranslateX(165);
		btnPlus.setTranslateY(200);
		btnPlus.setPrefSize(40, 40);
		grid.getChildren().add(btnPlus);

		btnEquls = new Button("=");
		btnEquls.setTranslateX(210);
		btnEquls.setTranslateY(200);
		btnEquls.setPrefSize(40, 40);
		grid.getChildren().add(btnEquls);

		btnTemp = new Button("T");
		btnTemp.setTranslateX(210);
		btnTemp.setTranslateY(155);
		btnTemp.setPrefSize(40, 40);
		grid.getChildren().add(btnTemp);

		btnC = new Button("C");
		btnC.setTranslateX(210);
		btnC.setTranslateY(110);
		btnC.setPrefSize(40, 40);
		grid.getChildren().add(btnC);

		btnCE = new Button("CE");
		btnCE.setTranslateX(210);
		btnCE.setTranslateY(65);
		btnCE.setPrefSize(40, 40);
		grid.getChildren().add(btnCE);

		btn0.setOnAction(new MyEvent());
		btn1.setOnAction(new MyEvent());
		btn2.setOnAction(new MyEvent());
		btn3.setOnAction(new MyEvent());
		btn4.setOnAction(new MyEvent());
		btn5.setOnAction(new MyEvent());
		btn6.setOnAction(new MyEvent());
		btn7.setOnAction(new MyEvent());
		btn8.setOnAction(new MyEvent());
		btn9.setOnAction(new MyEvent());
		btnPlus.setOnAction(new MyEvent());
		btnMinus.setOnAction(new MyEvent());
		btnMulty.setOnAction(new MyEvent());
		btnDivide.setOnAction(new MyEvent());
		btnPoint.setOnAction(new MyEvent());
		btnEquls.setOnAction(new MyEvent());
		btnC.setOnAction(new MyEvent());
		btnCE.setOnAction(new MyEvent());
		btnTemp.setOnAction(new MyEvent());

		ReadTextField readTextField = new ReadTextField();
		readTextField.setDaemon(true);
		readTextField.start();

		Scene scene = new Scene(grid, 260, 260);
		return scene;
	}

	class MyEvent implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			if (event.getSource() == btn1) {
				checkFlag('1');
			} else if (event.getSource() == btn2) {
				checkFlag('2');
			} else if (event.getSource() == btn3) {
				checkFlag('3');
			} else if (event.getSource() == btn4) {
				checkFlag('4');
			} else if (event.getSource() == btn5) {
				checkFlag('5');
			} else if (event.getSource() == btn6) {
				checkFlag('6');
			} else if (event.getSource() == btn7) {
				checkFlag('7');
			} else if (event.getSource() == btn8) {
				checkFlag('8');
			} else if (event.getSource() == btn9) {
				checkFlag('9');
			} else if (event.getSource() == btn0) {
				checkFlag('0');
			} else if (event.getSource() == btnEquls) {
				flagTempButton = false;
				actionEquls();
			} else if (event.getSource() == btnPlus) {
				action = '+';
				tempString1 = text.getText();
				flagSecondValue = true;
				flagTempButton = true;
			} else if (event.getSource() == btnMinus) {
				action = '-';
				tempString1 = text.getText();
				flagSecondValue = true;
			} else if (event.getSource() == btnMulty) {
				action = '*';
				tempString1 = text.getText();
				flagSecondValue = true;
			} else if (event.getSource() == btnDivide) {
				action = '/';
				tempString1 = text.getText();
				flagSecondValue = true;
			} else if (event.getSource() == btnPoint) {
				checkFlag('.');
			} else if (event.getSource() == btnC) {
				action = ' ';
				text.setText("0");
				flagTempButton = false;
				System.out.println("C");
			} else if (event.getSource() == btnCE) {
				action = ' ';
				text.setText("0");
				textTemp.setText("");
				flagTempButton = false;
				System.out.println("CE");
			} else if (event.getSource() == btnTemp) {
				actionTempBatton();
			}
		}

		private void actionTempBatton() {
			if (!flagTempButton) {
				textTemp.setText(text.getText()); // записываем в лейбл
			} else {
				text.setText(textTemp.getText());
				flagRepitEquls = false;
			}

		}

		private void actionEquls() {
			if ((action != ' ') && (tempString1 != "") && (!flagSecondValue)) {
				double result = 0;
				if (action == '+') {
					if (flagRepitEquls) {
						result = Double.parseDouble(tempString1) + Double.parseDouble(text.getText());
					} else {
						result = Double.parseDouble(tempString1) + Double.parseDouble(text.getText());
						tempString1 = text.getText();
						flagRepitEquls = true;
					}
				} else if (action == '-') {
					if (flagRepitEquls) {
						result = Double.parseDouble(text.getText()) - Double.parseDouble(tempString1);
					} else {
						result = Double.parseDouble(tempString1) - Double.parseDouble(text.getText());
						tempString1 = text.getText();
						flagRepitEquls = true;
					}
				} else if (action == '*') {
					if (flagRepitEquls) {
						result = Double.parseDouble(tempString1) * Double.parseDouble(text.getText());
					} else {
						result = Double.parseDouble(tempString1) * Double.parseDouble(text.getText());
						tempString1 = text.getText();
						flagRepitEquls = true;
					}
				} else if (action == '/') {
					if (flagRepitEquls) {
						result = Double.parseDouble(text.getText()) / Double.parseDouble(tempString1);
					} else {
						result = Double.parseDouble(tempString1) / Double.parseDouble(text.getText());
						tempString1 = text.getText();
						flagRepitEquls = true;
					}
				}
				printResult(result);
			}
		}

		private void printResult(double result) {
			if (result - (int) result == 0) {
				text.setText(Integer.toString((int) result));
			} else {
				text.setText(Double.toString(result));
			}
		}

		private void checkFlag(char c) {
			if (flagSecondValue) {
				flagSecondValue = false;
				text.setText(" ");
				check(c);
			} else {
				check(c);
			}
		}

		private void check(char c) {
			if (c == '.') {
				if (text.getText().indexOf(c) < 0) {
					if (text.getText().length() >= 1) {
						text.setText(text.getText() + c);
					}
				}
			} else if (text.getText().charAt(0) == '0') {
				if (text.getText().length() >= 2) {
					if (text.getText().charAt(1) == '.') {
						text.setText(text.getText() + c);
					}
				} else {
					text.setText("" + c);
				}
			} else if (text.getText() == " ") {
				text.setText("" + c);
			} else {
				text.setText(text.getText() + c);
			}
			flagRepitEquls = false;
		}
	}

	class ReadTextField extends Thread {

		public void run() {
			while (true) {
				if (text.getText().length() == 0) {
					System.out.println(text.getText());
				} else {
					if (text.getText().charAt(text.getText().length() - 1) == '+') {
						new MyEvent().check('+');
					} else {
						System.out.println(text.getText());
					}
				}

			}
		}
	}

}