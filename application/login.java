package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*; 
public class login extends Application {
	Stage SignStage = new Stage();
	GridPane SignPane = new GridPane();// 登录界面的
	Scene SignScene = new Scene(SignPane, 600, 400);
	GridPane RegisterPane = new GridPane();// 注册界面的
	Scene RegisterScene = new Scene(RegisterPane, 800, 700);

	public void start(Stage primaryStage) {
		Sign();
		Register();
		SignStage.setScene(SignScene);
		SignStage.initStyle(StageStyle.UNDECORATED);
		SignStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
	void Sign() {// ***登录UI
		DropShadow shadow = new DropShadow();
		Label SignTitle = new Label("    登录");
		SignTitle.setFont(Font.font("T", FontWeight.LIGHT, FontPosture.ITALIC, 40));
		Label SignAccountLabel = new Label("账号:");
		SignAccountLabel.setFont(new Font(25));
		Label SignPasswordLabel = new Label("密码:");
		SignPasswordLabel.setFont(new Font(25));
		Label SignForgetLabel = new Label("账号或者密码错误！");
		SignForgetLabel.setTextFill(Color.RED);
		SignForgetLabel.setFont(new Font(20));
		SignForgetLabel.setVisible(false);

		TextField SignAccountTextField = new TextField();
		SignAccountTextField.setFont(new Font(17));
		
		PasswordField SignPasswordTextField = new PasswordField();
		SignPasswordTextField.setFont(new Font(17));
		Tooltip tooltip = new Tooltip("请输入的密码包含大小写字母以及数字，且位数不少于8位");
		SignPasswordTextField.setTooltip(tooltip);
		
		Button SignOkButton = new Button("登录");
		Button SignRegisterButton = new Button("注册");
		Button clear = new Button("清除");
		SignOkButton.setPrefHeight(35);
		SignOkButton.setPrefWidth(70);
		SignOkButton.setFont(Font.font(18));
        BackgroundFill backgroundFill_SignOkButton = new BackgroundFill(Paint.valueOf("#00FFFF"), new CornerRadii(20), Insets.EMPTY);
        Background background_SignOkButton = new Background(backgroundFill_SignOkButton);
        SignOkButton.setBackground(background_SignOkButton);
		SignOkButton.setTranslateX(200);
		SignOkButton.setTranslateY(250);
		
		clear.setPrefHeight(35);
        clear.setPrefWidth(70);
        clear.setFont(Font.font(18));
        clear.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent ex) -> {
		    clear.setEffect(shadow);
		});
		//当鼠标移到按钮上移去阴影作用
		clear.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent ex) -> {
		    clear.setEffect(null);
		});
		clear.setTranslateX(500);
		clear.setTranslateY(310);
		
		SignRegisterButton.setPrefHeight(35);
		SignRegisterButton.setPrefWidth(70);
		SignRegisterButton.setFont(Font.font(18));
        BackgroundFill backgroundFill_SignRegisterButton = new BackgroundFill(Paint.valueOf("#00FFFF"), new CornerRadii(20), Insets.EMPTY);
        Background background_SignRegisterButton = new Background(backgroundFill_SignRegisterButton);
        SignRegisterButton.setBackground(background_SignRegisterButton);
		SignRegisterButton.setTranslateX(370);
		SignRegisterButton.setTranslateY(250);
		
		Button exit = new Button("退出");
		exit.setPrefHeight(35);
		exit.setPrefWidth(70);
		exit.setFont(Font.font(18));
		exit.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent ex) -> {
		    clear.setEffect(shadow);
		});
		//当鼠标移到按钮上移去阴影作用
		exit.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent ex) -> {
		    clear.setEffect(null);
		});
        exit.setTranslateX(500);
		exit.setTranslateY(355);

		SignPane.setHgap(20);
		SignPane.setVgap(20);

		SignPane.setPadding(new Insets(0, 10, 10, 10));

		SignPane.add(SignTitle, 4, 2);
		SignPane.add(SignAccountLabel, 3, 3);
		SignPane.add(SignAccountTextField, 4, 3);
		SignPane.add(SignPasswordLabel, 3, 4);
		SignPane.add(SignPasswordTextField, 4, 4);
		SignPane.add(SignForgetLabel, 4, 7);
		SignPane.getChildren().addAll(SignOkButton, SignRegisterButton, clear,exit);
		SignPane.setStyle("-fx-background-image: url(" + "photo/4d51cbda1a415536.jpg" + "); "
				+ "-fx-background-position: center center; " + "-fx-background-repeat: stretch;"
				+ "-fx-background-color:  transparent;" + "-fx-background-size: 750px;");

		SignOkButton.setOnAction(e -> { // 转跳主程序界面
			try {
				if (accountNumber.testing(SignAccountTextField.getText(), SignPasswordTextField.getText()) == 1){
					Main enter = new Main();
					enter.start(new Stage());
					SignStage.close();
				}
				else {
					SignForgetLabel.setVisible(true);
				}
			} catch (IOException ex) {
			}
		});
		clear.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				SignAccountTextField.setText("");
				SignPasswordTextField.setText("");
			}
		});
		exit.setOnAction(e2->{
			SignStage.close();
		});
		SignRegisterButton.setOnAction(e -> {// 转跳注册界面
			SignStage.setScene(RegisterScene);
		});
	}
	void Register() {// ***注册UI
		DropShadow shadow = new DropShadow();
		Label RegisterTitle = new Label("   注册");
		RegisterTitle.setFont(Font.font("T", FontWeight.LIGHT, FontPosture.ITALIC, 40));
		Label RegisterAccountLabel = new Label("账号:");
		RegisterAccountLabel.setFont(Font.font("T", FontWeight.LIGHT, FontPosture.ITALIC, 25));
		Label RegisterPasswordLabel = new Label("密码:");
		RegisterPasswordLabel.setFont(Font.font("T", FontWeight.LIGHT, FontPosture.ITALIC, 25));
		Label RegisterIDLabel = new Label("用户名:");
		RegisterIDLabel.setFont(Font.font("T", FontWeight.LIGHT, FontPosture.ITALIC, 25));
		
		Label notEquals = new Label("你的注册密码形式或数量有误，请重新输入密码");
		notEquals.setTextFill(Color.RED);
		notEquals.setFont(new Font(25));
		notEquals.setVisible(false);
		
		Label RegisterRepeatLabel = new Label("该账号已存在");
		RegisterRepeatLabel.setTextFill(Color.RED);
		RegisterRepeatLabel.setFont(new Font(25));
		RegisterRepeatLabel.setVisible(false);
		
		Label RegisterSuccessLabel = new Label("注册成功！");
		RegisterSuccessLabel.setTextFill(Color.RED);
		RegisterSuccessLabel.setFont(new Font(20));
		RegisterSuccessLabel.setVisible(false);

		Button RegisterOkButton = new Button("确定");
		RegisterOkButton.setPrefHeight(35);
		RegisterOkButton.setPrefWidth(70);
		RegisterOkButton.setFont(Font.font(18));
		RegisterOkButton.setTranslateX(250);
		RegisterOkButton.setTranslateY(550);
		
		Button RegisterReButton = new Button("返回");
		RegisterReButton.setPrefHeight(35);
		RegisterReButton.setPrefWidth(70);
		RegisterReButton.setFont(Font.font(18));
		RegisterReButton.setTranslateX(420);
		RegisterReButton.setTranslateY(550);
		RegisterReButton.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent ex) -> {
			RegisterReButton.setEffect(shadow);
		});
		//当鼠标移到按钮上移去阴影作用
		RegisterReButton.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent ex) -> {
			RegisterReButton.setEffect(null);
		});

		TextField RegisterAccountTextField = new TextField();
		RegisterAccountTextField.setFont(new Font(17));
		TextField RegisterPasswordTextField = new TextField();
		//设置显示提示
		Tooltip tooltip = new Tooltip("请输入的密码包含大小写字母以及数字，且位数不少于8位");
		RegisterPasswordTextField.setTooltip(tooltip);
		RegisterPasswordTextField.setFont(new Font(17));
		TextField RegisterIDTextField = new TextField();
		RegisterIDTextField.setFont(new Font(17));
		
		Label confirm = new Label("确认密码:");
		confirm.setFont(Font.font("T", FontWeight.LIGHT, FontPosture.ITALIC, 25));
		TextField confirmPassword = new TextField();
		confirmPassword.setFont(new Font(17));
		
		
		RegisterPane.setHgap(20);
		RegisterPane.setVgap(20);
		RegisterPane.setStyle("-fx-background-image: url(" + "photo/20210604124014343.jpg"
				+ "); " + "-fx-background-position: center center; " + "-fx-background-repeat: stretch;"
				+ "-fx-background-color:  transparent;" + "-fx-background-size: 500px;");

		RegisterPane.setPadding(new Insets(0, 10, 10, 10));
		RegisterPane.add(RegisterTitle, 3, 0);
		RegisterPane.add(RegisterAccountLabel, 1, 3);
		RegisterPane.add(RegisterPasswordLabel, 1, 6);
		RegisterPane.add(confirm, 1, 9);
		RegisterPane.add(RegisterIDLabel, 1, 12);
		
		RegisterPane.add(notEquals,3,7);
		RegisterPane.add(RegisterAccountTextField, 3, 3);
		RegisterPane.add(RegisterPasswordTextField, 3, 6);
		RegisterPane.add(confirmPassword, 3, 9);
		RegisterPane.add(RegisterIDTextField, 3, 12);
		RegisterPane.add(RegisterRepeatLabel, 3, 5);		
		RegisterPane.add(RegisterSuccessLabel, 3, 10);
		RegisterPane.getChildren().addAll(RegisterOkButton, RegisterReButton);
		

		RegisterReButton.setOnAction(e -> {
			SignStage.setScene(SignScene);
		});
		RegisterOkButton.setOnAction(e -> {
		        boolean  flag1 = true;
				boolean  flag2 = true;
				if(!confirmPassword.getText().equals(RegisterPasswordTextField.getText())||!alphabet(RegisterPasswordTextField.getText())){
					flag1 = false;
					notEquals.setVisible(true);			
				}
				if (accountNumber.testing(RegisterAccountTextField.getText()) != 1) {
						flag2 = false;
						notEquals.setVisible(true);
				}
				if(flag1&&flag2){
					try {
						accountNumber.register(RegisterAccountTextField.getText(), RegisterPasswordTextField.getText(),
						RegisterIDTextField.getText());
						RegisterSuccessLabel.setVisible(true);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					
				}
		});
	}
	public static boolean alphabet(String s){
		boolean flag = true;
		 //数字
	    final String REG_NUMBER = ".*\\d+.*";
	    //小写字母
	    final String REG_UPPERCASE = ".*[A-Z]+.*";
	    //大写字母
	    final String REG_LOWERCASE = ".*[a-z]+.*";
	    if(s.isEmpty()||s.length()<8) flag =  false;
	    int i = 0;
	    if(s.matches(REG_NUMBER)) i++;
	    if (s.matches(REG_LOWERCASE))i++;
        if (s.matches(REG_UPPERCASE)) i++;
        if(i < 3) flag = false;
        return flag;
	}
}

