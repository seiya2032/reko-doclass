package oop2;

public class CheatDiceTest {

    public static void main(String[] args){
        //CheatDiceクラスのインスタンスを作成
        var cheatDice = new CheatDice();
        //30繰り返す
        for(int i = 1; i <= 30; i++){
            //CheatDiceクラスのサイコロを振り。出目を習得する
            int result = cheatDice.cast();
            //出目を表示する
            System.out.println("出目 : " + result);
            //最後に振った目を表示する
            System.out.println("最後に振った目 : " + cheatDice.see());
        }
    }
}
