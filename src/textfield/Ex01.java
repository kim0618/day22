package textfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		
		// 입력받는 창이다
		HBox hbox = new HBox();
		TextField tf = new TextField();				// 값이 그대로 보임 (id라고 생각)
		tf.setText("test");
		
		PasswordField pf = new PasswordField();		// 값이 가려져서 보임 (비번이라고생각)
		pf.setText("abcd1234");
		
		ComboBox<String> cb = new ComboBox<String>();
		cb.getItems().addAll("공부","놀기","멍타기");  // 콤보박스 값 리스트 형식으로 표시
		cb.setValue("공부");						// 콤보박스의 시작 값 선택
		
		DatePicker dp = new DatePicker();		// 날짜형식, 달력
		
		TextArea ta = new TextArea();			// 많은 줄을 나타냄
		ta.setPrefSize(100, 30);
		
		hbox.getChildren().addAll(tf,pf,cb,ta,dp);
		hbox.setPrefSize(1000, 200);
		
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
