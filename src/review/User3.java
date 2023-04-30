package review;

import exception.IlligalScoreException;

//クラス宣言
public class User3 {
    //フィールド(変数を定義するとフィールドとして扱われる)
     String name; //　名前
     int age;      // 年齢

    //コンストラクタ
    public User3(String name, int age){
        //フィールドに引数で受け取った値を代入
        this.name = name;
        this.age = age;
//        this.setAge(age);
    }

    //メソッド
//    public int setAge() {
//        return this.age;
//    }

//    public void setAge(int age) {
//        if(age >= 0 && age <= 120) {
//            this.age = age;
//        }else {
//            throw new IllegalArgumentException("年齢が不適です");
//        }
//    }
    public String greet() {
        return ("Hello! My name is " + this.name);
    }
}
