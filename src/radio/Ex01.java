package radio;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		
		HBox hbox = new HBox(10);
		RadioButton rd1 = new RadioButton("rd1");	// 라디오 버튼
		RadioButton rd2 = new RadioButton("rd2");
		
		hbox.getChildren().addAll(rd1,rd2);
		hbox.setPrefSize(300,200);
		
		ToggleGroup tg = new ToggleGroup();	// 그룹으로 묶어줘야 한다
		rd1.setToggleGroup(tg);
		rd2.setToggleGroup(tg);
		
		rd1.setText("10대");
		rd2.setText("20대");
		rd1.setSelected(true);
		
		hbox.setPadding(new Insets(20));	// 안쪽으로 여백을 줘라
		
		HBox.setMargin(rd2, new Insets(50,20,20,50));	// 값을 기준으로 바깥쪽으로 여백을 준다
		
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
