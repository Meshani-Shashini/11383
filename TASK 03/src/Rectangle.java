public class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle (int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw() {

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
