package Cakes;

public class StrawberryCake extends Cake {
    private Cake cake;
    private int cost = 20;

    public StrawberryCake(Cake cake) {
        this.cake = cake;
    }
    public int getCost() {
        return cost + cake.getCost();
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " Strawberry cake";
    }
}
