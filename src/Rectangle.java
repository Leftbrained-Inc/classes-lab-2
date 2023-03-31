// Implementation of interfaces as a base geometry shape (Rectangle)
public class Rectangle implements IGeometrical, IDrawable {
        public void getPerimeter() // perimeter formula printing
        {
            System.out.println("(a + b) * 2");
        }
        public void getArea() // square formula printing
        {
            System.out.println("a * b");
        }
        public void draw() // "drawing" a shape as a text
        {
            System.out.println("Rectangle");
        }
}
