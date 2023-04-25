package oop2;

//クラス定義
public class DiceTest {
    //フィールドなし
    //コンストラクタなし

    //メソッド
    public static void main(String[] args){
        //Diceクラスのインスタンスを生成
        var dice = new Dice();
        //castメソッドとseeメソッドの動作を確認する
        //上記を30回実施
        for(int i = 0;i < 30; i++){
            int roll = dice.cast(); //サイコロを振る
            int see = dice.see();   //出目を確認
            //出目を表示
            System.out.println(see);
        }
    }
}
