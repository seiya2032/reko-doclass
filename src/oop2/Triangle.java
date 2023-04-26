package oop2;
 class Triangle implements Shape{
    //フィールドを作成
     private double base;
    private double height;

    //コンストラクタを作成
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    //ShapeインターフェースのcalculateAreaメソッドをオーバーライド
     @Override
     //面積を求める
     public double calculateArea(){
        return 0.5 * base * height;
    }
}