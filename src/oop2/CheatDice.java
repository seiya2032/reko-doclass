package oop2;

//継承、クラス定義
public class CheatDice extends Dice{
    //フィールド
    public int count; // CheatDiceクラスでサイコロ振った回数を保持する変数
    public  CheatDice(){
        super(); //親クラスのコンストラクタを呼び出している
        count = 0; // 出目のカウントを初期化する
    }
    //サイコロを振るメソッドcastをオーバーライドする
    @Override
    public int cast() {
        //出目のカウントをリメイクする
        count++;
        //6の倍数回目には必ず6が出る
        if (count % 6 == 0) {
            return 6;
        } else { // それ以外の場合は１から5のランダムな値を返す
            return super.cast();
        }
    }
}
