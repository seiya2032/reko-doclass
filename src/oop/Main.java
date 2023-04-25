package oop;

public class Main {
    public static void main(String[] array){
        //Accountのインスタンスを作成
        Account myAccount = new Account("サナダ", "000-0000-0000", "Eメール", "tokyo");
        //AddressBookのインスタンスを作成
        AddressBook addressBook1 = new AddressBook("アケチ", "111-1111-1111", "Eメール");
        AddressBook addressBook2 = new AddressBook("オダ", "222-2222-2222", "Eメール");
        //SmartPhoneのインスタンスを作成
        SmartPhone myPhone = new SmartPhone("Galaxy S21", "Android 11");
        //アドレス帳に要素を追加
        myPhone.addAddressBook(addressBook1);
        myPhone.addAddressBook(addressBook2);
        //インストールされたアプリ一覧を設定
        myPhone.apps = new String[]{"Twitter", "youtube", "Twitch"};
        //自分のアカウントを設定
        myPhone.setAccount(myAccount);
        //デバイス情報を表示
        myPhone.displayDeviceInfo();
        System.out.println();
        //自分のアカウント情報を表示
        System.out.println(myPhone);
    }
}
