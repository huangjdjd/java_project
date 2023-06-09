package java_project;

import java.util.ArrayList;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.event.*;
class shop{
//	@FXML private Rectangle house1;
	
}
public class java_project extends Application {
	//Variables
	public static final int tick = 5000;
	public static int score_per_tick = 0;
	public static int score = 50000;
	public boolean judgemoney=true;
	public int key_number=0;
	ArrayList<ImageView>jpglist=new ArrayList<ImageView>();
	
	//Components
	@FXML private ImageView treasure;
	@FXML private AnchorPane main_background;
	@FXML private ImageView final_answer;
	@FXML private ImageView box1;
	@FXML private ImageView box2;
	@FXML private ImageView a01;
	@FXML private ImageView a02;
	@FXML private ImageView a00;
	@FXML private ImageView a10;
	@FXML private ImageView a11;
	@FXML private ImageView a12;
	@FXML private ImageView a20;
	@FXML private ImageView a21;
	@FXML private ImageView a22;
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
	@FXML private Button road_restart;
	@FXML private Text moze;
	@FXML private ImageView map;
	// crypto
	@FXML private TextField password_input;
	@FXML private Button password_commit;
	@FXML private Button correct_password_return;
	@FXML private Button wrong_password_return;
	
	// music
	@FXML private Button music_success_close;

	
	@FXML private ImageView zpicture_key;
	@FXML private ImageView card_key;
	@FXML private ImageView cookie_key;
	@FXML private ImageView piano_key;
	@FXML private Button correct_word_return;
	@FXML private Button wrong_word_return;
	//
	ArrayList<String>idlist=new ArrayList<String>();

	public int fixx=2;
	public int fixy=2;
	public double x_origin;
	public double y_origin;
	public static Scene buy;
	public static Scene successBuy;
	public static Scene numberRoad;
	public static Scene crypto_page;
	public static Scene correct_page;
	public static Scene wrong_page;
	public static Scene music_page;
	public static Scene music_success_page;
	public static Scene word_puzzle_page;
	public static Stage bag_stage;
	public static Scene bagpage;
	public static Stage word_vertify;
	public static Stage password_verification_page;
	public static Stage zstage;
	public static Scene correct_word;
	public static Scene wrong_word;
	public static Scene finalpage;
	public static Stage temp_page;
	public static Scene losebuy;
	public int numberkey=0;

	@Override
	public void start(Stage primaryStage) throws Exception{
//		main_background.setStyle("-fx-background-image:url(java_project/main_background.png");
		idlist.add("22");
		Stage Zstage=new Stage();
		zstage=Zstage;
		///最終葉面
		
		FXMLLoader finals = new FXMLLoader(getClass().getResource("final.fxml"));
		finals.setController(this);
		Parent root_final = finals.load();
		Scene final_page=new Scene(root_final);
		java_project.finalpage=final_page;
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
		//購買失敗葉面
		FXMLLoader lose = new FXMLLoader(getClass().getResource("lose_buy.fxml"));
		lose.setController(this);
		Parent root_lose =lose.load();
		Scene lose_buy=new Scene(root_lose);
		java_project.losebuy=lose_buy;
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
		java_project.bagpage=bag_page;
		//crypto頁面
		FXMLLoader password = new FXMLLoader(getClass().getResource("crypto_page.fxml"));
		password.setController(this);
		Parent password_root = password.load();
		Scene cryptopage=new Scene(password_root);
		java_project.crypto_page=cryptopage;
		//回答正確錯誤
		FXMLLoader correct_word= new FXMLLoader(getClass().getResource("correct_word.fxml"));
		correct_word.setController(this);
		Parent correct_word_root = correct_word.load();
		Scene correct_word_page=new Scene(correct_word_root);
		java_project.correct_word=correct_word_page;
		
		FXMLLoader wrong_word= new FXMLLoader(getClass().getResource("wrong_word.fxml"));
		wrong_word.setController(this);
		Parent wrong_root =wrong_word.load();
		Scene wrong_word_page=new Scene(wrong_root);
		java_project.wrong_word=wrong_word_page;
		//密碼正確
		FXMLLoader correct_password = new FXMLLoader(getClass().getResource("correct_password_page.fxml"));
		correct_password.setController(this);
		Parent correct_password_root = correct_password.load();
		Scene correct_page=new Scene(correct_password_root);
		java_project.correct_page=correct_page;
		//密碼錯誤
		FXMLLoader wrong_password = new FXMLLoader(getClass().getResource("wrong_password_page.fxml"));
		wrong_password.setController(this);
		Parent wrong_password_root = wrong_password.load();
		Scene wrong_page=new Scene(wrong_password_root);
		java_project.wrong_page=wrong_page;
		//音樂頁面
		FXMLLoader music = new FXMLLoader(getClass().getResource("music_page.fxml"));
		music.setController(this);
		Parent music_root = music.load();
		Scene musicpage=new Scene(music_root);
		java_project.music_page=musicpage;
		//音樂成功
		FXMLLoader music_success = new FXMLLoader(getClass().getResource("music_success_page.fxml"));
		music_success.setController(this);
		Parent music_success_root = music_success.load();
		Scene music_success_page=new Scene(music_success_root);
		java_project.music_success_page=music_success_page;
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
		
		//定時獲得記憶點
//		Timer earn = new Timer();
//		TimerTask task = new TimerTask() {
//			public void run() {
//				score += score_per_tick;
//				render_score();
//				System.out.println(score);
//			}
//		};
//		earn.schedule(task, 0, tick); 
		
	    EventHandler<ActionEvent> eventHandler = e -> {
	    	score += score_per_tick;
	    	money_show.setText(""+score);
	    };
		
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(tick), eventHandler));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
        
		//數字華榮restart
		road_restart.setOnAction(event->{
			zstage.close();
		});

//		最後點擊寶箱
		treasure.setOnMouseClicked(e->{
			if(key_number==4) {
				Image tre=new Image("java_project/coordinate.png");
				treasure.setImage(tre);
			}
		});
	
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
			java_project.bag_stage=bagStage;
			bag_cancel.setOnAction(e->{
				bagStage.close();
			});
			bagStage.setTitle("bag");
			bagStage.setScene(bag_page);
			bagStage.show();
		});
		//crypto 密碼確認
		password_commit.setOnMouseClicked(event->{
			if (password_check())
				show_correct_page();
			else
				show_wrong_page();
		});
		//crypto 頁面關閉
		correct_password_return.setOnMouseClicked(event->{
			temp_page.close();
		});
		wrong_password_return.setOnMouseClicked(event->{
			temp_page.close();
		});
		//music 頁面關閉
		music_success_close.setOnMouseClicked(event->{
			temp_page.close();
		});
		//點擊頭像
		hint.setOnMouseClicked(event->{
			if(key_number==4) {
				primaryStage.setScene(finalpage);
				primaryStage.show();
			}
			else {
				hint_message.setText(""+"我的記憶還沒找回來，請加油");
			}

			
		});
		//文字回答判斷
		wrong_word_return.setOnAction(event->{
			word_vertify.close();
		});
		correct_word_return.setOnAction(event->{
			word_vertify.close();
		});
		
		//進入遊戲
		start.setOnAction(event->{
		    primaryStage.setScene(game_scene);
		});
		
		//已購買物品拖曳
		map.toBack();
        maine_pane1.setOnMousePressed(event -> {
            x_origin = event.getSceneX();
            y_origin = event.getSceneY();
        });
        maine_pane1.setOnMouseDragged(event -> {
        	//offset為滑鼠現在位置-移動前位置(必須隨時更新)
            double offsetX = event.getSceneX() - x_origin;
            double offsetY = event.getSceneY() - y_origin;
            maine_pane1.setLayoutX(maine_pane1.getLayoutX() + offsetX);
            maine_pane1.setLayoutY(maine_pane1.getLayoutY() + offsetY);
            x_origin = event.getSceneX();
            y_origin = event.getSceneY();
        });

        maine_pane2.setOnMousePressed(event -> {
            x_origin = event.getSceneX();
            y_origin = event.getSceneY();
        });
        maine_pane2.setOnMouseDragged(event -> {
            double offsetX = event.getSceneX() - x_origin;
            double offsetY = event.getSceneY() - y_origin;
            maine_pane2.setLayoutX(maine_pane2.getLayoutX() + offsetX);
            maine_pane2.setLayoutY(maine_pane2.getLayoutY() + offsetY);
            x_origin = event.getSceneX();
            y_origin = event.getSceneY();
        });

        maine_pane3.setOnMousePressed(event -> {
            x_origin = event.getSceneX();
            y_origin = event.getSceneY();
        });
        maine_pane3.setOnMouseDragged(event -> {
            double offsetX = event.getSceneX() - x_origin;
            double offsetY = event.getSceneY() - y_origin;
            maine_pane3.setLayoutX(maine_pane3.getLayoutX() + offsetX);
            maine_pane3.setLayoutY(maine_pane3.getLayoutY() + offsetY);
            x_origin = event.getSceneX();
            y_origin = event.getSceneY();
        });

        maine_pane4.setOnMousePressed(event -> {
            x_origin = event.getSceneX();
            y_origin = event.getSceneY();
        });
        maine_pane4.setOnMouseDragged(event -> {
            double offsetX = event.getSceneX() - x_origin;
            double offsetY = event.getSceneY() - y_origin;
            maine_pane4.setLayoutX(maine_pane4.getLayoutX() + offsetX);
            maine_pane4.setLayoutY(maine_pane4.getLayoutY() + offsetY);
            x_origin = event.getSceneX();
            y_origin = event.getSceneY();
        });

        maine_pane5.setOnMousePressed(event -> {
            x_origin = event.getSceneX();
            y_origin = event.getSceneY();
        });
        maine_pane5.setOnMouseDragged(event -> {
            double offsetX = event.getSceneX() - x_origin;
            double offsetY = event.getSceneY() - y_origin;
            maine_pane5.setLayoutX(maine_pane5.getLayoutX() + offsetX);
            maine_pane5.setLayoutY(maine_pane5.getLayoutY() + offsetY);
            x_origin = event.getSceneX();
            y_origin = event.getSceneY();
        });

        maine_pane6.setOnMousePressed(event -> {
            x_origin = event.getSceneX();
            y_origin = event.getSceneY();
        });
        maine_pane6.setOnMouseDragged(event -> {
            double offsetX = event.getSceneX() - x_origin;
            double offsetY = event.getSceneY() - y_origin;
            maine_pane6.setLayoutX(maine_pane6.getLayoutX() + offsetX);
            maine_pane6.setLayoutY(maine_pane6.getLayoutY() + offsetY);
            x_origin = event.getSceneX();
            y_origin = event.getSceneY();
        });

        maine_pane7.setOnMousePressed(event -> {
            x_origin = event.getSceneX();
            y_origin = event.getSceneY();
        });
        maine_pane7.setOnMouseDragged(event -> {
            double offsetX = event.getSceneX() - x_origin;
            double offsetY = event.getSceneY() - y_origin;
            maine_pane7.setLayoutX(maine_pane7.getLayoutX() + offsetX);
            maine_pane7.setLayoutY(maine_pane7.getLayoutY() + offsetY);
            x_origin = event.getSceneX();
            y_origin = event.getSceneY();
        });

        maine_pane8.setOnMousePressed(event -> {
            x_origin = event.getSceneX();
            y_origin = event.getSceneY();
        });
        maine_pane8.setOnMouseDragged(event -> {
            double offsetX = event.getSceneX() - x_origin;
            double offsetY = event.getSceneY() - y_origin;
            maine_pane8.setLayoutX(maine_pane8.getLayoutX() + offsetX);
            maine_pane8.setLayoutY(maine_pane8.getLayoutY() + offsetY);
            x_origin = event.getSceneX();
            y_origin = event.getSceneY();
        });

        maine_pane9.setOnMousePressed(event -> {
            x_origin = event.getSceneX();
            y_origin = event.getSceneY();
        });
        maine_pane9.setOnMouseDragged(event -> {
            double offsetX = event.getSceneX() - x_origin;
            double offsetY = event.getSceneY() - y_origin;
            maine_pane9.setLayoutX(maine_pane9.getLayoutX() + offsetX);
            maine_pane9.setLayoutY(maine_pane9.getLayoutY() + offsetY);
            x_origin = event.getSceneX();
            y_origin = event.getSceneY();
        });

        maine_pane10.setOnMousePressed(event -> {
            x_origin = event.getSceneX();
            y_origin = event.getSceneY();
        });
        maine_pane10.setOnMouseDragged(event -> {
            double offsetX = event.getSceneX() - x_origin;
            double offsetY = event.getSceneY() - y_origin;
            maine_pane10.setLayoutX(maine_pane10.getLayoutX() + offsetX);
            maine_pane10.setLayoutY(maine_pane10.getLayoutY() + offsetY);
            x_origin = event.getSceneX();
            y_origin = event.getSceneY();
        });

		
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

		primaryStage.setTitle("FIND-S-MEMORY");
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
	
	public void judge_word_answer(Event event) {
		Button button = (Button)event.getSource();
		String id=button.getId();
		if(id.equals("answer1")) {
			word_vertify = new Stage();
			word_vertify .setScene(wrong_word);
			word_vertify.show();
		}
		else if(id.equals("answer2")){
			word_vertify = new Stage();
			word_vertify .setScene(wrong_word);
			word_vertify.show();
		}
		else if(id.equals("answer3")){
			word_vertify = new Stage();
			word_vertify .setScene(correct_word);
			Image keyimage=new Image("java_project/key.png");
			key_number+=1;
			System.out.println(key_number);
			cookie_key.setImage(keyimage);
			
			word_vertify.show();
		}
		else if(id.equals("answer2")){
			word_vertify = new Stage();
			word_vertify .setScene(wrong_word);
			word_vertify.show();
		}
			
		
	}



//	public void delete(GridPane gridpane,int row,int column) {
//		for(int i=0;i<9;i++) {
//			ImageView elemtn=(ImageView) gridpane.getChildren().get(i);
//		
//			if(gridpane.getRowIndex(elemtn)==row &&gridpane.getColumnIndex(elemtn)==column) {
//				
//				gridpane.getChildren().remove(elemtn);
//				System.out.println(row+" "+column);
//				System.out.println(gridpane.getChildren().get(i));
//			}
//		}
//	}

	public void number_road(Event event) {	
		ImageView image = (ImageView) event.getSource();
		String id=image.getId();
		Image images=image.getImage();
		String addid=String.valueOf(id.charAt(1))+String.valueOf(id.charAt(2));
//		System.out.println(id);
		int x= Character.getNumericValue(id.charAt(1));
		int y= Character.getNumericValue(id.charAt(2));
		int nx=0;
		int ny=0;
		int lx=Character.getNumericValue(idlist.get(0).charAt(0));
		int ly=Character.getNumericValue(idlist.get(0).charAt(1));
//		System.out.println(lx+" "+ly);
		for(int i=-1;i<=1;i++) {
			nx=x+i;
			ny=y+i;
			if(nx==lx && y==ly) {
				image.setImage(null);
				String newidx=String.valueOf(lx)+String.valueOf(ly);
				ImageView newimagex=(ImageView)numberRoad.lookup("#a"+newidx);
				newimagex.setImage(images);
				idlist.clear();
				idlist.add(addid);
				break;
			}
			if(x==lx && ny==ly) {
				image.setImage(null);
				String newidx=String.valueOf(lx)+String.valueOf(ly);
				ImageView newimagey=(ImageView)numberRoad.lookup("#a"+newidx);
				newimagey.setImage(images);
				idlist.clear();
				idlist.add(addid);
				break;
			}
				
			
			
		}
		Image zpicimage=new Image("java_project/key.png");
		zpicture_key.setImage(zpicimage);
		if(numberkey<1) {
			key_number+=1;
		}
		numberkey+=1;
		System.out.println(key_number);

	}
	
	//crypto
	private String correct_password = "w31c0m3t0c5i3";
	public boolean password_check() {
		String answer = password_input.getText();
		if (answer.equals(correct_password))
		
//			Image secretimage=new Image("java_project/key.png");
			return true;
		else
			return false;
	}
	
	//music
	String music_note_stack = "";
	String correct_melody = "55612123";
	public void play_music(Event event) {
		ImageView image = (ImageView) event.getSource();
		String id=image.getId();
		switch (id) {
		case "G_note": music_note_stack += '5'; break;
		case "A_note": music_note_stack += '6'; break;
		case "C_note": music_note_stack += '1'; break;
		case "D_note": music_note_stack += '2'; break;
		case "E_note": music_note_stack += '3'; break;
		}
		if (music_note_stack.length() == 1 && (!music_note_stack.equals(correct_melody.substring(0, 1))))
			music_note_stack = "";
		else if (music_note_stack.length() == 2 && (!music_note_stack.equals(correct_melody.substring(0, 2))))
			music_note_stack = "";
		else if (music_note_stack.length() == 3 && (!music_note_stack.equals(correct_melody.substring(0, 3))))
			music_note_stack = "";
		else if (music_note_stack.length() == 4 && (!music_note_stack.equals(correct_melody.substring(0, 4))))
			music_note_stack = "";
		else if (music_note_stack.length() == 5 && (!music_note_stack.equals(correct_melody.substring(0, 5))))
			music_note_stack = "";
		else if (music_note_stack.length() == 6 && (!music_note_stack.equals(correct_melody.substring(0, 6))))
			music_note_stack = "";
		else if (music_note_stack.length() == 7 && (!music_note_stack.equals(correct_melody.substring(0, 7))))
			music_note_stack = "";
		else if (music_note_stack.length() == 8 && (!music_note_stack.equals(correct_melody.substring(0, 8))))
			music_note_stack = "";
		
		if (music_note_stack.equals(correct_melody)) {
			show_success_page();
			music_note_stack = "";
		}
	}
	
	//crypto
	public void show_correct_page() {
		temp_page = new Stage();
		temp_page.setScene(correct_page);
		Image crytoimage=new Image("java_project/key.png");
		card_key.setImage(crytoimage);
		key_number+=1;
		System.out.println(key_number);
		temp_page.show();
		System.out.println(key_number);
	}

	public void show_wrong_page() {
		temp_page = new Stage();
		temp_page.setScene(wrong_page);
		temp_page.show();
	}
	
	//music
	public void show_success_page() {
		temp_page = new Stage();
		temp_page.setScene(music_success_page);
		Image pianoimage=new Image("java_project/key.png");
		piano_key.setImage(pianoimage);
		key_number+=1;
		System.out.println(key_number);
		temp_page.show();
	}

	public void shop_show() {

	}
//	roote.getChildren().add(imageView);

	private double x;
	private double y;
//	public void drag() {
//		x=getX()-house1.getX();
//	}
	
	public void touch_collect() {
		if(piano.getImage() != null) {
			piano.setOnMouseClicked(e->{
				Stage pianoStage=new Stage();
				pianoStage.setScene(music_page);
				bag_stage.close();
				pianoStage.show();
			});
		}
		if(card.getImage() != null) {
			card.setOnMouseClicked(e->{
				Stage cardStage=new Stage();
				cardStage.setScene(crypto_page);
				bag_stage.close();
				cardStage.show();
			});
		}
		if(zpicture.getImage()!=null) {
			zpicture.setOnMouseClicked(e->{
//				Stage zStage=new Stage();
				zstage.setScene(numberRoad);
				bag_stage.close();
				zstage.show();
			});
		}
		if(cookie.getImage()!=null) {
			cookie.setOnMouseClicked(e->{
				Stage cookStage=new Stage();
				cookStage.setScene(word_puzzle_page);
				bag_stage.close();
				cookStage.show();
			});
		}
		
	}
	///判斷購物金額
	public void judge_money(int score,String id) {
		judgemoney=true;
		switch (id) {
		case "shop1": if(score<800) {
			judgemoney=false;
		}break;
		case "shop2": if(score<20000) {
			judgemoney=false;
		}break;
		case "shop3": if(score<2000) {
			judgemoney=false;
		}break;
		case "shop4": if(score<20) {
			judgemoney=false;
		}break;
		case "shop5": if(score<3500) {
			judgemoney=false;
		}break;
		case "shop6": if(score<500) {
			judgemoney=false;
		}break;
		case "shop7": if(score<250) {
			judgemoney=false;
		}break;
		case "shop8": if(score<7000) {
			judgemoney=false;
		}break;
		case "shop9": if(score<10) {
			judgemoney=false;
		}break;
		case "shop10": if(score<100) {
			judgemoney=false;
		}break;
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
		 newStage.setScene(buy);
		 newStage.show();
		 judge_money(score,id);
		 cancelBuy.setOnAction(e->{
			 newStage.close();
		 });
		 sureBuy.setOnAction(e->{
			 
			 if(judgemoney==true) {
				 switch (id){
				 case "shop1": 	Image image1 = new Image("java_project/computerclass.png");
				 	maine_pane1.setImage(image1); hint_message.setText("恭喜你獲得密碼卡，可打開背包看"); score-=800; score_per_tick+=200;
				 	Image cardimage=new Image("java_project/card.png"); card.setImage(cardimage);
				 	break;
				 case "shop2": 	Image image2 = new Image("java_project/tenyear.png");
				 	maine_pane2.setImage(image2); hint_message.setText("歲月真是如梭呀");
				 	score-=20000; score_per_tick+=3000;
				 	break;
				 case "shop3": 	Image image3 = new Image("java_project/concert.png");System.out.println("a");
				 	maine_pane3.setImage(image3);hint_message.setText("資工系音樂會真是個不錯的活動");score-=2500; score_per_tick+=300;
				 	break;
				 case "shop4": 	Image image4 = new Image("java_project/twopiano.png");
				 	maine_pane4.setImage(image4); hint_message.setText("音樂也是我的一條道路，恭喜你獲得二胡");
				 	score-=20; score_per_tick+=15; Image pianoimage=new Image("java_project/twopiano.png");
				 	piano.setImage(pianoimage);
				 	break;
				 case "shop5": 	Image image5 = new Image("java_project/aipiano.png");
				 	maine_pane5.setImage(image5); hint_message.setText("這是我們實驗室的心血之一"); score-=3500; score_per_tick+=500;
				 	break;
				 case "shop6": 	Image image6 = new Image("java_project/company.png");
				 	maine_pane6.setImage(image6); hint_message.setText("遙想在美國工作的那些時光"); score-=500; score_per_tick+=100;
				 	break;
				 case "shop7": 	Image image7 = new Image("java_project/animal.png");
				 	maine_pane7.setImage(image7); hint_message.setText("好多松鼠，恭喜你獲得鐵皮屋鬆餅"); score-=250; score_per_tick+=50;
				 	Image cookieimage=new Image("java_project/pancake.jpg"); cookie.setImage(cookieimage);
				 	break;
				 case "shop8": 	Image image8 = new Image("java_project/assitant.png");
				 	maine_pane8.setImage(image8); hint_message.setText("助教們是課程的基石，恭喜你獲得照片"); score-=7000; score_per_tick+=800;
				 	Image zimage=new Image("java_project/z.png"); zpicture.setImage(zimage);
				 	break;
				 case "shop9": 	Image image9 = new Image("java_project/lab.png");
				 	maine_pane9.setImage(image9); hint_message.setText("我們的實驗室肯定能日益壯大"); score-=10; score_per_tick+=5;
				 	break;
				 case "shop10": Image image10 = new Image("java_project/unversity.jpg");
				 	maine_pane10.setImage(image10); hint_message.setText("青春的時光呀"); score-=100; score_per_tick+=30;
				 	break;
				 }
				 money_show.setText(""+score);
				 newStage.setScene(successBuy);
				 	
			 }
			 else {
				 newStage.setScene(losebuy);
				 
			 }
			 

		 });

//		 
	}
	public void final_box(Event event) {
		ImageView image = (ImageView)event.getSource();
		String id=image.getId();
		System.out.println(id);
		if(id.equals("box1")) {
			box1.setImage(null);
			box2.setImage(null);
			Image good=new Image("java_project/girl.png");
			final_answer.setImage(good);
			moze.setText("恭喜你!");
		}
		else if(id.equals("box2")) {
			box1.setImage(null);
			box2.setImage(null);
			moze.setText("要爆肝了");
			Image bad=new Image("java_project/hell.jpg");
			final_answer.setImage(bad);
		}
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
