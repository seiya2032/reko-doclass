package review;

//サブクラス2
public class DartsGame extends Game {
    @Override
    public String description() {
        return "ダーツで得点が高い方が勝ちです";
    }

    @Override
    public String start() {
        System.out.println("ダーツスタート");
        return null;
    }
    String playGame(Game game) {
        return game.description() + game.start();

    }
}


