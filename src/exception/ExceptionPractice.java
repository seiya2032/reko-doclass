package exception;

import java.util.Scanner;
import java.util.jar.JarException;

public  class ExceptionPractice {
    //judgeScoreメソッドを作成、
    public static String judgeScore(int score) {
        if (score < 0 || score > 100) {
//scoreの値が負の値、または100より大きい場合はIlligalScoreExceptionの例外を投げる
            throw new IlligalScoreException("スコアが不正です");
        } else if (score >= 80) {
            return "A";
        } else if (score >= 70) {
            return "B";
        } else if (score >= 60) {
            return "C";
        } else {
            return "D";
        }
    }
        public static void main(String[] args){
            var scanner = new Scanner(System.in);
            while (true){
                System.out.println("スコアを入力してください"); //１.入力値を1つ受け取る
                String input = scanner.next();
                int score;

                try {
                    //2.受け取った値を数値に変換する
                    score = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    //数値に変換できない場合はエラーメッセージを出力して、ループの最初に戻る
                    System.out.println("数値を入力してください");
                    continue;
                }
                try {
                    //スコアを評価する
                    String result = judgeScore(score);
                    System.out.println("評価：" + result);
                } catch (IlligalScoreException e){
                    //不正なスコアの場合はエラーメッセージを出力して、ループの最初に戻る
                    System.out.println(e.getMessage());
                    continue;
                }
                //正常に評価が終了した場合、ループを抜けてプログラムを終了する
                break;
                }
                scanner.close();

                }
            }

