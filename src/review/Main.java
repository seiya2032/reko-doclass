package review;

import java.io.File;
import java.io.IOException;
public class Main {
    public static void main(String[] args){
//        //非チェック例外
//        int n = 10;
//        int m = 0;
//        System.out.println(n / m);

//        //チェック例外
//        File file = new File("C:\\\\\\\\test\\\\\\\\test.java");
//        file.createNewFile();

//        //try~catehの使い方
//        File file = new File("C:\\\\\\\\test\\\\\\\\test.java");
//        try {
//            file.createNewFile();
//            System.out.println("ファイル作成完了");
//        } catch (IOException e) {
//            System.out.println("エラー発生！");
//            e.printStackTrace();//コンソールにエラー情報を出力する処理
//        }

//        //catch句は複数書くことができます。
//        try {
//            String str = null;
//            String sub;
//            sub = str.substring(10);
//            System.out.println(sub);
//        //一つのキャチ句にまとめて書くことも可能
//        } catch (NullPointerException | IndexOutOfBoundsException e) {
//            e.printStackTrace();
//        }
//        } catch (NullPointerException e) {
//            System.out.println("NullPointer");
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("IndexOutOfBounds");
//        }

        //例外のcatchにもポリモーフィズムが働く
        //スーパークラスのExceptionでcatchすることもできる
        //非チェック例外ならRuntimeExceptionのサブクラスなので、
        //非チェック例外ならRuntimeExceptionで対処できる
//        try {
//            System.out.println(10 / 0);
            //これを付けるとコンパイルエラーになる
            //継承関係で親に値するクラスが先に書かれている場合、
            //サブクラスのcatchは通らくなるため、コンパイルエラー
//        } catch (Exception e) {
//              System.out.println("Exception");
    //        } catch (RuntimeException e) {
    //            System.out.println("RuntimeException");
    //        }

        //finally句
        //処理が正常の終了しようが、例外が発生しようが、どちらにせよ必ず実行したい処理がある場合もある
        // その場合、catch句の後にfinally句を使用することで実現可能
        // DB操作やファイル操作、ネットワーク関連の処理などでは、リソースを使用した後に開放する処理が必要で
        // そのような場合にfinallyが使用される
//        try {
//            int n = 10 / 0;
//            System.out.println(n);
//        } catch (Exception e) {
//            System.out.println("例外発生");
//        } finally {
//            System.out.println("絶対に通る");
//        }
        // throws宣言のあるメソッドを呼び出す場合は、例外の対処が必要
        // そのメソッドをtry~catchで囲って対処。またはthrows宣言をしてさらに呼び出し元に任せる
        // mainメソッドでthrows宣言をした場合、JVMが処理することになり、例外発生時点でプログラムは終了する
//            try {
//                createjavaFile()
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        // 呼び出し元に例外処理を任せる
        // throws宣言を書くことで、try~catchが不要になる
//            public static void createjavaFile() throw IOException {
//            File file = new File("C:\\\\\\\\test\\\\\\\\test.java");
//            file.createNewFile();
//        }
        int n = calc();
        System.out.println(n);
    }

    public static int calc() throws RuntimeException {
        return 10 / 0;
    }
}
