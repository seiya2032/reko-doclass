package oop;

public class SmartPhone {
    //フィールド
    String model; // スマホの機種名
    String os; //OSの種類
    Account account; //自分のアカウント情報
    AddressBook[] addressBooks = new AddressBook[10]; //アドレス帳
    String[] apps; //インストールされたアプリ

    //コンストラクタ
    public SmartPhone(String model, String os) {
        this.model = model;
        this.os = os;
    }

    //メソッド
    public void setAccount(Account account) {
        this.account = account;
    }

    public void displayDeviceInfo() {
        System.out.println("Model:" + model);
        System.out.println( "OS" + os);
    }

    public void displayMyAccount() {
        System.out.println(account.getAccountInfo());
    }

    public boolean addAddressBook(AddressBook addressBook) {
        for (int i = 0; i < addressBooks.length; i++) {
            if (addressBooks[i] == null) { //10個まで要素を追加する
                addressBooks[i] = addressBook;
                return true;
                }
            }
            return false;
    }

    public void displayAppList() {
        System.out.println("Installed Apps:");
        for(String app : apps){
            System.out.println("- " + app);
        }
    }
}
