package toggleButton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex02 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		
		HBox hbox = new HBox();
		ToggleButton tb1 = new ToggleButton("111");
		ToggleButton tb2 = new ToggleButton("222");
		ToggleButton tb3 = new ToggleButton("333");
		
		ToggleGroup tg = new ToggleGroup();	// 3가지중 하나만 선택된다
		tb1.setToggleGroup(tg);
		tb2.setToggleGroup(tg);
		tb3.setToggleGroup(tg);
		
		tb2.setSelected(true);
		
		hbox.getChildren().addAll(tb1,tb2,tb3);
		hbox.setPrefSize(300, 200);
		
		
		arg0.setScene(new Scene(hbox));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
