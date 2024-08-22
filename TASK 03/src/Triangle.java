public class Triangle implements Shape {
    private int height;

    public Triangle (int height) {
        this.height = height;
    }
    @Override
    public void draw() {
        for (int i = 0; i <= height; i++) {
            for(int j = 0; j > i; j++) {
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}
