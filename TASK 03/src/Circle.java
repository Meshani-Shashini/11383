public class Circle implements Shape {
    private int radius;
    public Circle (int radius) {
        this.radius = radius;
    }
    @Override
    public void draw() {
        int r = 10;
        int diameter = 2 * r + 1;
        for (int i = 0; i < diameter; i++) {
            for (int j = 0; j < diameter; j++) {
                int x = i - r;
                int y = j - r;
                if (x * x + y * y <= r * r + r * 0.8) {
                    System.out.println("* ");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
}
