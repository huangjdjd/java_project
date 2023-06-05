package java_project;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
class shop{
//	@FXML private Rectangle house1;
	
}
public class java_project extends Application {
	//Variables
	public static int score = 1000;
	
	//Components
	@FXML private Rectangle house1;
	@FXML private Button return_main_d;
	@FXML private Button return_main_a;
	@FXML private Button about_us;
	@FXML private Button start;
	@FXML private Button saying;
	@FXML private Text score_number;
	@FXML private Button buy_button;
	@FXML private Label money;
	@FXML private ImageView image1;
	@FXML private ImageView shop_picture;
	@FXML private ImageView money_picture;
	@FXML private Label money_show;
	@FXML private ImageView shop_return;
	@FXML private ImageView shop1;
	@FXML private Button sureBuy;
	@FXML private Button cancelBuy;
	@Override
	public void start(Stage primaryStage) throws Exception{

		//main
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
		//商店頁面
		FXMLLoader shop = new FXMLLoader(getClass().getResource("shop_page.fxml"));
		shop.setController(this);
		Parent root_shop = shop.load();
		Scene shop_page=new Scene(root_shop);
		//確認購買頁面
		FXMLLoader buy = new FXMLLoader(getClass().getResource("buy_shop.fxml"));
		buy.setController(this);
		Parent Buy = buy.load();
		Scene buy_page=new Scene(Buy);
		//正式遊戲畫面
		FXMLLoader start_page = new FXMLLoader(getClass().getResource("game_start.fxml"));
		start_page.setController(this);
		Parent start_game_page = start_page.load();
//		Group mainGroup=new Group(start_game_page);
//		mainGroup.getChildren().add(money_picture);
//		mainGroup.getChildren().add(shop_picture);
		Scene game_scene=new Scene(start_game_page);
		

	
		///onclick_main_說明
		saying.setOnAction(event->{
			primaryStage.setScene(dscene);
		});	
		//說明返回主頁
		return_main_d.setOnAction(event->{
			primaryStage.setScene(mscene);
		});	
		
		//onclick_main_介紹我們
		about_us.setOnAction(event->{
			primaryStage.setScene(ascene);
		});	

		saying.setOnAction(event->{
			primaryStage.setScene(dscene);
		});	
		//介紹返回主畫面
		return_main_a.setOnAction(event->{
			primaryStage.setScene(mscene);
		});
		//顯示商店頁面
		shop_picture.setOnMouseClicked(event->{
			primaryStage.setScene(shop_page);
		});
		//商店返回遊戲
		shop_return.setOnMouseClicked(event->{
			primaryStage.setScene(game_scene);
		});
		
		//進入遊戲
		start.setOnAction(event->{
			score_up();
			System.out.println(score);
		    primaryStage.setScene(game_scene);
		});
		//問題應該在這裡
		money_show.setText(""+score);
//		Label money= new Label(); 畫面顯示變數
//		money.setText(""+score);
//		buy_button.setOnAction(event->{
//			money.setText(""+score);
//			show_score.setText(String.valueOf(score));
//			score_up();
//			System.out.println(score);
//			image1.setImage(null);
//		});
		//商品一點擊確認購買
		shop1.setOnMouseClicked(event->{
			
			Stage newStage=new Stage();
			 newStage.setTitle("New Window");
			 cancelBuy.setOnAction(e->{
				 newStage.close();
			 });
//			 sureBuy.setOnAction(e->{
//				 
//			 });
			 newStage.setScene(buy_page);
			 newStage.show();
		});
		///設初始畫面
		primaryStage.setTitle("遊戲名稱");
		primaryStage.setScene(mscene);
		primaryStage.show();
//	    house1.setOnMousePressed(event -> {
	        // 计算鼠标相对于节点的偏移量
//	        x= event.getX() - house1.getLayoutX();
//	        y= event.getY() - house1.getLayoutY();
//	    });
//	    house1.setOnMouseDragged(event -> {
	        // 根据鼠标位置更新节点位置
//	        double newx = event.getX() - x;
//	        double newy = event.getY() - y;
//	        house1.setX(newx);
//	        house1.setY(newy);
//	    });
		
    }
	
	public void shop_show() {
	
	}
//	roote.getChildren().add(imageView);
	public void score_up() {
		score -= 1;
	}
	private double x;
	private double y;
//	public void drag() {
//		x=getX()-house1.getX();
//	}
	public void open_buyPage() {
//		Stage newStage=new Stage();
//		 newStage.setTitle("New Window");
//		 cancelBuy.setOnAction(event->{
//			 newStage.close();
//		 });
//		 newStage.setScene(buy_page);
//		 
	}
	public void alert() {
		System.out.println("ss");
		score+=1;
		System.out.println(score);
	}
	public void showsomething() {
//		System.out.println("sdee");
//		Image image=new Image("java_project/lonely.jpg");
//		image1.setImage(image);
//		StackPane root=new StackPane();
//		image.getChildren().add(imageView);
		
	}
	public static void main(String[] args) {
		launch(args);

	}

}
