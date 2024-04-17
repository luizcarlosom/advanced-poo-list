package Leaf.Chassi;

import Component.CarComponent;

public class SuspensionLeaf implements CarComponent {
    private String name;
    private int weight;

    public SuspensionLeaf(String name, int weight) {
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
