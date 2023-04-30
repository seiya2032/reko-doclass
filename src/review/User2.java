package review;

public class User2 {
    public static void main(String[] args){
        //レコードの作成
//        var user = new User("ito", "tokyo",23);
        //各要素を個別で表示
//        System.out.println(user.name());
//        System.out.println(user.from());
//        System.out.println(user.age());
        //要素をまとめて表示
//        System.out.println(user);

        //ユーザーレコードの配列を作成
        User[] users = {
                new User("ito", "tokyo", 23),
                new  User("yamazaki", "osaka", 27),
                new User("kuroko", "hukuoka", 30)
        };
        System.out.println(users[2]);
    }
}
