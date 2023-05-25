package java_project;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class java_project extends Application {
	@FXML
	private Button return_main_d;
	@FXML
	private Button return_main_a;
	@FXML 
	private Button about_us;
	@FXML
	private Button start;
	@FXML
	private Button saying;
	@Override
	public void start(Stage primaryStage) throws Exception{

//		//main
		FXMLLoader main = new FXMLLoader(getClass().getResource("main.fxml"));
		main.setController(this);
		Parent root = main.load();
		Scene mscene=new Scene(root);
	
		//說明頁面
		FXMLLoader direction = new FXMLLoader(getClass().getResource("direction.fxml"));
		direction.setController(this);
		Parent root_d = direction.load();
		Scene dscene=new Scene(root_d);
		//關於我們頁面
		FXMLLoader about = new FXMLLoader(getClass().getResource("about_us.fxml"));
		about.setController(this);
		Parent root_a = about.load();
		Scene ascene=new Scene(root_a);
		
		///onclick_main_說明
		about_us.setOnAction(event->{
			primaryStage.setScene(dscene);
		});	
		//說明返回主頁
		return_main_d.setOnAction(event->{
			primaryStage.setScene(mscene);
		});	
		
		//onclick_main_介紹我們
		saying.setOnAction(event->{;
			primaryStage.setScene(ascene);
		});	
		//介紹返回主畫面
		return_main_a.setOnAction(event->{;
			primaryStage.setScene(mscene);
		});	
		
		///設初始畫面
		primaryStage.setTitle("Hello World");
		primaryStage.setScene(mscene);
		primaryStage.show();

}

	public static void main(String[] args) {
		launch(args);

	}
}
