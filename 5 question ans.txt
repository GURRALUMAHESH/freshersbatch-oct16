abstract class Shape{
    abstract void draw();
    {

    }
}
class Line extends Shape
{
    public void draw()
    {
        System.out.println("draw Line");
    }

}
class Rectangle extends Shape
{
    public void draw()
    {
        System.out.println("draw rectangle");
    }
}
    class  Circle extends Shape
    {
        public void draw()
        {
              System.out.println("draw circle");
        }

    }

class  Cube extends Shape
{
    public void draw()
    {
        System.out.println("draw cube");
    }

}
class Mainclass{
    public static void main(String[] args) {
        Shape obj=new Line();
        obj.draw();
        Shape obj1=new Rectangle();
        obj1.draw();
        Shape obj2=new Circle();
        obj2.draw();
        Shape obj3=new Cube();
        obj3.draw();
    }

}

