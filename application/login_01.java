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
			Label l_name = new Label("�û�����");
	        l_name.setFont(new Font(20));//�����С
	        l_name.setTooltip(new Tooltip("����������"));
	        Label l_pswd = new Label("���룺");
	        l_pswd.setTooltip(new Tooltip("����������"));
	        l_pswd.setFont(new Font(20));
	        
	        TextField t_name = new TextField();
	        t_name.setFont(new Font(17));
	        t_name.setUserData("�ν�");
	        PasswordField p_pswd = new PasswordField();
	        p_pswd.setFont(new Font(17));
	        p_pswd.setUserData("Rj123456");
	        Button login = new Button("��½");
	        //���ð�ť��С
	        login.setPrefHeight(35);
	        login.setPrefWidth(70);
	        login.setFont(Font.font(18));
	        //���Botton��ť��ɫ��Բ��
	        BackgroundFill backgroundFill_login = new BackgroundFill(Paint.valueOf("#00FFFF"), new CornerRadii(20), Insets.EMPTY);
	        Background background_login = new Background(backgroundFill_login);
	        login.setBackground(background_login);
	       
	        Button clear = new Button("���");
	        clear.setPrefHeight(35);
	        clear.setPrefWidth(70);
	        clear.setFont(Font.font(18));
	        BackgroundFill backgroundFill_clear = new BackgroundFill(Paint.valueOf("#8FBC8F"), new CornerRadii(20), Insets.EMPTY);
	        Background background_clear = new Background(backgroundFill_clear);
	        clear.setBackground(background_clear);
	        
	        GridPane grid = new GridPane();
	        
	        grid.setStyle("-fx-backgroud-color: #efead0");
	        grid.add(l_name, 0, 0);//��l_name���ڵ�0�е�0��
	        grid.add(t_name, 1, 0);
	        grid.add(l_pswd, 0, 1);
	        grid.add(p_pswd, 1, 1);
	        grid.add(clear, 1, 2);
	        grid.add(login, 1, 2);
	        
	        grid.setAlignment(Pos.CENTER);//����
	        grid.setHgap(10);//����ˮƽ���
	        grid.setVgap(17);//���ô�ֱ���
	        GridPane.setMargin(login, new Insets(0,0,0,120));
	        //����¼�
	        clear.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					t_name.setText("");
					p_pswd.setText("");
				}
			});
	        
	        //��½�¼�
	        login.setOnAction(new EventHandler<ActionEvent>() {
	        	@Override
				public void handle(ActionEvent event) {
					String name = t_name.getText();
					String pswd = p_pswd.getText();
					if(t_name.getUserData().equals(name)&&p_pswd.getUserData().equals(pswd)){
					System.out.println("��½�ɹ�");
					//����������
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
	    		        Text text = new Text("��½ʧ�ܣ��û������������");
	    		        text.setFont(Font.font(22));
	    		        bor.setTop(text);
	    		        Button close = new Button("ȷ��");
	    		        close.setOnAction(e2->{//����Button�������ļ�д
	    		        	Stage stage3 = (Stage) close.getScene().getWindow();
							stage3.close();
	    		        });
	    		        close.setPrefSize(60, 40);
	    		        bor.setCenter(close);
	    		        stage.setWidth(300);
	    		        stage.setHeight(200);
	    		        stage.setResizable(false); //��¼���ڵĴ�С������ı�
	    		        stage.show();					}
				}
			});
	        // grid.add(view,0,0);
			Scene scene = new Scene(grid);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("����Ա��½����");
			primaryStage.getIcons().add(new Image("photo/IMG_20220429_180719.jpg"));
			primaryStage.setWidth(500);
	        primaryStage.setHeight(400);
	        primaryStage.setResizable(false); //��¼���ڵĴ�С������ı�
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}

