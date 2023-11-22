//package com.jzy.test;
//
//import javafx.animation.Animation;
//import javafx.animation.KeyFrame;
//import javafx.animation.Timeline;
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Button;
//import javafx.scene.layout.VBox;
//import javafx.scene.text.Font;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//import javafx.util.Duration;
//
//import java.util.Random;
//
//public class LotteryProgram extends Application {
//
//    private static final String[] SUPERHEROES = {
//            "美国队长", "钢铁侠", "绿巨人", "蜘蛛侠", "黑寡妇",
//            "鹰眼", "蝙蝠侠", "金刚狼", "泰迦奥特曼", "假面骑士zero one"
//    };
//
//    private Button startButton;
//    private Text resultText;
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        startButton = new Button("开始抽奖");
//        startButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                startLottery();
//            }
//        });
//
//        resultText = new Text("");
//        resultText.setFont(new Font(24));
//        resultText.setVisible(false);
//
//        VBox root = new VBox(10, startButton, resultText);
//        root.setAlignment(Pos.CENTER);
//
//        Scene scene = new Scene(root, 300, 200);
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("抽奖程序");
//        primaryStage.show();
//    }
//
//    private void startLottery() {
//        startButton.setDisable(true); // 禁用开始按钮
//
//        Random random = new Random();
//        int duration = random.nextInt(5) + 5; // 随机生成滚动时间（5-9秒）
//
//        // 创建一个时间轴来实现滚动效果
//        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0.1), new EventHandler<ActionEvent>() {
//            int count = 0;
//
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                resultText.setText(SUPERHEROES[count % SUPERHEROES.length]); // 显示当前的超级英雄名字
//                count++;
//            }
//        }));
//        timeline.setCycleCount(Animation.INDEFINITE);
//        timeline.play();
//
//        // 等待指定的时间后停止时间轴，显示中奖者信息
//        Timeline stopTimeline = new Timeline(new KeyFrame(Duration.seconds(duration), new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                timeline.stop();
//                startButton.setDisable(false); // 启用开始按钮
//
//                int winnerIndex = random.nextInt(SUPERHEROES.length);
//                String winner = SUPERHEROES[winnerIndex];
//                Alert alert = new Alert(Alert.AlertType.INFORMATION);
//                alert.setTitle("恭喜！");
//                alert.setHeaderText(null);
//                alert.setContentText("中奖者是：" + winner);
//                alert.showAndWait();
//            }
//        }));
//        stopTimeline.play();
//    }
//}
