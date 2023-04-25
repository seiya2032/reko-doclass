package oop;

public class Account {
    //フィールド
    String name;
    String tel;
    String email;
    String address;

    //コンストラクタ
    public Account(String name, String tel, String email, String address){
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.address = address;
    }

    //メソッド
    public String getAccountInfo() {
        return "名前： " + name + "\n" +"電話番号： " + tel + "\n" + "Eメール： " + email + "\n" + "アドレス： " + address;
    }
}
