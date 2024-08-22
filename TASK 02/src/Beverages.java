public abstract class Beverages {
    boolean wantsExtras = false;

    // Template method
    public final void finalTemplateMethod() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();

        if (wantsExtras) {
            addExtras();
        }
    }

    // Common methods
    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Abstract methods to be implemented by subclasses
    abstract void brew();
    abstract void addCondiments();
    abstract void addExtras();

    // Setter for wantsExtras
    public void setWantsExtras(boolean wantsExtras) {
        this.wantsExtras = wantsExtras;
    }
}
