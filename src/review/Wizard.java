package review;

//クラス定義、継承　サブクラス/子クラス
public class Wizard extends Character {
    //フィールド
    private int mp;
    //コンストラクタ
    public Wizard(String name, int hp, int mp) {
        super(name, hp);
        this.mp = mp;
    }

    //メソッド
    public String magic() {
        return ("魔法");
    }

    @Override
    public String getStatus(){
        return super.getStatus()+ ", mp" + mp;
    }
}
