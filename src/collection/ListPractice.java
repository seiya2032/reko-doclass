package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class ListPractice {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        //"exit"が入力されるまで名前を受け取ります
        while (true) {
            System.out.println("名前を入力してください　(exitで終了)：");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            list.add(input);
        }
        //最初の要素、最後の要素、アルファベット・五十音順で並び変えたリストを表現します
        if(list.isEmpty()) {
            System.out.println("名前が入力されていません。");
        } else {
            System.out.println("最初の名前；" + list.get(0));
            System.out.println("アルファベット順；" + list);

            //五十音順に並び変え
            Collections.sort(list, (s1, s2) -> s1.compareToIgnoreCase(s2));
            System.out.println("五十音順：" + list);
        }
    }
}
