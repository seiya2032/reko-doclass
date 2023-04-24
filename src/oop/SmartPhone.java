package oop;

public class SmartPhone {
    //フィールド
    String model; // スマホの機種名
    String os; //OSの種類
    Account account; //自分のアカウント情報
    AddressBook[] addressBooks; //アドレス帳
    String apps; //インストールされたアプリ

    //コンストラクタ
    public SmartPhone(String model, String os){
        this.model = model;
        this.os = os;
    }
    //メソッド
    public  void setAccount(Account account) {
        this.account = account;
    }
    public void displayDeviceInfo(){
        System.out.println(model);
        System.out.println(os);
    }
    public void displayMyAccount(){
        System.out.println(account);
    }
    public boolean addAddressBook(AddressBook){
        int[] scores = {};
        return false;
    }
    public void displayAppList(){
        System.out.println(apps);
    }
}
