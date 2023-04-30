package EnumPractice;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Enum {
    public static void main(String[] args){
        //曜日を表す列挙型DayOfWeekを定義
        enum DayOfWeek{
        //それぞれの要素には日本語の曜日名を持たせてください。
        SUNDAY("日曜日"),
        MONDAY("月曜日"),
        TUESDAY("火曜日"),
        WEDNESDAY("水曜日"),
        THURSDAY("木曜日"),
        FRIDAY("金曜日"),
        SATURDAY("土曜日");

        //日本語曜日を保持するためのフィールドを定義
        private final String japaneseName;

        //コンストラクタで日本語曜日名を定義
        DayOfWeek(String japaneseName) {
            this.japaneseName = japaneseName;
        }

        //日本語曜日を返すメソッドを定義
        public String getDsyOfWeek(){
            return japaneseName;
        }
            //与えられた日付の曜日を返すメソッドを定義してください。
            public static DayOfWeek getDsyOfWeek(LocalDate date){
                //LocalDateオブジェクトから曜日を取得する
                java.time.DayOfWeek dayOfWeek = date.getDayOfWeek();
                //DayOfWeek要素の中から、dayOfWeekと同じ曜日を持つ要素を探す
                for(DayOfWeek dow : DayOfWeek.values()){
                    if(dow.name().equals(dayOfWeek.name())) {
                        return dow;
                    }
                }
                //該当する曜日が見つからなかった場合nullを返す
                return null;
            }
        }
        //現在の日付を取得
        LocalDate date = LocalDate.now();
        //現在の日付の曜日を取得
        DayOfWeek dow = DayOfWeek.getDsyOfWeek(date);
        //結果を出力
        System.out.println("今日は" + dow.getDsyOfWeek() + "です。");
    }
}

