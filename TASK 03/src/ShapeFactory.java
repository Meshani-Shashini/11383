public class ShapeFactory {
    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle(3);
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square(5);
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle(4,6);
        } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle(5);
        }
        return null;
    }
}
