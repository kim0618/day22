package button;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Pane canvas = new Pane();
		Button btn = new Button();
		btn.setGraphic(new ImageView("/img/smilerere.png"));
		btn.setLayoutX(90);
		btn.setLayoutY(80);
		
		Button btn02 = new Button();
		ImageView img = new ImageView("/img/smilerere.png");
		img.setFitHeight(40);
		img.setFitWidth(40);
		btn02.setGraphic(img);
		
		btn02.setStyle("-fx-background-color:transparent;-fx-padding: 10 10 10 10"); 
		// 배경색과 똑같이해라 , 패딩주기
		btn02.setOnMousePressed(e->{	// 마우스를 누르면 실행
			btn02.setStyle("-fx-background-color:transparent;-fx-padding: 15 10 10 10");
		});
		btn02.setOnMouseReleased(e->{   // 마우스를 때면 실행
			btn02.setStyle("-fx-background-color:transparent;-fx-padding: 10 10 10 10");
		});
		
		btn.setOnAction(e->{ // 무언가 변화가 일어난다면 이벤트가 발생된다면
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("경고");
			alert.setHeaderText("버튼 이벤트");
			alert.setContentText("버튼을 클릭했습니다.");
			alert.show();
		});
		
		canvas.getChildren().addAll(btn,btn02);
		canvas.setPrefSize(400, 400);
		
		arg0.setScene(new Scene(canvas));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
