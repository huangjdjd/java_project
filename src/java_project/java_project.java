package java_project;

import java.awt.event.MouseEvent;
import java.util.ArrayList;

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
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.*;
class shop{
//	@FXML private Rectangle house1;
	
}
public class java_project extends Application {
	//Variables
	ArrayList<ImageView>jpglist=new ArrayList<ImageView>();
	public static int score = 1000;
	//Components
	@FXML private ImageView jpg1;
	@FXML private ImageView jpg2;
	@FXML private ImageView jpg3;
	@FXML private ImageView jpg4;
	@FXML private ImageView jpg5;
	@FXML private ImageView jpg6;
	@FXML private ImageView jpg7;
	@FXML private ImageView jpg8;
	@FXML private GridPane gridPane;
	@FXML private Label hint_message;
	
	@FXML private ImageView card;
	@FXML private ImageView zpicture;
	@FXML private ImageView cookie;
	@FXML private ImageView piano;
	
	@FXML private ImageView maine_pane1;
	@FXML private ImageView maine_pane2;
	@FXML private ImageView maine_pane3;
	@FXML private ImageView maine_pane4;
	@FXML private ImageView maine_pane5;
	@FXML private ImageView maine_pane6;
	@FXML private ImageView maine_pane7;
	@FXML private ImageView maine_pane8;
	@FXML private ImageView maine_pane9;
	@FXML private ImageView maine_pane10;
	@FXML private ImageView hint;
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
	@FXML private ImageView bag;
	@FXML private Button bag_cancel;
	
	public static Scene buy;
	public static Scene successBuy;
	public static Scene numberRoad;
	public static Scene crypto_page;
	public static Scene word_puzzle_page;
	@Override
	public void start(Stage primaryStage) throws Exception{
		
		//main
		FXMLLoader main = new FXMLLoader(getClass().getResource("main.fxml"));
		main.setController(this);
		Parent root = main.load();
		Scene mscene=new Scene(root);
		//購買成功葉面
		FXMLLoader buySuccess = new FXMLLoader(getClass().getResource("success_buy.fxml"));
		buySuccess.setController(this);
		Parent buysuc = buySuccess.load();
		Scene buy_success=new Scene(buysuc);
		java_project.successBuy=buy_success;
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
		//數字華榮道畫面
		FXMLLoader road = new FXMLLoader(getClass().getResource("number_road.fxml"));
		road.setController(this);
		Parent numberroad = road.load();
		Scene number_road=new Scene(numberroad);
		java_project.numberRoad=number_road;
		//確認購買頁面
		FXMLLoader buy = new FXMLLoader(getClass().getResource("buy_shop.fxml"));
		buy.setController(this);
		Parent Buy = buy.load();
		Scene buy_page=new Scene(Buy);
		java_project.buy = buy_page;
		//背包畫面
		FXMLLoader bags = new FXMLLoader(getClass().getResource("bag_page.fxml"));
		bags.setController(this);
		Parent bag_root = bags.load();
		Scene bag_page=new Scene(bag_root);
		//解密葉面
		FXMLLoader password = new FXMLLoader(getClass().getResource("crypto_page.fxml"));
		password.setController(this);
		Parent password_root = password.load();
		Scene cryptopage=new Scene(password_root);
		java_project.crypto_page=cryptopage;
		//文字頁面
		FXMLLoader word = new FXMLLoader(getClass().getResource("word_puzzle.fxml"));
		word.setController(this);
		Parent word_root = word.load();
		Scene word_page=new Scene(word_root);
		java_project.word_puzzle_page=word_page;
		//正式遊戲畫面
		FXMLLoader start_page = new FXMLLoader(getClass().getResource("game_start.fxml"));
		start_page.setController(this);
		Parent start_game_page = start_page.load();
//		Group mainGroup=new Group(start_game_page);
//		mainGroup.getChildren().add(money_picture);
//		mainGroup.getChildren().add(shop_picture);
		Scene game_scene=new Scene(start_game_page);
		
		//測試數字華榮道遊戲
//			boolean hasChildrenInRow = gridPane.getRowConstraints().get(3).getMaxHeight()>0;判斷有無子節點
//		    house1.setOnMousePressed(event -> {
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
		//點擊背包動作
		bag.setOnMouseClicked(event->{
			Stage bagStage=new Stage();
			bag_cancel.setOnAction(e->{
				bagStage.close();
			});
			bagStage.setTitle("bag");
			bagStage.setScene(bag_page);
			bagStage.show();
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
//		shop1.setOnMouseClicked(event->{
//			
//			Stage newStage=new Stage();
//			 newStage.setTitle("New Window");
//			 cancelBuy.setOnAction(e->{
//				 newStage.close();
//			 });
//			 sureBuy.setOnAction(e->{
//				 
//			 });
//			 newStage.setScene(buy_page);
//			 newStage.show();
//		});
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
	
	public void testnumberroad(ActionEvent event) {

		
	}
	public void judge_word_answer(Event event) {
		Button button = (Button)event.getSource();
		String id=button.getId();
		if(id.equals("answer1")) {
			
		}
		else {
			
		}
	}
	public void number_road(Event event) {
//		ImageView image = (ImageView) event.getSource();
		ImageView image=(ImageView)event.getSource();
		String id=image.getId();
		System.out.println(id);
//		image.addEventHandler(ActionEvent.ACTION,new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent event) {
//			
//			}
//		});
	
//	    image.setOnMouseMoved(event -> {
//	    	image.setLayoutX(event.getX());
//	    });
//		

//		a.setOnDragDetected(event->{
//
//		});
	}
	public void shop_show() {

	}
//	roote.getChildren().add(imageView);
	public void score_up() {
		score += 1;
	}
	private double x;
	private double y;
//	public void drag() {
//		x=getX()-house1.getX();
//	}
	
	public void touch_collect() {
		if(card.getImage() != null) {
			card.setOnMouseClicked(e->{
				Stage cardStage=new Stage();
				cardStage.setScene(crypto_page);
				cardStage.show();
			});
		}
		else if(zpicture.getImage()!=null) {
			zpicture.setOnMouseClicked(e->{
				Stage zStage=new Stage();
				zStage.setScene(numberRoad);
				zStage.show();
			});
		}
		else if(cookie.getImage()!=null) {
			cookie.setOnMouseClicked(e->{
				Stage cookStage=new Stage();
				cookStage.setScene(word_puzzle_page);
				cookStage.show();
			});
		}
		
	}
	public void open_buyPage(Event event) {
		ImageView image = (ImageView)event.getSource();
		String id=image.getId();
		System.out.println(id);
//		System.out.println("kddd");
//		ImageView s=(ImageView)image;
//		String id=s.getId();
		Stage newStage=new Stage();
		 newStage.setTitle("New Window");
		 cancelBuy.setOnAction(e->{
			 newStage.close();
		 });
		 sureBuy.setOnAction(e->{
			 switch (id){
			 case "shop1": 	Image image1 = new Image("java_project/lonely.jpg");maine_pane1.setImage(image1);hint_message.setText("");
			 break;
			 case "shop2": 	Image image2 = new Image("java_project/lonely.jpg");maine_pane2.setImage(image2);hint_message.setText("恭喜你獲得密碼卡，可打開背包看");
			 Image cardimage=new Image("java_project/lonely.jpg");card.setImage(cardimage);
			 break;
			 case "shop3": 	Image image3 = new Image("java_project/lonely.jpg");maine_pane3.setImage(image3);hint_message.setText("");
			 break;
			 case "shop4": 	Image image4 = new Image("java_project/lonely.jpg");maine_pane4.setImage(image4);hint_message.setText("恭喜你獲得二胡");
			 Image pianoimage=new Image("java_project/lonely.jpg");piano.setImage(pianoimage);
			 break;
			 case "shop5": 	Image image5 = new Image("java_project/lonely.jpg");maine_pane5.setImage(image5);hint_message.setText("");
			 break;
			 case "shop6": 	Image image6 = new Image("java_project/lonely.jpg");maine_pane6.setImage(image6);hint_message.setText("");
			 break;
			 case "shop7": 	Image image7 = new Image("java_project/lonely.jpg");maine_pane7.setImage(image7);hint_message.setText("恭喜你獲得鐵皮屋鬆餅");
			 Image cookieimage=new Image("java_project/lonely.jpg");cookie.setImage(cookieimage);
			 break;
			 case "shop8": 	Image image8 = new Image("java_project/lonely.jpg");maine_pane8.setImage(image8);hint_message.setText("恭喜你獲得照片");
			 Image zimage=new Image("java_project/lonely.jpg");zpicture.setImage(zimage);
			 break;
			 case "shop9": 	Image image9 = new Image("java_project/lonely.jpg");maine_pane9.setImage(image9);hint_message.setText("");
			 break;
			 case "shop10": Image image10 = new Image("java_project/lonely.jpg");maine_pane10.setImage(image10);
			 break;
			 }
			 newStage.setScene(successBuy);
			 
		 });
		 newStage.setScene(buy);
		 newStage.show();
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
