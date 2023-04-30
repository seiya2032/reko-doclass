package junit;

public class UtilTest {
    public static void main(String[] args) {
        //　フィールドなし
        //　コンストラクタなし
    }
    //　メソッド

    // 引数に受け取った値がintの範囲の数値であればtrueを返却する
    // intの範囲の数値でなければfalseを返却する
    public boolean isNumber(String num) {
        // 引数がnullである場合、falseを返却する
        if(num == null || num.isEmpty()) {
            return false;
        }
        try {
            // 引数をint型に変換できるかどうかを確認する
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e) {
            // 引数がint型に変換出来ない場合、falseを返却する
            return false;
        }
    }

    // 引数に受け取った文字列が郵便番号の形式であるかを判定する
    // 判定した結果、郵便番号の形式であればtrue,郵便番号に形式でなければfalseを返却する
    public static boolean isPostalCode(String str) {
        if (str == null) {
            return false;
        }
        // 引数が7桁の数値または3桁-4桁の数値にいずれかであるかどうかを判定する
        return str.matches("^\\d{7}$|^\\d{3}-\\d{4}$");
    };

    // 引数が受け取った文字列が小文字のアルファベットのみで構成されているかどうかを判定する
    // 小文字のアルファベット以外の文字が含まれていない場合true、小文字のアルファベット以外の文字が含まれている場合はfalseを返却する
    // また、null、または、空文字の場合はfalseを返却する
    public static boolean isSmallAlphaber(String str) {
        // 引数が小文字のアルファベットのみで構成されているかどうかを判定する
        return str.matches("^[a-z]+$");
    }

    // 引数に受け取った3つの数値を3辺として三角形が作成できる
    public static boolean isTriangle(int a, int b, int c) {
        // a,b,cのうち、それかが0以下の場合、三角形を作成できないためfalseを返す
        if(a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        // ヘロンの公式を用いて、a,b,cの辺の長さから三角形が作成可能かどうか判定する
        // 三角形が作成可能な場合、trueを返す。三角形が作成不可能な場合、falseを返す。
        return (long)a + b > c && (long)a + c > b && (long)b + c > a;
    }

    public static int isSquareNumber(int num) {
        // 引数が0未満または100000を超える場合は、-1を返す
        if(num < 0 || num > 100000) {
            return -1;
        }
        // 引数の平方根を求める
        int sqrt = (int)Math.sqrt(num);
        // 引数が何かしらの整数を2乗した数値である場合、その整数を返却する
        // 引数が何かしらの整数を2乗した数値でない場合、-1を返却する
        return sqrt * sqrt == num ? sqrt : -1;
    }
}
