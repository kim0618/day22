package label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex03 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10));
		
		Label lbl = new Label("A label that needs to be wrapped");
		/*
		FlowPane fp = new FlowPane();
		fp.getChildren().add(lbl);
		fp.setPrefSize(100,100);
		*/
		
		hbox.getChildren().add(lbl);
		hbox.setPrefSize(100, 100);
		
		lbl.setWrapText(true);	// 짤려서 나오지 않게 하는것
		lbl.setFont(new Font(20)); // 폰트 크기
		lbl.setRotate(48);		// 회원하기
		lbl.setTranslateY(50);  // 값의 위치 조절 X,Y축
		
		lbl.setOnMouseClicked(e->{	// 이벤트 처리 클릭하면 밑에있는 설정으로 바뀜
			lbl.setRotate(0);
			lbl.setTranslateY(0);
		});
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
