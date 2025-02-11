import it.utils.shape.*;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.inputParameters();
        //
        System.out.println("Circle radius: " + circle.getRadius());
        System.out.printf("Circle area: %.2f\n", circle.getArea());
        System.out.printf("Circle circumference: %.2f\n\n", circle.getCircumference());
        //
        Triangle triangle = new Triangle();
        triangle.inputParameters();
        System.out.println("Triangle base: " + triangle.getBase() + " height: " + triangle.getHeight());
        System.out.printf("Triangle area: %.2f\n\n", triangle.getArea());
        //
        Rectangle rectangle = new Rectangle();
        rectangle.inputParameters();
        System.out.println("Rectangle width: " + rectangle.getWidth() + " height: " + rectangle.getHeight());
        System.out.printf("Rectangle area: %.2f", rectangle.getArea());

    }
}
