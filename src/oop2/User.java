package oop2;

import java.util.Objects;

//クラス作成
public class User {
    //フィールド作成
    private String name;
    private String birthplace;
    private String birthday;

    //コンストラクタ
    public User(String name, String birthplace, String birthday) {
        this.name = name;
        this.birthplace = birthplace;
        this.birtday = birthday;
    }

    //メソッド作成
    public String getName() {
        return name;
    }

    public String getBirthplace() {
            return birthplace;
        }

     public String getBirthday() {
        return birthday;
     }

     //オーバーライド
    @Override
    //
    public boolean equals(Object obj) {
        if(this == obj)
            return true; // 参照が同じ場合
        if(obj == null || getClass() != obj.getClass())
            return false;//クラスが異なる場合

        User user =(User) obj; //キャスト

        if(!Objects.equals(name,user,name))
            return false; //名前が異なる場合
        if(!Objects.equals(birthplace,user.birthplace))
            return false; //　出身地が異なる場合
        return Objects.equals(birthday, user.birthday);//生年月日が異なる場合
    }

    //オーバーライド
    @Override
    public String toString() {
        return "名前：" + name + ", 出身地；" + birthplace + ",　生年月日；" + birthday;
    }
}
