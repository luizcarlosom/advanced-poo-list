package Cakes;
public class SprinklesCake extends Cake {
    private int cost = 2;
    private Cake cake;

    public SprinklesCake(Cake cake) {
        this.cake = cake;
    }

    public int getCost() {
        return cost + cake.getCost();
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " with sprinkles";
    }
    
}
