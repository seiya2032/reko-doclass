package function;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.function.BiFunction;

public class FunctionObjectPractice {
    public static void main(String[] args){
//        // 奇数を判断するPredicateオブジェクトを作成
//        Predicate<Integer> isOdd = n -> n % 2 != 0;
//
//        // 偶数を判定するPredicateオフジェクトを作成
//        Predicate<Integer> isEven = n -> n % 2 == 0;
//
//        // テスト
//        int n = 4;
//        if (isOdd.test(n)) {
//            System.out.println(n + "は偶数です。");
//        } else {
//            System.out.println(n + "は奇数です。");
//        }

//        // Functionインターフェースを実装した関数オブジェクトを作成する
//        Function<String, String> reverse = str -> {
//            var sb = new StringBuilder(str); // 引数の文字をStringBuilderに変換
//            return sb.reverse().toString(); // StringBuilderのメソッドを使って反転し、String型に変換して返す
//        };
//
//        // 関数オブジェクトを使用して文字列を反転させる
//        String original = "Hello, world!";
//        String reversed = reverse.apply(original);
//        System.out.println("元の文字列； " + original);
//        System.out.println("反転した文字列； " + reversed);

//     // 区切り文字を","に設定したStringSplitterオブジェクトを作成
//     var splitter = new StringSplitter(",");
//     // applyメソッドで文字列を区切って配列にして返す
//     String[] result = splitter.apply("apple,banana,orange");
//     // 結果を表示
//     System.out.println(Arrays.toString(result)); // 出力: [apple, banana, orange]
//    }
//}
//
//// applyメソッドを定義したクラス
//class StringSplitter {
//    // 区切り文字を保持するインスタンス変数
//    private final String delimiter;
//
//    // コンストラクタで区切り文字を受け取り、インスタンス変数に設定する
//    public StringSplitter(String delimiter) {
//        this.delimiter = delimiter;
//    }
//
//    // 文字列を区切って配列にして返すメソッド
//    public String[] apply(String str) {
//        return str.split(delimiter);

//        // 与えられた整数値を２倍にするUnaryOperatorオブジェクトを作成
//        UnaryOperator<Integer> doubler = new Doubler();
//        // 5を3回2倍する
//        int result = doubler.apply(doubler.apply(doubler.apply(5)));
//        // 出力
//        System.out.println(result);
//    }
//}
//
//// UnaryOperator<Integer>を実装するクラス
//class Doubler implements UnaryOperator<Integer> {
//    // applyメソッドで受け取った整数値を2倍して返す
//    public Integer apply(Integer i) {
//        return i * 2;

//        // "hello"を3回連結する Concatenatorオブジェクトを作成
//        BiFunction<String, Integer, String> concatenator = new Concatenator();
//        String result = concatenator.apply("hello", 3);
//        // 出力
//        System.out.println(result);
//    }
//}
//
//// BiFunction<String, Integer, String>を実装したクラス
//class Concatenator implements BiFunction<String, Integer, String> {
//    // applyメソッドで受け取った文字列を指定された数だけ繰り返し連結して返す
//    public String apply(String str, Integer count) {
//        var sb = new StringBuilder();
//        for (int i = 0; i < count; i++) {
//            sb.append(str);
//        }
//        return sb.toString();


    }
}