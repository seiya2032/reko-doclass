package review;

//クラス定義、スパークラス/親クラス
public class Character {
    //フィールド
    private String name;
    private int hp;

    //コンストラクタ
    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    //メソッド
    public String getStatus() {
        return "name:" + name + ", hp:" + hp;
    }

    public String attack() {
        return ("パンチ");
    }
}
