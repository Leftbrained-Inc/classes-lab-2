// Sample implementation of IGeometrical, IDrawable as a Circle shape in geometry
public class Circle implements IGeometrical, IDrawable // класс с двумя интерфейсами
{
    public void getPerimeter() {
        System.out.println("2 * pi* r");
    }

    public void getArea() {
        System.out.println("pi * r^2");
    }

    public void draw() {
            System.out.println("Circle");
    }
}