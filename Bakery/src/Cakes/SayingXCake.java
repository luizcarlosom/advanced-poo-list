package Cakes;
public class SayingXCake extends Cake{
    private Cake cake;
    private String withSaying;

    public SayingXCake(Cake cake, String withSaying) {
        this.cake = cake;
        this.withSaying = withSaying;
    }

    public int getCost() {
        return cake.getCost();
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " with saying " + withSaying;
    }
  
}
