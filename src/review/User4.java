package review;

public class User4 {
    public static void main(String[] args){
    //インスタンスの生成
    //引数にはコンストラクタに合致する実引数を渡す
    var user = new User3("ito", 23);
    //コンストラクタが定義されてない時には引数に何も入れない
    //    var user = new User3();
        //("no name", 0);

    System.out.println(user.name);
    System.out.println(user.age);
//    user.name = "ito";
    System.out.println(user.greet());
    }
}
