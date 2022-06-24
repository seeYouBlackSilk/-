
package application;

import java.io.*;

import java.util.ArrayList;
import java.util.Collection;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.scene.text.*;
/*
 * �����Ӻ��޸ĵĹ���
 * 1.��ɾ��������Ϊɾ�����֤��
 * 2.�����˹��ţ�ѧ�ţ����֤��λ���ж�
 * 3.������Զ���������
 * 4.������������ı���������ó���Comboboxѡ���
 * 5.����ť�������ʾ��Ӱ��Ч��
 * 6.ɾ�����޸Ĺ���
 * 7.�ڲ�ѯ��Ϣ������˰�ť�󶨻���
 * 8.�ḻ�˵�½������ʽ
 * 9.������ע�Ṧ��
 * 10.�����һ�������������ʾ����
 * 11.������������֤������һ��Ҫ�ǰ�����Сд��ĸ�Լ����֣���λ��һ��Ҫ�Ǵ��ڻ����8λ���Լ�ע���˺�����//����������ʽ�����ж�
 * 12.�����˶�����ļ�����ʽ�Լ�����
 * */
public class Main extends Application
{
	Stage s = new Stage();
	File file = new File("teacher.txt");
	public void start(Stage primaryStage)
	{
		try
		{
			BorderPane root = new BorderPane();
			primaryStage.getIcons().add(new Image("photo/4d51cbda1a415536.jpg"));
			VBox vbox = new VBox();
			Text text = new Text(80,50,"��ʦ��Ϣ����ϵͳ");
			text.setFont(Font.font("Courier", FontWeight.BOLD, 45));
			
			Button in = new Button("��ӽ�ʦ��Ϣ");
			DropShadow shadow = new DropShadow();
			in.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent ex) -> {
			    in.setEffect(shadow);
			});
			//������Ƶ���ť����ȥ��Ӱ����
			in.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent ex) -> {
			    in.setEffect(null);
			});
			in.setPrefSize(500, 50);
			Button sort = new Button("����ְ����ְ���������");
			sort.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent ex) -> {
			    sort.setEffect(shadow);
			});
			//������Ƶ���ť����ȥ��Ӱ����
			sort.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent ex) -> {
			    sort.setEffect(null);
			});
			sort.setPrefSize(500, 50);
			Button change = new Button("���ݹ����޸Ľ�ʦ��Ϣ");
			change.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent ex) -> {
			    change.setEffect(shadow);
			});
			//������Ƶ���ť����ȥ��Ӱ����
			change.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent ex) -> {
			    change.setEffect(null);
			});
			change.setPrefSize(500, 50);
			Button delete = new Button("���ݹ���ɾ����ʦ��Ϣ");
			delete.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent ex) -> {
			    delete.setEffect(shadow);
			});
			//������Ƶ���ť����ȥ��Ӱ����
			delete.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent ex) -> {
			    delete.setEffect(null);
			});
			delete.setPrefSize(500, 50);
			Button search = new Button("�����ž�ȷ��ѯ��ʦ��Ϣ");
			search.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent ex) -> {
			    search.setEffect(shadow);
			});
			//������Ƶ���ť����ȥ��Ӱ����
			search.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent ex) -> {
			    search.setEffect(null);
			});
			search.setPrefSize(500, 50);
			Button look = new Button("����������һ�ְλ��ѯ��ʦ��Ϣ");
			look.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent ex) -> {
			    look.setEffect(shadow);
			});
			//������Ƶ���ť����ȥ��Ӱ����
			look.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent ex) -> {
			    look.setEffect(null);
			});
			look.setPrefSize(500, 50);
			Button tongji = new Button("��ϵ������ְ��ͳ�ƣ������ְ�Ƶ�����");
			tongji.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent ex) -> {
			    tongji.setEffect(shadow);
			});
			//������Ƶ���ť����ȥ��Ӱ����
			tongji.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent ex) -> {
			    tongji.setEffect(null);
			});
			tongji.setPrefSize(500, 50);
			Button exit = new Button("�˳�ϵͳ");
			exit.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent ex) -> {
			    exit.setEffect(shadow);
			});
			//������Ƶ���ť����ȥ��Ӱ����
			exit.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent ex) -> {
			    exit.setEffect(null);
			});
			exit.setPrefSize(500, 50);
			in.setFont(Font.font("�����ֺ��μ���", 20));
			sort.setFont(Font.font("�����ֺ��μ���", 20));
			change.setFont(Font.font("�����ֺ��μ���", 20));
			delete.setFont(Font.font("�����ֺ��μ���", 20));
			search.setFont(Font.font("�����ֺ��μ���", 20));
			look.setFont(Font.font("�����ֺ��μ���", 20));
			exit.setFont(Font.font("�����ֺ��μ���", 20));
			tongji.setFont(Font.font("�����ֺ��μ���", 20));
			in.setOnAction(e -> {
				add();
				Stage stage = (Stage) in.getScene().getWindow();
				stage.close();
			});
			sort.setOnAction(e -> {
				try
				{
					sortJob();
				} catch (Exception e1)
				{
					e1.printStackTrace();
				}
				Stage stage = (Stage) in.getScene().getWindow();
				stage.close();
			});
			change.setOnAction(e -> {
				try
				{
					change();
				} catch (Exception e1)
				{
					e1.printStackTrace();
				}
				Stage stage = (Stage) in.getScene().getWindow();
				stage.close();
			});
			delete.setOnAction(e -> {
				try
				{
					delete();
				} catch (Exception e1)
				{
					e1.printStackTrace();
				}
				Stage stage = (Stage) in.getScene().getWindow();
				stage.close();
			});
			search.setOnAction(e -> {
				search();
				Stage stage = (Stage) in.getScene().getWindow();
				stage.close();
			});
			look.setOnAction(e -> {
				ArrayList<employee> tea6 = new ArrayList<>();
				try
				{
					Read(tea6);
				} catch (Exception e4)
				{
					e4.printStackTrace();
				}
				Stage stage1 = new Stage();
				BorderPane root1 = new BorderPane();
				HBox hbox = new HBox();
				HBox hbox1 = new HBox(16);
				HBox hbox2 = new HBox(16);
				HBox hbox3 = new HBox(16);
				
				VBox vbox1 = new VBox(10);
				
				TextArea a1 = new TextArea();
				TextArea a2 = new TextArea();
				TextArea a3 = new TextArea();
				
				Label l1 = new Label("�������ʦ����:   ");
				l1.setFont(new Font("����",18));
				TextField t1 = new TextField();
				t1.setFont(new Font(15));
				Button b1 = new Button("��ѯ");
				b1.setFont(Font.font(15));
				BackgroundFill backgroundFill_b1 = new BackgroundFill(Paint.valueOf("#8FBC8F"), new CornerRadii(20), Insets.EMPTY);
		        Background background_b1 = new Background(backgroundFill_b1);
		        b1.setBackground(background_b1);
		        
		        Label l11 = new Label("���ݽ�ʦ������ѯ���ڲ���:   ");
				l11.setFont(new Font("����",18));
				ComboBox<String> comboboxbb = new ComboBox<String>();
				comboboxbb.getItems().addAll("����������ϵ","�������ϵ","ʦ��ϵ","�˹��̲�");
				comboboxbb.setEditable(true);
				comboboxbb.setPrefWidth(210);
				comboboxbb.setPrefHeight(32);
				Button b11 = new Button("��ѯ");
				b11.setFont(Font.font(15));
				BackgroundFill backgroundFill_b11 = new BackgroundFill(Paint.valueOf("#8FBC8F"), new CornerRadii(20), Insets.EMPTY);
		        Background background_b11 = new Background(backgroundFill_b11);
		        b11.setBackground(background_b11);
		        
				Label l2 = new Label("�������ʦְλ:   ");
				l2.setFont(new Font("����",18));
				ComboBox<String> combobox0 = new ComboBox<String>();
				combobox0.getItems().addAll("����","������","��ʦ","����");
				combobox0.setEditable(true);
				combobox0.setPrefWidth(210);
				combobox0.setPrefHeight(32);
				Button b2 = new Button("��ѯ");
				b2.setFont(Font.font(15));
				BackgroundFill backgroundFill_b2 = new BackgroundFill(Paint.valueOf("#8FBC8F"), new CornerRadii(20), Insets.EMPTY);
		        Background background_b2 = new Background(backgroundFill_b2);
		        b2.setBackground(background_b2);
		        
		        Label ll2 = new Label("��ѯ�и�ְλ��Ա�Ĳ���:   ");
				ll2.setFont(new Font("����",18));
				ComboBox<String> combobox00 = new ComboBox<String>();
				combobox00.getItems().addAll("����������ϵ","�������ϵ","ʦ��ϵ","�˹��̲�");
				combobox00.setEditable(true);
				combobox00.setPrefWidth(210);
				combobox00.setPrefHeight(32);
				Button b22 = new Button("��ѯ");
				b22.setFont(Font.font(15));
				BackgroundFill backgroundFill_b22 = new BackgroundFill(Paint.valueOf("#8FBC8F"), new CornerRadii(20), Insets.EMPTY);
		        Background background_b22 = new Background(backgroundFill_b22);
		        b22.setBackground(background_b22);
		        
		        Label l3 = new Label("�������ʦ����:   ");
				l3.setFont(new Font("����",18));
				ComboBox<String> combobox1 = new ComboBox<String>();
				combobox1.getItems().addAll("����������ϵ","�������ϵ","ʦ��ϵ","�˹��̲�");
				combobox1.setEditable(true);
				combobox1.setPrefWidth(210);
				combobox1.setPrefHeight(32);
				Button b3 = new Button("��ѯ");
				b3.setFont(Font.font(15));
				BackgroundFill backgroundFill_b3 = new BackgroundFill(Paint.valueOf("#8FBC8F"), new CornerRadii(20), Insets.EMPTY);
		        Background background_b3 = new Background(backgroundFill_b3);
		        b3.setBackground(background_b3);
		        
		        Label ll3 = new Label("��ѯ�ÿ��Ҿ���ְλ��Ա:   ");
				ll3.setFont(new Font("����",18));
				ComboBox<String> combobox11  = new ComboBox<String>();
				combobox11.getItems().addAll("����","������","��ʦ","����");
				combobox11.setEditable(true);
				combobox11.setPrefWidth(210);
				combobox11.setPrefHeight(32);
				Button b33= new Button("��ѯ");
				b33.setFont(Font.font(15));
				BackgroundFill backgroundFill_b33 = new BackgroundFill(Paint.valueOf("#8FBC8F"), new CornerRadii(20), Insets.EMPTY);
		        Background background_b33 = new Background(backgroundFill_b33);
		        b33.setBackground(background_b33);
		        
				Button bt = new Button("����");
				//������Ƶ���ť����ʾ��Ӱ����
				DropShadow shadow8 = new DropShadow();
				bt.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent ex) -> {
				    bt.setEffect(shadow8);
				});
				//������Ƶ���ť����ȥ��Ӱ����
				bt.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent ex) -> {
				    bt.setEffect(null);
				});
				bt.setFont(Font.font(15));
				bt.setOnAction(e22 -> {
					this.start(s);
					Stage stage = (Stage) bt.getScene().getWindow();
					stage.close();
				});
				b1.setOnAction(e1 -> {
					try
					{
						a1.setText(printEmployee(tea6, t1.getText()));
					} catch (Exception e2)
					{
						e2.printStackTrace();
					}
				});
				b11.setOnAction(e2->{
					try {
						a1.setText(printDetailEmployee(printEmployee(tea6,t1.getText()),comboboxbb.getValue()));
					} catch (Exception e3) {
						e3.printStackTrace();
					}
				});
				b2.setOnAction(e2 -> {
					try
					{
						a2.setText(printEmployee(tea6, combobox0.getValue()));	
					} catch (Exception e3)
					{
						e3.printStackTrace();
					}
				});
				b22.setOnAction(e2->{
					try {
						a2.setText(printDetailEmployee(printEmployee(tea6, combobox0.getValue()),combobox00.getValue()));
					} catch (Exception e3) {
						e3.printStackTrace();
					}
				});
				b3.setOnAction(e2 -> {
					try
					{
						a3.setText(printEmployee(tea6, combobox1.getValue()));
					} catch (Exception e3)
					{
						e3.printStackTrace();
					}
				});
				b33.setOnAction(e2->{
					try {
						a3.setText(printDetailEmployee(printEmployee(tea6, combobox1.getValue()),combobox11.getValue()));
					} catch (Exception e3) {
						e3.printStackTrace();
					}
				});
				hbox1.getChildren().addAll(l1, t1, b1,l11,comboboxbb,b11);
				hbox2.getChildren().addAll(l2, combobox0, b2,ll2,combobox00,b22);
				hbox3.getChildren().addAll(l3, combobox1, b3,ll3,combobox11,b33);
				vbox1.getChildren().addAll(hbox1, a1, hbox3, a3,hbox2,a2);
				hbox.getChildren().add(bt);
				hbox.setAlignment(Pos.CENTER);
				root1.setBottom(hbox);
				root1.setCenter(vbox1);
				Scene scene = new Scene(root1, 1000, 800);
				stage1.setScene(scene);
				stage1.setTitle("��ѯ���� ");
				stage1.getIcons().add(new Image("photo/4d51cbda1a415536.jpg"));
				stage1.show();
				Stage stage = (Stage) in.getScene().getWindow();
				stage.close();
			});
			exit.setOnAction(e -> {
			Stage stage = (Stage) exit.getScene().getWindow();
			stage.close();
			});
			tongji.setOnAction(e -> {
				Stage stage2 = new Stage();
				ArrayList<employee> tea7 = new ArrayList<>();
				try
				{
					Read(tea7);
				} catch (Exception e1)
				{
					e1.printStackTrace();
				}
				BorderPane root2 = new BorderPane();
				TextArea textarea = new TextArea();
				HBox h = new HBox(18);
				Label l1 = new Label("��ѡ��Ҫ��ѯ�Ĳ���:   ");
				l1.setFont(new Font("����",18));
				ComboBox<String> combobox0 = new ComboBox<String>();
				combobox0.getItems().addAll("����������ϵ","�������ϵ","ʦ��ϵ","�˹��̲�");
				combobox0.setEditable(true);
				combobox0.setPrefWidth(190);
				combobox0.setPrefHeight(26);
				Button b1 = new Button("��ѯ");
				b1.setFont(Font.font(13));
				BackgroundFill backgroundFill_b1 = new BackgroundFill(Paint.valueOf("#8FBC8F"), new CornerRadii(20), Insets.EMPTY);
		        Background background_b1 = new Background(backgroundFill_b1);
		        b1.setBackground(background_b1);
				h.getChildren().addAll(l1,combobox0,b1);
				VBox v = new VBox();
				v.getChildren().addAll(h,textarea);
				b1.setOnAction(e1->{
					try{
						textarea.setText(jobName_numberOfPeople(tea7,combobox0.getValue()));
					}catch(Exception ex){
						ex.printStackTrace();
					}
				});
				
				Button bt = new Button("����");
				bt.setFont(Font.font(15));
				bt.setOnAction(e2 -> {
					this.start(s);
					Stage stage = (Stage) bt.getScene().getWindow();
					stage.close();
				});
				textarea.setStyle("-fx-font-size:20");
				root2.setCenter(v);
				HBox h1 = new HBox();
				h1.getChildren().add(bt);
				h1.setAlignment(Pos.CENTER);
				root2.setBottom(h1);
				Scene scene = new Scene(root2, 500, 300);
				stage2.setScene(scene);
				stage2.setTitle("��ϵ������ְ��ͳ�ƣ������ְ�Ƶ�����:");
				stage2.getIcons().add(new Image("photo/4d51cbda1a415536.jpg"));
				stage2.show();
				Stage stage = (Stage) in.getScene().getWindow();
				stage.close();
			});
			vbox.getChildren().addAll(in,sort, change, delete, search, look, tongji, exit);
			vbox.setAlignment(Pos.CENTER);
			root.getChildren().add(text);
			root.setCenter(vbox);
			Scene scene = new Scene(root, 500, 560);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("                           ������");
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void add()
	{
		ArrayList<employee> tea1 = new ArrayList<>();
		Stage stage1 = new Stage();
		BorderPane root = new BorderPane();
		
		Button bt = new Button("����");
		bt.setPrefHeight(25);
	    bt.setPrefWidth(50);
	    bt.setFont(Font.font(12));
		BackgroundFill backgroundFill_bt = new BackgroundFill(Paint.valueOf("#00FFFF"), new CornerRadii(20), Insets.EMPTY);
	    Background background_bt = new Background(backgroundFill_bt);
	    bt.setBackground(background_bt);
	    
		Button add = new Button("���");
		add.setPrefHeight(25);
	    add.setPrefWidth(50);
	    add.setFont(Font.font(12));
		BackgroundFill backgroundFill_add = new BackgroundFill(Paint.valueOf("#00FFFF"), new CornerRadii(20), Insets.EMPTY);
	    Background background_add = new Background(backgroundFill_add);
	    add.setBackground(background_add);
	    
		HBox h1 = new HBox();
		TextField t1 = new TextField();
		Label a1 = new Label("��ʦ����:     ");
		a1.setFont(new Font("����",18));
		h1.getChildren().addAll(a1,t1);
		HBox h2 = new HBox();
		ComboBox<String> combobox0 = new ComboBox<String>();
		combobox0.getItems().addAll("��","Ů");
		combobox0.setEditable(true);
		Label a2 = new Label("�Ա�:            ");
		a2.setFont(new Font("����",18));
		h2.getChildren().addAll(a2,combobox0);
		HBox h3 = new HBox();
		TextField t3 = new TextField();
		Label a3 = new Label("���֤��:     ");
		a3.setFont(new Font("����",18));
		h3.getChildren().addAll(a3,t3);
		
		HBox h5 = new HBox(8);
		TextField t5 = new TextField();
		Label a4 = new Label("����:          ");
		a4.setFont(new Font("����",18));
		h5.getChildren().addAll(a4,t5);
		HBox h6 = new HBox(8);
		TextField t6 = new TextField();
		Label a5 = new Label("�绰����:   ");
		a5.setFont(new Font("����",18));
		h6.getChildren().addAll(a5,t6);
		HBox h7 = new HBox(8);
		ComboBox<String> combobox = new ComboBox<String>();
		combobox.getItems().addAll("����������ϵ","�������ϵ","ʦ��ϵ","�˹��̲�");
		combobox.setEditable(true);
		Label a6 = new Label("ϵ��:          ");
		a6.setFont(new Font("����",18));
		h7.getChildren().addAll(a6,combobox);
		HBox h8 = new HBox(8);
		ComboBox<String> comboBox = new ComboBox<String>();
		comboBox.getItems().addAll("����","��ʦ","������","����");
		comboBox.setEditable(true);
		Label a7 = new Label("ְ��:          ") ;
		a7.setFont(new Font("����",18));
		h8.getChildren().addAll(a7,comboBox);
		VBox vbox = new VBox(8);
		vbox.getChildren().addAll(h1,h2,h3,h5,h6,h7,h8);

		bt.setOnAction(e -> {
			this.start(s);
			Stage stage = (Stage) bt.getScene().getWindow();
			stage.close();
		});
		add.setOnAction(e -> {
			try
			{
				read(tea1);
				boolean flag = true;
				boolean flag1 = true;
				boolean flag2 = true;
				boolean flag3 = true;
				for(employee a : tea1){
					if(a.getJobNumber().equals(t5.getText())) flag = false;
					if(a.getID().equals(t3.getText())) flag = false;
					if(t6.getText().length() !=11) flag1 = false;
					if(t3.getText().length() != 18) flag2 = false;
					if(t5.getText().length() !=4) flag3 = false;
				}
				if (flag&&flag1&&flag2&&flag3)
				{
					String[] birth = readBirth(t3.getText()).split("/");
					Date date = new Date(birth[0],birth[1],birth[2]);
		        	employee s = new employee(t1.getText(),combobox0.getValue(),t3.getText(),date,t5.getText(),t6.getText(), combobox.getValue(),comboBox.getValue());
		        	FileWriter writer = new FileWriter(file, true);
		        	writer.write(s.getName() +"  "+s.getSex() + "  "+s.getID() +"  "+s.getBirth().date() +"  "+ s.getJobNumber() + "  " + s.getPhone() + "  " + s.getLocation() + "  " + s.getJobName()+"\n");
		            writer.close();
					Stage stage2 = new Stage();
					BorderPane root1 = new BorderPane();
					VBox vbox1 = new VBox(10);
					Text l = new Text("��ӳɹ�");
					l.setFont(Font.font(20));
					Button b = new Button("ȷ��");
					b.setAlignment(Pos.CENTER);
					b.setOnAction(e2 -> {
						Stage stage4 = (Stage) b.getScene().getWindow();
						stage4.close();
					});
					vbox1.setAlignment(Pos.CENTER);
					vbox1.getChildren().addAll(l, b);
					root1.setCenter(vbox1);
					Scene scene2 = new Scene(root1, 100, 100);
					stage2.setScene(scene2);
					stage2.show();
				} else
				{
					if(!flag){
						Stage stage2 = new Stage();
						BorderPane root1 = new BorderPane();
						VBox vbox1 = new VBox(10);
						Text l = new Text("�ý�ʦ���֤�����ѧ���ظ�");
						l.setFont(Font.font(20));
						Button b = new Button("ȷ��");
						b.setAlignment(Pos.CENTER);
						b.setOnAction(e2 -> {
							Stage stage4 = (Stage) b.getScene().getWindow();
							stage4.close();
						});
						vbox1.setAlignment(Pos.CENTER);
						vbox1.getChildren().addAll(l, b);
						root1.setCenter(vbox1);
						Scene scene1 = new Scene(root1, 400, 100);
						stage2.setScene(scene1);
						stage2.show();
					}
					if(!flag1){
						Stage stage2 = new Stage();
						BorderPane root1 = new BorderPane();
						VBox vbox1 = new VBox(10);
						Text l = new Text("��ȷ�ϵ绰��λ��Ϊ7λ");
						l.setFont(Font.font(20));
						Button b = new Button("ȷ��");
						b.setAlignment(Pos.CENTER);
						b.setOnAction(e2 -> {
							Stage stage4 = (Stage) b.getScene().getWindow();
							stage4.close();
						});
						vbox1.setAlignment(Pos.CENTER);
						vbox1.getChildren().addAll(l, b);
						root1.setCenter(vbox1);
						Scene scene1 = new Scene(root1, 400, 100);
						stage2.setScene(scene1);
						stage2.show();
					}
					if(!flag2){
						Stage stage2 = new Stage();
						BorderPane root1 = new BorderPane();
						VBox vbox1 = new VBox(10);
						Text l = new Text("��ȷ�����֤��λ��Ϊ18λ");
						l.setFont(Font.font(20));
						Button b = new Button("ȷ��");
						b.setAlignment(Pos.CENTER);
						b.setOnAction(e2 -> {
							Stage stage4 = (Stage) b.getScene().getWindow();
							stage4.close();
						});
						vbox1.setAlignment(Pos.CENTER);
						vbox1.getChildren().addAll(l, b);
						root1.setCenter(vbox1);
						Scene scene1 = new Scene(root1, 400, 100);
						stage2.setScene(scene1);
						stage2.show();
					}
					if(!flag3){
						Stage stage2 = new Stage();
						BorderPane root1 = new BorderPane();
						VBox vbox1 = new VBox(10);
						Text l = new Text("��ȷ�Ͻ�ʦ����λ��Ϊ4λ");
						l.setFont(Font.font(20));
						Button b = new Button("ȷ��");
						b.setAlignment(Pos.CENTER);
						b.setOnAction(e2 -> {
							Stage stage4 = (Stage) b.getScene().getWindow();
							stage4.close();
						});
						vbox1.setAlignment(Pos.CENTER);
						vbox1.getChildren().addAll(l, b);
						root1.setCenter(vbox1);
						Scene scene1 = new Scene(root1, 400, 100);
						stage2.setScene(scene1);
						stage2.show();
					}
					
				}
				
				
			} catch (Exception e1)
			{
				Stage stage2 = new Stage();
				BorderPane root1 = new BorderPane();
				VBox vbox1 = new VBox(10);
				Text l = new Text("���ʧ��");
				l.setFont(Font.font(20));
				Button b = new Button("ȷ��");
				b.setAlignment(Pos.CENTER);
				b.setOnAction(e2 -> {
					Stage stage4 = (Stage) b.getScene().getWindow();
					stage4.close();
				});
				vbox1.setAlignment(Pos.CENTER);
				vbox1.getChildren().addAll(l, b);
				root1.setCenter(vbox1);
				Scene scene4 = new Scene(root1, 100, 100);
				stage2.setScene(scene4);
				stage2.show();
			}
		});
		HBox hbox111 = new HBox(50);
		hbox111.getChildren().addAll(add, bt);
		hbox111.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(40, 40, 40, 40));
		root.setCenter(vbox);
		root.setBottom(hbox111);
		Scene scene = new Scene(root, 400, 400);
		stage1.setScene(scene);
		stage1.setTitle("     ��ӽ�ʦ��Ϣ");
		stage1.getIcons().add(new Image("photo/4d51cbda1a415536.jpg"));
		stage1.show();
	}

	public void sortJob() throws IOException
	{
		ArrayList<employee> tea2 = new ArrayList<>();
		try
		{
			Read(tea2);
		} catch (Exception e1)
		{
			e1.printStackTrace();
		}
		Stage stage1 = new Stage();
		BorderPane root = new BorderPane();
		HBox hbox = new HBox();
		Button bt = new Button("����");
		bt.setFont(Font.font(15));
		TextArea a = new TextArea();
		bt.setOnAction(e -> {
			this.start(s);
			Stage stage = (Stage) bt.getScene().getWindow();
			stage.close();
		});
		//�Խ�ʦְλ�����������
		String s1 = new String();
		String s2 = new String();
		String s3 = new String();
		String s4 = new String();
		for(employee b: tea2){
				if(b.getJobName().equals("����")){
					s1+= "��ʦ����:"+ b.getName()+" �Ա�:"+b.getSex()+" ���֤��:"+b.getID()+" ��������:"+b.getBirth().date()+" ����:"+b.getJobNumber()+" �绰����:"+b.getPhone()+" ����:"+b.getLocation()+" ְλ:"+b.getJobName()+"\n";
				}
				
				if(b.getJobName().equals("������")){
					s2+= "��ʦ����:"+ b.getName()+" �Ա�:"+b.getSex()+" ���֤��:"+b.getID()+" ��������:"+b.getBirth().date()+" ����:"+b.getJobNumber()+" �绰����:"+b.getPhone()+" ����:"+b.getLocation()+" ְλ:"+b.getJobName()+"\n";
					
				}
				if(b.getJobName().equals("��ʦ")){
					s3+= "��ʦ����:"+ b.getName()+" �Ա�:"+b.getSex()+" ���֤��:"+b.getID()+" ��������:"+b.getBirth().date()+" ����:"+b.getJobNumber()+" �绰����:"+b.getPhone()+" ����:"+b.getLocation()+" ְλ:"+b.getJobName()+"\n";
				}
			    
				if(b.getJobName().equals("����")){
					s4+= "��ʦ����:"+ b.getName()+" �Ա�:"+b.getSex()+" ���֤��:"+b.getID()+" ��������:"+b.getBirth().date()+" ����:"+b.getJobNumber()+" �绰����:"+b.getPhone()+" ����:"+b.getLocation()+" ְλ:"+b.getJobName()+"\n";
				}
		}	
		String ans = new String();
		ans = s1+s2+s3+s4;
		a.setText(ans);
		a.setStyle("-fx-font-size:20");
		hbox.getChildren().add(bt);
		hbox.setAlignment(Pos.CENTER);
		root.setBottom(hbox);
		root.setCenter(a);
		Scene scene = new Scene(root, 1000, 400);
		stage1.setScene(scene);
		stage1.setTitle("      ���ݽ�ʦְλ���� ");
		stage1.getIcons().add(new Image("photo/4d51cbda1a415536.jpg"));
		stage1.show();
	}

	public void delete() throws IOException
	{
		Stage stage1 = new Stage();
		BorderPane root = new BorderPane();
		VBox v = new VBox(15);
		HBox hbox1 = new HBox(6);
		Label num = new Label("�������ʦ����:");
		num.setFont(new Font("����",19));
		TextField tnum = new TextField();
		tnum.setFont(new Font(15));
		Button del = new Button("ɾ��");
		del.setFont(Font.font(15));
		
		BackgroundFill backgroundFill_del = new BackgroundFill(Paint.valueOf("#8FBC8F"), new CornerRadii(20), Insets.EMPTY);
        Background background_del = new Background(backgroundFill_del);
        del.setBackground(background_del);
        hbox1.getChildren().addAll(num,tnum,del);
        
        HBox hbox2 = new HBox(6);
		Label id = new Label("���������֤��:");
		id.setFont(new Font("����",19));
		TextField tID = new TextField();
		tID.setFont(new Font(15));
		Button del2 = new Button("ɾ��");
		del2.setFont(Font.font(15));
		BackgroundFill backgroundFill_del2 = new BackgroundFill(Paint.valueOf("#8FBC8F"), new CornerRadii(20), Insets.EMPTY);
        Background background_del2 = new Background(backgroundFill_del2);
        del2.setBackground(background_del2);
        hbox2.getChildren().addAll(id,tID,del2);
        v.getChildren().addAll(hbox1,hbox2);
        
		Button bt = new Button("����");
		bt.setFont(Font.font(15));
		HBox hbox = new HBox();
		bt.setOnAction(e -> {
			this.start(s);
			Stage stage = (Stage) bt.getScene().getWindow();
			stage.close();
		});
		del.setOnAction(e -> {
			try
			{
				ArrayList<employee> tea4 = new ArrayList<>();
				Read(tea4);
				//ɾ������˼��
				for(int i = 0 ; i < tea4.size(); i++){
					if(tea4.get(i).getJobNumber().equals(tnum.getText())){
						tea4.remove(i);
						WriteBackToText(tea4);
						Stage stage2 = new Stage();
						BorderPane root1 = new BorderPane();
						VBox vbox1 = new VBox(10);
						Text l = new Text("ɾ���ɹ�");
						l.setFont(Font.font(20));
						Button b = new Button("ȷ��");
						b.setAlignment(Pos.CENTER);
						b.setOnAction(e2 -> {

							Stage stage4 = (Stage) b.getScene().getWindow();
							stage4.close();
						});
						vbox1.setAlignment(Pos.CENTER);
						vbox1.getChildren().addAll(l, b);
						root1.setCenter(vbox1);
						Scene scene = new Scene(root1, 100, 100);
						stage2.setScene(scene);
						stage2.show();
						break;
					}
				}
			} catch (Exception e1)
			{
				Stage stage2 = new Stage();
				BorderPane root1 = new BorderPane();
				VBox vbox1 = new VBox(10);
				Text l = new Text("�ý�ʦ������");
				l.setFont(Font.font(20));
				Button b = new Button("ȷ��");
				b.setAlignment(Pos.CENTER);
				b.setOnAction(e2 -> {
					Stage stage4 = (Stage) b.getScene().getWindow();
					stage4.close();
				});
				vbox1.setAlignment(Pos.CENTER);
				vbox1.getChildren().addAll(l, b);
				root1.setCenter(vbox1);
				Scene scene = new Scene(root1, 100, 100);
				stage2.setScene(scene);
				stage2.show();
			}
		});
		del2.setOnAction(e -> {
			try
			{
				ArrayList<employee> tea4 = new ArrayList<>();
				Read(tea4);
				//ɾ������˼��
				for(int i = 0 ; i < tea4.size(); i++){
					if(tea4.get(i).getID().equals(tID.getText())){
						tea4.remove(i);
						WriteBackToText(tea4);
						Stage stage2 = new Stage();
						BorderPane root1 = new BorderPane();
						VBox vbox1 = new VBox(10);
						Text l = new Text("ɾ���ɹ�");
						l.setFont(Font.font(20));
						Button b = new Button("ȷ��");
						b.setAlignment(Pos.CENTER);
						b.setOnAction(e2 -> {

							Stage stage4 = (Stage) b.getScene().getWindow();
							stage4.close();
						});
						vbox1.setAlignment(Pos.CENTER);
						vbox1.getChildren().addAll(l, b);
						root1.setCenter(vbox1);
						Scene scene = new Scene(root1, 100, 100);
						stage2.setScene(scene);
						stage2.show();
						break;
					}
				}
			} catch (Exception e1)
			{
				Stage stage2 = new Stage();
				BorderPane root1 = new BorderPane();
				VBox vbox1 = new VBox(10);
				Text l = new Text("�ý�ʦ������");
				l.setFont(Font.font(20));
				Button b = new Button("ȷ��");
				b.setAlignment(Pos.CENTER);
				b.setOnAction(e2 -> {
					Stage stage4 = (Stage) b.getScene().getWindow();
					stage4.close();
				});
				vbox1.setAlignment(Pos.CENTER);
				vbox1.getChildren().addAll(l, b);
				root1.setCenter(vbox1);
				Scene scene = new Scene(root1, 100, 100);
				stage2.setScene(scene);
				stage2.show();
			}
		});
		root.setPadding(new Insets(40, 40, 40, 40));
		hbox.getChildren().add(bt);
		hbox.setAlignment(Pos.CENTER);
		root.setBottom(hbox);
		root.setCenter(v);
		Scene scene = new Scene(root, 500, 250);
		stage1.setScene(scene);
		stage1.setTitle("      ���ݹ��Ż����֤����ɾ����ʦ��Ϣ ");
		stage1.getIcons().add(new Image("photo/4d51cbda1a415536.jpg"));
		stage1.show();
	}
//����System.out.print������Ƿ������޸��������ܿ����޸ĳɹ���Ľ��
	public void change() throws Exception
	{
		Stage stage1 = new Stage();
		BorderPane root = new BorderPane();
		HBox hbox = new HBox(4);
		Label num1 = new Label("�������ʦ����:");
		num1.setFont(new Font("����",19));
		TextField tnum1 = new TextField();
		tnum1.setFont(new Font(15));
		Button found = new Button("����");
		found.setFont(Font.font(15));
		hbox.getChildren().addAll(num1, tnum1, found);
		HBox h1 = new HBox(4);
		Label b1 = new Label("��ʦ����:          ");
		b1.setFont(new Font("����",19));
		TextField tname = new TextField();
		tname.setFont(new Font(15));
		Button bt1 = new Button("change");
		bt1.setFont(Font.font(15));
		h1.getChildren().addAll(b1, tname, bt1);
		HBox h2 = new HBox(4);
		Label b2 = new Label("�Ա�:                 ");
		b2.setFont(new Font("����",19));
		TextField tsex = new TextField();
		tsex.setFont(new Font(15));
		Button bt2 = new Button("change");
		bt2.setFont(Font.font(15));
		h2.getChildren().addAll(b2, tsex, bt2);
		HBox h3 = new HBox(4);
		Label b3 = new Label("���֤����:       ");
		b3.setFont(new Font("����",19));
		TextField tid = new TextField();
		tid.setFont(new Font(15));
		Button bt3 = new Button("change");
		bt3.setFont(Font.font(15));
		h3.getChildren().addAll(b3, tid, bt3);
		HBox h4 = new HBox();
		Label b4 = new Label("��������:           ");
		b4.setFont(new Font("����",19));
		TextField ty = new TextField();
		ty.setFont(new Font(15));
		Label b41 = new Label("��");
		b41.setFont(new Font("����",19));
		TextField tm = new TextField();
		tm.setFont(new Font(15));
		Label b42 = new Label("��");
		b42.setFont(new Font("����",19));
		TextField td = new TextField();
		td.setFont(new Font(15));
		Label b43 = new Label("��    ");
		b43.setFont(new Font("����",19));
		ty.setPrefWidth(60);
		tm.setPrefWidth(40);
		td.setPrefWidth(40);
		Button bt4 = new Button("change");
		bt4.setFont(Font.font(15));
		h4.getChildren().addAll(b4, ty, b41, tm, b42, td, b43, bt4);
		
		HBox h6 = new HBox(4);
		Label b6 = new Label("ְλ:                 ");
		b6.setFont(new Font("����",19));
		TextField tJobName = new TextField();
		tJobName.setFont(new Font(15));
		Button bt6 = new Button("change");
		bt6.setFont(Font.font(15));
		h6.getChildren().addAll(b6, tJobName, bt6);
		HBox h7 = new HBox(4);
		Label b7 = new Label("���ڲ���:           ");
		b7.setFont(new Font("����",19));
		TextField tc = new TextField();
		tc.setFont(new Font(15));
		Button bt7 = new Button("change");
		bt7.setFont(Font.font(15));
		h7.getChildren().addAll(b7, tc, bt7);
		HBox h8 = new HBox(4);
		Label b8 = new Label("�ֻ���:              ");
		b8.setFont(new Font("����",19));
		TextField tPhone = new TextField();
		tPhone.setFont(new Font(15));
		Button bt8 = new Button("change");
		bt8.setFont(Font.font(15));
		h8.getChildren().addAll(b8, tPhone, bt8);
		Button bt = new Button("����");
		bt.setFont(Font.font(15));
		BackgroundFill backgroundFill_bt = new BackgroundFill(Paint.valueOf("#00FFFF"), new CornerRadii(20), Insets.EMPTY);
        Background background_bt = new Background(backgroundFill_bt);
        bt.setBackground(background_bt);
		bt.setOnAction(e -> {
			this.start(s);
			Stage stage = (Stage) bt.getScene().getWindow();
			stage.close();
		});
		
		found.setOnAction(e -> {
			ArrayList<employee> tea3 = new ArrayList<>();
			try
			{
				Read(tea3);
			} catch (Exception e1)
			{
				e1.printStackTrace();
			}
			for(int i = 0 ; i< tea3.size();i++){
				if(tea3.get(i).getJobNumber().equals(tnum1.getText())){
					int ans = i;
					bt1.setOnAction(e1->{
						tea3.get(ans).setName(tname.getText());
						Stage stage2 = new Stage();
						BorderPane root1 = new BorderPane();
						VBox vbox1 = new VBox(10);
						Text l = new Text("�޸ĳɹ�");
						l.setFont(Font.font(20));
						Button b = new Button("ȷ��");
						b.setAlignment(Pos.CENTER);
						b.setOnAction(e2 -> {
							Stage stage4 = (Stage) b.getScene().getWindow();
							stage4.close();
						});
						vbox1.setAlignment(Pos.CENTER);
						vbox1.getChildren().addAll(l, b);
						root1.setCenter(vbox1);
						Scene scene = new Scene(root1, 100, 100);
						stage2.setScene(scene);
						stage2.show();
						try
						{
							for(employee aa: tea3){
								System.out.println(aa);
							}
							WriteBackToText(tea3);
						} catch (Exception e2)
						{
							e2.printStackTrace();
						}
					});
					bt2.setOnAction(e1->{
						tea3.get(ans).setSex(tsex.getText());
						Stage stage2 = new Stage();
						BorderPane root1 = new BorderPane();
						VBox vbox1 = new VBox(10);
						Text l = new Text("�޸ĳɹ�");
						l.setFont(Font.font(20));
						Button b = new Button("ȷ��");
						b.setAlignment(Pos.CENTER);
						b.setOnAction(e2 -> {
							Stage stage4 = (Stage) b.getScene().getWindow();
							stage4.close();
						});
						vbox1.setAlignment(Pos.CENTER);
						vbox1.getChildren().addAll(l, b);
						root1.setCenter(vbox1);
						Scene scene = new Scene(root1, 100, 100);
						stage2.setScene(scene);
						stage2.show();
						try
						{
							for(employee aa: tea3){
								System.out.println(aa);
							}
							WriteBackToText(tea3);
						} catch (Exception e2)
						{
							e2.printStackTrace();
						}
					});
					bt3.setOnAction(e1->{
						tea3.get(ans).setID(tid.getText());
						Stage stage2 = new Stage();
						BorderPane root1 = new BorderPane();
						VBox vbox1 = new VBox(10);
						Text l = new Text("�޸ĳɹ�");
						l.setFont(Font.font(20));
						Button b = new Button("ȷ��");
						b.setAlignment(Pos.CENTER);
						b.setOnAction(e2 -> {
							Stage stage4 = (Stage) b.getScene().getWindow();
							stage4.close();
						});
						vbox1.setAlignment(Pos.CENTER);
						vbox1.getChildren().addAll(l, b);
						root1.setCenter(vbox1);
						Scene scene = new Scene(root1, 100, 100);
						stage2.setScene(scene);
						stage2.show();
						try
						{
							for(employee aa: tea3){
								System.out.println(aa);
							}
							WriteBackToText(tea3);
						} catch (Exception e2)
						{
							e2.printStackTrace();
						}
					});
					bt4.setOnAction(e1->{
						tea3.get(ans).birth.setYear(ty.getText());
						tea3.get(ans).birth.setMonth(tm.getText());
						tea3.get(ans).birth.setDay(td.getText());
						Stage stage2 = new Stage();
						BorderPane root1 = new BorderPane();
						VBox vbox1 = new VBox(10);
						Text l = new Text("�޸ĳɹ�");
						l.setFont(Font.font(20));
						Button b = new Button("ȷ��");
						b.setAlignment(Pos.CENTER);
						b.setOnAction(e2 -> {
							Stage stage4 = (Stage) b.getScene().getWindow();
							stage4.close();
						});
						vbox1.setAlignment(Pos.CENTER);
						vbox1.getChildren().addAll(l, b);
						root1.setCenter(vbox1);
						Scene scene = new Scene(root1, 100, 100);
						stage2.setScene(scene);
						stage2.show();
						try
						{
							for(employee aa: tea3){
								System.out.println(aa);
							}
							WriteBackToText(tea3);
						} catch (Exception e2)
						{
							e2.printStackTrace();
						}
					});
					
					bt6.setOnAction(e1->{
						tea3.get(ans).setJobName(tJobName.getText());
						Stage stage2 = new Stage();
						BorderPane root1 = new BorderPane();
						VBox vbox1 = new VBox(10);
						Text l = new Text("�޸ĳɹ�");
						l.setFont(Font.font(20));
						Button b = new Button("ȷ��");
						b.setAlignment(Pos.CENTER);
						b.setOnAction(e2 -> {
							Stage stage4 = (Stage) b.getScene().getWindow();
							stage4.close();
						});
						vbox1.setAlignment(Pos.CENTER);
						vbox1.getChildren().addAll(l, b);
						root1.setCenter(vbox1);
						Scene scene = new Scene(root1, 100, 100);
						stage2.setScene(scene);
						stage2.show();
						try
						{
							for(employee aa: tea3){
								System.out.println(aa);
							}
							WriteBackToText(tea3);
						} catch (Exception e2)
						{
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
					});
					bt7.setOnAction(e1->{
						tea3.get(ans).setLocation(tc.getText());
						Stage stage2 = new Stage();
						BorderPane root1 = new BorderPane();
						VBox vbox1 = new VBox(10);
						Text l = new Text("�޸ĳɹ�");
						l.setFont(Font.font(20));
						Button b = new Button("ȷ��");
						b.setAlignment(Pos.CENTER);
						b.setOnAction(e2 -> {
							Stage stage4 = (Stage) b.getScene().getWindow();
							stage4.close();
						});
						vbox1.setAlignment(Pos.CENTER);
						vbox1.getChildren().addAll(l, b);
						root1.setCenter(vbox1);
						Scene scene = new Scene(root1, 100, 100);
						stage2.setScene(scene);
						stage2.show();
						try
						{
							for(employee aa: tea3){
								System.out.println(aa);
							}
							WriteBackToText(tea3);
						} catch (Exception e2)
						{
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
					});
					bt8.setOnAction(e1->{
						tea3.get(ans).setPhone(tPhone.getText());
						Stage stage2 = new Stage();
						BorderPane root1 = new BorderPane();
						VBox vbox1 = new VBox(10);
						Text l = new Text("�޸ĳɹ�");
						l.setFont(Font.font(20));
						Button b = new Button("ȷ��");
						b.setAlignment(Pos.CENTER);
						b.setOnAction(e2 -> {
							Stage stage4 = (Stage) b.getScene().getWindow();
							stage4.close();
						});
						vbox1.setAlignment(Pos.CENTER);
						vbox1.getChildren().addAll(l, b);
						root1.setCenter(vbox1);
						Scene scene = new Scene(root1, 100, 100);
						stage2.setScene(scene);
						stage2.show();
						try
						{
							for(employee aa: tea3){
								System.out.println(aa);
							}
							WriteBackToText(tea3);
						} catch (Exception e2)
						{
							e2.printStackTrace();
						}
					});
				}
			}
			VBox vbox = new VBox(14);
			vbox.getChildren().addAll(h1, h2, h3, h4, h6, h7,h8);
			root.setCenter(vbox);
		});
		HBox hbox2 = new HBox(4);
		hbox2.getChildren().add(bt);
		hbox2.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(40, 40, 40, 40));
		root.setTop(hbox);
		root.setBottom(hbox2);
		Scene scene = new Scene(root, 550, 500);
		stage1.setScene(scene);
		stage1.setTitle("      ���ݹ����޸Ľ�ʦ��Ϣ ");
		stage1.getIcons().add(new Image("photo/4d51cbda1a415536.jpg"));
		stage1.show();
		ArrayList<employee> tea4 = new ArrayList<>();
		Read(tea4);
	}
//
	public void search()
	{
		Stage stage1 = new Stage();
		BorderPane root = new BorderPane();
		HBox hbox = new HBox();
		HBox hbox1 = new HBox(21);
		HBox hbox2 = new HBox();
		VBox vbox = new VBox();
		TextArea a1 = new TextArea();
		Label l1 = new Label("��ʦ����:    ");
		l1.setFont(new Font("����",18));
		TextField t1 = new TextField();
		t1.setFont(new Font(15));
		Button b1 = new Button("��ѯ");
		b1.setFont(Font.font(15));
		BackgroundFill backgroundFill_b1 = new BackgroundFill(Paint.valueOf("#8FBC8F"), new CornerRadii(20), Insets.EMPTY);
        Background background_b1 = new Background(backgroundFill_b1);
        b1.setBackground(background_b1);
		hbox1.getChildren().addAll(l1, t1, b1);
		vbox.getChildren().addAll(hbox1, a1, hbox2);
		Button bt = new Button("����");
		bt.setFont(Font.font(15));
		bt.setOnAction(e -> {
			this.start(s);
			Stage stage = (Stage) bt.getScene().getWindow();
			stage.close();
		});
		b1.setOnAction(e -> {
			ArrayList<employee> tea7 = new ArrayList<>();
			try
			{
				Read(tea7);
				a1.setText(printEmployee(tea7, t1.getText()));
			} catch (Exception e1)
			{
				System.out.print("");
			}
		});
		hbox.getChildren().add(bt);
		hbox.setAlignment(Pos.CENTER);
		root.setBottom(hbox);
		root.setCenter(vbox);
		Scene scene = new Scene(root, 500, 300);
		stage1.setScene(scene);
		stage1.setTitle("       �����ž�ȷ��ѯ��ʦ��Ϣ ");
		stage1.getIcons().add(new Image("photo/4d51cbda1a415536.jpg"));
		stage1.show();
		ArrayList<employee> tea7 = new ArrayList<>();
		try
		{
			Read(tea7);
		} catch (IOException e1)
		{
			e1.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		launch(args);
	}
	public static employee transformToEmployee(String s)
	{
		employee stu;
		String[] str = s.split("  ");
			String[] str1 = str[3].split("/");
			Date date = new Date(str1[0],str1[1],str1[2]);
			stu = new employee(str[0], str[1], str[2], date, str[4],str[5],str[6], str[7]);
			return stu;
	}
	public static String readBirth(String s){
		String year = s.substring(6,10);
		String month = s.substring(10,12);
		String day = s.substring(12,14);
		return year+"/"+month+"/"+day;
	}
	
	//��������Array List�е���Ϣд���ļ���ȥ�����Ҹ���ԭ������Ϣ
    public static void WriteBackToText(ArrayList<employee> tea3) throws IOException{
    	BufferedWriter out = new BufferedWriter(new FileWriter("teacher.txt"));
    	String str = new String();
    	for(employee tea:tea3)
    		str+= tea.getName()+"  "+tea.getSex()+"  "+tea.getID()+"  "+tea.getBirth().date()+"  "+tea.getJobNumber()+"  "+tea.getPhone()+"  "+tea.getLocation()+"  "+tea.getJobName()+"\n";	
    	out.write(str);
    	out.close();
	}
    
    //���ļ����е���Ϣ����ArrayList�У��������ļ����Ƿ�����Ϣ���쳣�׳�
	public static void Read(ArrayList<employee> tea2) throws IOException
	{
		try
		{
			InputStream is = new FileInputStream("teacher.txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			employee stu = new employee();
			String line = reader.readLine();
			if (line == null)
			{
				Stage stage2 = new Stage();
				BorderPane root1 = new BorderPane();
				VBox vbox1 = new VBox(10);
				Text l = new Text("���޽�ʦ��Ϣ�����������Ϣ");
				l.setFont(Font.font(20));
				Button b = new Button("ȷ��");
				b.setAlignment(Pos.CENTER);
				b.setOnAction(e2 -> {
					Stage stage4 = (Stage) b.getScene().getWindow();
					stage4.close();
				});
				vbox1.setAlignment(Pos.CENTER);
				vbox1.getChildren().addAll(l, b);
				root1.setCenter(vbox1);
				Scene scene = new Scene(root1, 400, 100);
				stage2.setScene(scene);
				stage2.show();
			}
			while (line != null)
			{
				stu = transformToEmployee(line);
				tea2.add(stu);
				
				line = reader.readLine();
			}
			reader.close();
			is.close();
		} catch (Exception e)
		{
			Stage stage2 = new Stage();
			BorderPane root1 = new BorderPane();
			VBox vbox1 = new VBox(10);
			Text l = new Text("���޽�ʦ��Ϣ�����������Ϣ");
			l.setFont(Font.font(20));
			Button b = new Button("ȷ��");
			b.setAlignment(Pos.CENTER);
			b.setOnAction(e2 -> {
				Stage stage4 = (Stage) b.getScene().getWindow();
				stage4.close();
			});
			vbox1.setAlignment(Pos.CENTER);
			vbox1.getChildren().addAll(l, b);
			root1.setCenter(vbox1);
			Scene scene = new Scene(root1, 400, 100);
			stage2.setScene(scene);
			stage2.show();
		}
	}
	
	//���������ļ��е���Ϣ��ȡ��ArrayList��
	public static void read(ArrayList<employee> tea1) throws IOException
	{
		try
		{
			InputStream is = new FileInputStream("teacher.txt");
			String line;
			employee stu = new employee();
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			line = reader.readLine();
			if (line == null)
			{
				System.out.print("");
			}
			while (line != null && line.length() >= 2)
			{
				stu = transformToEmployee(line);
				tea1.add(stu);
				line = reader.readLine();
			}
			reader.close();
			is.close();
		} catch (Exception e)
		{
			e.printStackTrace();;
		}
	}
	public static String printEmployee(ArrayList<employee> tea6, String str) throws IOException
	{
		String ss= new String();
		for(employee b:tea6){
			if(b.getName().equals(str)){
				ss += "��ʦ������"+b.getName()+" �Ա�"+b.getSex()+" ���֤�ţ�"+b.getID()+" �������ڣ�"+b.getBirth().date()+" ���ţ�"+b.getJobNumber()+" �绰��"+b.getPhone()+" ���ڲ��ţ�"+b.getLocation()+" ְ�ƣ�"+b.getJobName()+"\n";
			}
			if(b.getJobName().equals(str)){
				ss+= "��ʦ������"+b.getName()+" �Ա�"+b.getSex()+" ���֤�ţ�"+b.getID()+" �������ڣ�"+b.getBirth().date()+" ���ţ�"+b.getJobNumber()+" �绰��"+b.getPhone()+" ���ڲ��ţ�"+b.getLocation()+" ְ�ƣ�"+b.getJobName()+"\n";
			}
			if(b.getLocation().equals(str)){
				ss+= "��ʦ������"+b.getName()+" �Ա�"+b.getSex()+" ���֤�ţ�"+b.getID()+" �������ڣ�"+b.getBirth().date()+" ���ţ�"+b.getJobNumber()+" �绰��"+b.getPhone()+" ���ڲ��ţ�"+b.getLocation()+" ְ�ƣ�"+b.getJobName()+"\n";
			}
			if(b.getJobNumber().equals(str)){
				ss+= "��ʦ������"+b.getName()+" �Ա�"+b.getSex()+" ���֤�ţ�"+b.getID()+" �������ڣ�"+b.getBirth().date()+" ���ţ�"+b.getJobNumber()+" �绰��"+b.getPhone()+" ���ڲ��ţ�"+b.getLocation()+" ְ�ƣ�"+b.getJobName()+"\n";
			}
		}
		return ss;
	}
	//����һ����ť�󶨣��൱�ڵ����һ����ť��֮���ڽ��и��Ӿ������Ϣ��ѯ
	public static String printDetailEmployee(String allText,String detail){
		String tea = new String();
		String[] str = allText.split("\n");
		int count = -1;
		for(int i = 0; i < str.length; i++){
			if(str[i].contains(detail)){
				count = i;
				tea += (str[count]+"\n");
			}
			count = -1;
		}
		
		return tea;
	}

	public static String jobName_numberOfPeople(ArrayList<employee> tea,String ss) throws IOException
	{
		String s = new String();
		int count,count1=0,count2=0,count3=0,count4=0;
		for(int i = 0; i <tea.size(); i++){
			if(tea.get(i).getLocation().equals(ss)){
				count = i;
				if(tea.get(count).getJobName().equals("����"))
					count1++;
				if(tea.get(count).getJobName().equals("������"))
					count2++;
				if(tea.get(count).getJobName().equals("��ʦ"))
					count3++;
				if(tea.get(count).getJobName().equals("����"))
					count4++;
			}
		}
		s = "��"+ss+"�и�ְ������Ϊ:\n"+"���ڣ�"+count1+"λ"+"\n"+"�����ڣ�"+count2+"λ"+"\n"+"��ʦ��"+count3+"λ"+"\n"+"���̣�"+count4+"λ"+"\n";
		return s;
	}

}
