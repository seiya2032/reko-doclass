package oop;

public class Main {
    public static void main(String[] array){
        var smartphone = new SmartPhone("Galaxy S21", "Android 11");
        var account = new Account("サナダ", "000-0000-0000", "Eメール", "tokyo");
        var addressbook = new AddressBook("アケチ", "111-1111-1111", "Eメール");

        System.out.println(smartphone.model + smartphone.os);
        System.out.println(account.name + account.tel + account.email + account.address);
        System.out.println(addressbook.name + addressbook.tel + addressbook.email);
        System.out.println(smartphone.displayMyAccount());
        //Object addressBook = null;
        //System.out.println(smartphone.addAddressBook(AddressBook addressBook);
        System.out.println(displayAppList());








//        //Accountのインスタンスを作成
//        var myAccount = new Account("サナダ", "000-0000-0000", "Eメール", "tokyo");
//        //AddressBookのインスタンスを作成
//        var addressBook1 = new AddressBook("アケチ", "111-1111-1111", "Eメール");
//        //var addressBook2 = new AddressBook("オダ", "222-2222-2222", "Eメール");
//        //SmartPhoneのインスタンスを作成
//        var myPhone = new SmartPhone("Galaxy S21", "Android 11");
//        //アドレス帳に要素を追加
//        myPhone.addAddressBook(addressBook1);
//        //myPhone.addAddressBook(addressBook2);
//        //インストールされたアプリ一覧を設定
//        myPhone.apps = new String[]{"Twitter", "youtube", "Twitch"};
//        //自分のアカウントを設定
//        myPhone.setAccount(myAccount);
//        System.out.println(myAccount);
//        //デバイス情報を表示
//        myPhone.displayDeviceInfo();
//        System.out.println(myPhone.apps);
//        //自分のアカウント情報を表示
//        System.out.println(myPhone);
    }

    private static boolean displayAppList() {
        return false;
    }
}
