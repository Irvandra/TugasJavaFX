/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplicationtest;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author didik
 */
public class JavaFXApplicationTest extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Rectangle rect = new Rectangle(0,0,700,30);
        rect.setFill(Color.GREY);
        Label label = new Label("Register");
        Label label1 = new Label("First Name ");
        TextField tf1 = new TextField();
        Label label2 = new Label("Last Name ");
        TextField tf2 = new TextField();
        Label label3 = new Label("E-mail Address ");
        TextField tf3 = new TextField();
        Label label4 = new Label("Contact No ");
        TextField tf4 = new TextField();
        Label label5 = new Label("Password ");
        TextField tf5 = new TextField();
        Label label6 = new Label("Confirm Password ");
        TextField tf6 = new TextField();
        Button btn = new Button();
        btn.setText("Register");
        btn.setTextFill(Color.WHITE);
        btn.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE,null,null)));
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Register berhasil");
            }
        });
        
        Group root = new Group();
        HBox panel1 = new HBox();
        HBox panel2 = new HBox();
        HBox panel3 = new HBox();
        HBox panel4 = new HBox();
        HBox panel5 = new HBox();
        HBox panel6 = new HBox();
        
        panel1.getChildren().addAll(label1,tf1);
        panel2.getChildren().addAll(label2,tf2);
        panel3.getChildren().addAll(label3,tf3);
        panel4.getChildren().addAll(label4,tf4);
        panel5.getChildren().addAll(label5,tf5);
        panel6.getChildren().addAll(label6,tf6);
        
        label.setTextFill(Color.WHITE);
        label.setLayoutX(10);
        label.setLayoutY(5);
        
        panel1.setLayoutX(150);
        panel1.setLayoutY(40);
        
        panel2.setLayoutX(150);
        panel2.setLayoutY(80);
        
        panel3.setLayoutX(127);
        panel3.setLayoutY(120);
        
        panel4.setLayoutX(146);
        panel4.setLayoutY(160);
        
        panel5.setLayoutX(156);
        panel5.setLayoutY(200);
        
        panel6.setLayoutX(111);
        panel6.setLayoutY(240);
        
        btn.setLayoutX(225);
        btn.setLayoutY(280);
        
        root.getChildren().addAll(rect,label,panel1,panel2,panel3,panel4,panel5,panel6,btn);
        
        Scene scene = new Scene(root, 500, 325);
        
        primaryStage.setTitle("Register");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
