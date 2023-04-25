package oop2;

import java.util.Random;

//クラス宣言
public class Dice {
    //フィールド（必要に応じて適宜追加）
    public int lastRoll = 0; //最後に振った目を保持する変数
    //コンストラクタなし

    //サイコロを振るメソッド
    public int cast() {
        //1から6のランダムな値を返す
       lastRoll = (int) (Math.random() * 6) + 1; // 乱数を生成して、1から6の値に変換する
        return lastRoll; // 振った目を返す
        }

    //出目を確認するメソッド
    public int see(){
        if(lastRoll == 0) { // 一度も「振った」ことのないとき
            return 1; // 1を返す
        }else {
            return lastRoll; // 最後に振った目を返す
        }
    }
}

