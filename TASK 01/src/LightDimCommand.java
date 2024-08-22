public class LightDimCommand implements Command {
    private Light light;
    private int previousLevel;
    private int level;

    public LightDimCommand (Light light, int level) {
        this.light = light;
        this.level = level;
    }

    @Override
    public void execute() {
        previousLevel = light instanceof KitchenRoomLight
                ? ((KitchenRoomLight) light).getBrightness():
                ((LivingRoomLight) light).getBrightness();
        light.dim(level);
    }
    @Override
    public void undo() {
        light.dim(previousLevel);
    }
}
