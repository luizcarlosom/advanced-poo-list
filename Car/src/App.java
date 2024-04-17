import Composite.Car;
import Leaf.Body.DashboardLeaf;
import Leaf.Body.DoorLeaf;
import Leaf.Body.FenderLeaf;
import Leaf.Body.HoodLeaf;
import Leaf.Body.TrunkLeaf;
import Leaf.Chassi.SuspensionLeaf;
import Leaf.PowerTrain.DiferentialLeaf;
import Leaf.PowerTrain.EngineLeaf;
import Leaf.PowerTrain.TransmissionLeaf;
import Leaf.PowerTrain.WheelLeaf;
import Node.BodyNode;
import Node.ChassiNode;
import Node.PowerTrainNode;


public class App {
    public static void main(String[] args) {
        Car body = new BodyNode("Carroceria");
        Car powerTrain = new PowerTrainNode("Trem de força");
        Car chassi = new ChassiNode("Chassi");
        
        body.add(new DashboardLeaf("Painel", 30));
        body.add(new DoorLeaf("Porta", 100));
        body.add(new FenderLeaf("Para-lamas", 80));
        body.add(new HoodLeaf("Capô", 150));
        body.add(new TrunkLeaf("Porta-malas", 125));        
        
        powerTrain.add(body);
        powerTrain.add(new EngineLeaf("Motor", 500));
        powerTrain.add(new TransmissionLeaf("Transmissão", 200));
        powerTrain.add(new DiferentialLeaf("Diferencial", 20));
        powerTrain.add(new WheelLeaf("Roda", 15));

        chassi.add(powerTrain);
        chassi.add(new SuspensionLeaf("Suspensão", 200));
    }
}
