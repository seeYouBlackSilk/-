package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*; 

public class login_01 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Label l_name = new Label("用户名：");
	        l_name.setFont(new Font(20));//字体大小
	        l_name.setTooltip(new Tooltip("请输入名字"));
	        Label l_pswd = new Label("密码：");
	        l_pswd.setTooltip(new Tooltip("请输入密码"));
	        l_pswd.setFont(new Font(20));
	        
	        TextField t_name = new TextField();
	        t_name.setFont(new Font(17));
	        t_name.setUserData("任蒋");
	        PasswordField p_pswd = new PasswordField();
	        p_pswd.setFont(new Font(17));
	        p_pswd.setUserData("Rj123456");
	        Button login = new Button("登陆");
	        //设置按钮大小
	        login.setPrefHeight(35);
	        login.setPrefWidth(70);
	        login.setFont(Font.font(18));
	        //添加Botton按钮颜色和圆角
	        BackgroundFill backgroundFill_login = new BackgroundFill(Paint.valueOf("#00FFFF"), new CornerRadii(20), Insets.EMPTY);
	        Background background_login = new Background(backgroundFill_login);
	        login.setBackground(background_login);
	       
	        Button clear = new Button("清除");
	        clear.setPrefHeight(35);
	        clear.setPrefWidth(70);
	        clear.setFont(Font.font(18));
	        BackgroundFill backgroundFill_clear = new BackgroundFill(Paint.valueOf("#8FBC8F"), new CornerRadii(20), Insets.EMPTY);
	        Background background_clear = new Background(backgroundFill_clear);
	        clear.setBackground(background_clear);
	        
	        GridPane grid = new GridPane();
	        
	        grid.setStyle("-fx-backgroud-color: #efead0");
	        grid.add(l_name, 0, 0);//将l_name放在第0列第0行
	        grid.add(t_name, 1, 0);
	        grid.add(l_pswd, 0, 1);
	        grid.add(p_pswd, 1, 1);
	        grid.add(clear, 1, 2);
	        grid.add(login, 1, 2);
	        
	        grid.setAlignment(Pos.CENTER);//剧中
	        grid.setHgap(10);//设置水平间距
	        grid.setVgap(17);//设置垂直间距
	        GridPane.setMargin(login, new Insets(0,0,0,120));
	        //清除事件
	        clear.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					t_name.setText("");
					p_pswd.setText("");
				}
			});
	        
	        //登陆事件
	        login.setOnAction(new EventHandler<ActionEvent>() {
	        	@Override
				public void handle(ActionEvent event) {
					String name = t_name.getText();
					String pswd = p_pswd.getText();
					if(t_name.getUserData().equals(name)&&p_pswd.getUserData().equals(pswd)){
					System.out.println("登陆成功");
					//进入主程序
					Main enter = new Main();
					enter.start(new Stage());
	                 primaryStage.close();	         
					}
					else{
	                    l_name.setTextFill(Color.CORAL);
	                    Stage stage = new Stage();
	    		        BorderPane bor = new BorderPane();
	    		        bor.setStyle("-fx-background-color: cadetblue");
	    		        Scene scene = new Scene(bor);
	    		        stage.setScene(scene);
	    		        Text text = new Text("登陆失败：用户名或密码错误");
	    		        text.setFont(Font.font(22));
	    		        bor.setTop(text);
	    		        Button close = new Button("确定");
	    		        close.setOnAction(e2->{//这是Button进入对象的简写
	    		        	Stage stage3 = (Stage) close.getScene().getWindow();
							stage3.close();
	    		        });
	    		        close.setPrefSize(60, 40);
	    		        bor.setCenter(close);
	    		        stage.setWidth(300);
	    		        stage.setHeight(200);
	    		        stage.setResizable(false); //登录窗口的大小不允许改变
	    		        stage.show();					}
				}
			});
	        // grid.add(view,0,0);
			Scene scene = new Scene(grid);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("管理员登陆界面");
			primaryStage.getIcons().add(new Image("photo/IMG_20220429_180719.jpg"));
			primaryStage.setWidth(500);
	        primaryStage.setHeight(400);
	        primaryStage.setResizable(false); //登录窗口的大小不允许改变
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}

