package checkbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex01 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		VBox vbox = new VBox(10);	// 안쪽 사이 거리
		CheckBox chk1 = new CheckBox("chk1");	// 다중선택 선택 박스
		CheckBox chk2 = new CheckBox("chk2");
		
		chk2.setSelected(true);					//선택된채로 실행
		
		chk1.setText("오락");						// 텍스트 바꾸기
		chk2.setText("게임");
		
		vbox.getChildren().addAll(chk1, chk2);
		
		arg0.setScene(new Scene(vbox,300,200));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
