package review;

public class TestAction {
    public static void main(String[] args) {
        //カード決済クラスとコンビニ支払いクラスをインスタンス化してメソッドを呼ぶ
        CreditCard cc = new CreditCard();
        cc.payment();

        ConvenienceStore cs = new ConvenienceStore();
        cs.payment();
    }
}
