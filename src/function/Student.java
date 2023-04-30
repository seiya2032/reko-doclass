package function;

// クラスを作成
public class Student {
    // フィールドを作成
    private final String name;
    private final int score;

    // コンストラクタを作成
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // メソッドを作成
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
