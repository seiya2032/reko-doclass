package review;

//コレクションに関するクラスは「Java.util」のパッケージに入っている
import java.util.ArrayList;

import java.util.List;

public class CollectionsFramework {
    public static void main(String[] args){
    // Listはインターフェース。
    // Listを実装したクラスでよく使用されるものにArrayListがある
    // <>の部分をジェネリクスと呼ぶ
        List<String> list = new ArrayList<>();

        //要素を追加するにはaddメソッドを使用します。
        list.add("A");
        list.add("B");
        list.add("C");

        // 要素数を調べるには、sizeメソッドを使用します。
        // 要素を取り出すにはgetメソッドを使用します
        // 引数で格納された番号を渡します
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //要素の上書き
        list.set(0,"AA");

        //要素の取得
        list.get(0);

        //要素の消除
        list.remove(0);

        //list.size()は要素数の取得
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
