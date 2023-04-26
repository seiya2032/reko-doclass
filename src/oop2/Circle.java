package oop2;

//クラス作成と実装
class Circle implements Shape{
    //フィールド
    private double radius;

    //コンストラクタ
    public Circle(double radius){
        this.radius = radius;
    }
    //オーバーライド
    @Override
    //面積を求める
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
}
