package day22;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		BorderPane border = new BorderPane();
		
		HBox hb = new HBox(20);
		Label lb = new Label("홈");
		Label lb1 = new Label("사회");
		Label lb2 = new Label("경제");
		Label lb3 = new Label("국제");
		Label lb4 = new Label("문화");
		hb.setPadding(new Insets(10,10,10,280));
		hb.getChildren().addAll(lb,lb1,lb2,lb3,lb4);
		
		VBox vb = new VBox(10);
		Label vlb = new Label("카테고리");
		Label vlb1 = new Label("노트북/pc");
		Label vlb2 = new Label("자동창용품");
		Label vlb3 = new Label("휴대폰");
		Label vlb4 = new Label("캠핑/낚시");
		vb.setPadding(new Insets(10,10,10,10));
		vb.getChildren().addAll(vlb,vlb1,vlb2,vlb3,vlb4);
		
		GridPane right = new GridPane();
		right.setPadding(new Insets(20));
		TextField text = new TextField();
		text.setPrefSize(50, 20);
		TextField text1 = new TextField();
		text.setPrefSize(50, 20);
		Button bt =new Button("로그인");
		bt.setPrefSize(60, 50);
		FlowPane flow = new FlowPane(bt);
		flow.setMaxSize(0, 0);
		flow.setAlignment(Pos.CENTER);
		right.getChildren().addAll(text,text1);
		right.setConstraints(text,0,0);
		right.setConstraints(text1,0,1);
		right.add(bt, 1, 0,1,2);
// 여기부터		
		VBox vboxCenter = new VBox(10);
		vboxCenter.setMaxSize(500, 220);
		
		ArrayList<FlowPane> flowList = new ArrayList<>();
		
		flowList.add(new FlowPane(new Label("ID  "),new TextField()));
		flowList.add(new FlowPane(new Label("PW "),new TextField()));
		
		RadioButton rb1 = new RadioButton("여\t");
		RadioButton rb2 = new RadioButton("남");
		ToggleGroup tg = new ToggleGroup();
		rb1.setToggleGroup(tg);
		rb2.setToggleGroup(tg);
		rb1.setSelected(true);

		flowList.add(new FlowPane(rb1,rb2));

		CheckBox chk1 = new CheckBox("게임\t");
		CheckBox chk2 = new CheckBox("공부");

		flowList.add(new FlowPane(chk1,chk2));
		flowList.add(new FlowPane(new Label("하고 싶은 말")));
		TextArea ta = new TextArea();
		ta.setPrefSize(200, 50);
		flowList.add( new FlowPane(ta));

		vboxCenter.getChildren().addAll(flowList);
// 여ㅑ기까지 모름
		
		border.setTop(hb);
		border.setLeft(vb);
		border.setRight(right);
		border.setCenter(vboxCenter);
		
		arg0.setTitle("Quiz01");
		arg0.setScene(new Scene(border,500,300));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
