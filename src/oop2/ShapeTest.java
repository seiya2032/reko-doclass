package oop2;

//クラス作成
public class ShapeTest {
    //Shape型の配列の各要素の面積の合計を求める
    public static double getTotalArea(Shape[] shapes) {
        double total = 0.0;
        for (Shape s : shapes) {
            total += s.calculateArea();
        }
        return total;
    }
    public static void main(String[] args){
        //TriangleとRectangleのインスタンスを作成し、Shape型の配列に格納する
        Shape[] shapes = new Shape[3];
        shapes[0] = new Triangle(10.0,  5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Circle(3.0);

        //配列の各要素の面積の合計を求める
        double totalArea = getTotalArea(shapes);

        //合計面積を出力する
        System.out.println("合計面積は" + totalArea + " です");
    }
}
