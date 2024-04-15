package Leaf.Body;

import Component.CarComponent;

public class DashboardLeaf implements CarComponent {
    private String name;
    private int weight;

    public DashboardLeaf(String name, int weight) {
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
