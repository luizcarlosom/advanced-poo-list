package Cakes;
public class MultiLayeredCake extends Cake {
    private int cost = 5;

    public int getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return "Multi-layered";
    }
}