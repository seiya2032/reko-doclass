package oop2;

//クラスを作成
class Rectangle implements Shape {
    //フィールドを作成
    private double width;
    private double height;

    //コンストラクタ
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    //ShapeインターフェースのcalculateAreaメソッドをオーバーライド
    @Override
    //面積を求める
    public double calculateArea() {
        return width * height;
    }
}
