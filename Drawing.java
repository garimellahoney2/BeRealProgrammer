abstract class Shape
{
abstract void draw();
abstract void erase();
}
class Circle extends Shape
{
void draw()
{
System.out.println("Drawing Circle");
}
void erase()
{
System.out.println("Erasing Circle");
}
}
class Triangle extends Shape
{
void draw()
{
System.out.println("Drawing Triangle");
}
void erase()
{
System.out.println("Erasing Triangle");
}
}
class Drawing
{
public static void main(String args[])
{
Shape s = new Circle();
s.draw();
s.erase();
}
}