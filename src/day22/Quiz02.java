package day22;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

class event{
	public void setOn(Label lbl) {
		lbl.setOnMouseEntered(e->{
			lbl.setScaleX(1.5);
			lbl.setScaleY(1.5);
		});
	}
	public void setIn(Label lbl) {
		lbl.setOnMouseExited(e->{
			lbl.setScaleX(1);
			lbl.setScaleY(1);
		});
	}
}

public class Quiz02 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		
		HBox hbox = new HBox(10);
		Label img = new Label("Search",new ImageView("/img/search.png"));
		Label rct = new Label("values");
		Label wrap = new Label("A label that needs to be wrapped");
		HBox wrBox = new HBox();
		img.setFont(new Font(25));
		img.setTextFill(Color.web("#5CD1E5"));
		
		rct.setFont(new Font(30));
		rct.setRotate(270);
		rct.setTranslateY(60);
		
		
		wrap.setWrapText(true);
		wrBox.setPadding(new Insets(40,0,0,0));
		wrBox.setPrefSize(100, 100);
		wrBox.getChildren().add(wrap);
		
		event ev = new event();
		
		ev.setOn(img);
		ev.setIn(img);
		
		ev.setOn(rct);
		ev.setIn(rct);
		
		ev.setOn(wrap);
		ev.setIn(wrap);
		
		hbox.getChildren().addAll(img,rct,wrBox);
		
		arg0.setScene(new Scene(hbox,400,170));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
