package Leaf.PowerTrain;

import Component.CarComponent;

public class WheelLeaf implements CarComponent{
    private String name;
    private int weight;

    public WheelLeaf(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }
}
