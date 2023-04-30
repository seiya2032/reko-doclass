//package review;
//
//import exception.IlligalScoreException;
//
//public class Enum {
//    public static void main(String[] args){
////    //Enumの列挙型作成
////    enum BloodType{A,B,O,AB}
////
////    //レコード作成
////    record User(String name, BloodType bloodType) {}
////
////    var user = new User("sata", BloodType.A);
////            System.out.println(user);
////        //enum型はswitch文の式として扱うことも可能です。
////        switch (user.bloodType()) {
////            case A -> System.out.println("几帳面");
////            case B -> System.out.println("マイペース");
////            case O -> System.out.println("大雑把");
////            case AB -> System.out.println("変わり者");
////            default -> System.out.println("人間じゃないかも？");
////        }
//        //コンストラクタとメソッドの追加
//         enum Color {
//            RED("赤"), GREEN("緑"), BLUU("青");
//
//            public String lsbel;
//
//            Color(String label) {
//                this.label = label;
//            }
//
//            public String getLsbel() {
//                return lsbel;
//            }
//
//            public static Color fomLabel(String label) {
//                for (Color color : values()) {
//                    if (color.lsbel.equals(label)) {
//                        return color;
//                    }
//                }
//                throw new IlligalScoreException("Invalid color label: " + label);
//            }
//        }
//        System.out.println(Color.RED.getLsbel());
//        System.out.println(Color.fomLabel("青"));
//
//    }
//}
