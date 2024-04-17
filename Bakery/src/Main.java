import Cakes.ChocolateCake;
import Cakes.MultiLayeredCake;
import Cakes.SayingXCake;
import Cakes.SprinklesCake;
import Cakes.StrawberryCake;
import Cakes.VanillaCake;

public class Main {
    public static void main(String[] args) {
        // Create the order
        Order order = new Order();
        
        ChocolateCake chocolateCake = new ChocolateCake();
        VanillaCake vanillaCake = new VanillaCake();
        SprinklesCake sprinklesCake = new SprinklesCake(vanillaCake);

        SayingXCake sayingXCake1 = new SayingXCake(vanillaCake, "'PLAIN!'");
        SayingXCake sayingXCake2 = new SayingXCake(sprinklesCake, "'FANCY!'");

        SayingXCake sayingXCake3 = new SayingXCake(new SayingXCake(new SprinklesCake(new SprinklesCake(new StrawberryCake(new MultiLayeredCake()))), "'One of'"), "'EVERYTHING'");

        order.addCake(chocolateCake);
        order.addCake(sayingXCake1);
        order.addCake(sayingXCake2);
        order.addCake(sayingXCake3);

        // Print the order
        order.printOrder();
    }
}
