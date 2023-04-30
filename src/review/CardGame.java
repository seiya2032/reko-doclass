package review;

//サブクラス1
public class CardGame extends Game{
    @Override
    public String description() {
        return "最後にジョーカーが残った人が負けです";
    }

    @Override
    public String start() {
        System.out.println("ババ抜きスタート");
        return null;
    }
}
