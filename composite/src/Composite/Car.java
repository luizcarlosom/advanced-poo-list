package Composite;
import java.util.ArrayList;
import java.util.List;

import Component.CarComponent;

public class Car implements CarComponent {
    private List<CarComponent> components = new ArrayList<>();
    private String name;

    public Car(String name) {
        this.name = name;
    }
    
    public void add(CarComponent component) { 
        components.add(component);
        System.out.println(
            "Somando agora o peso de " + component.getName() 
            + ": " + component.getWeight() + " Total parcial: " + getWeight()
        );
    }

    public void remove(CarComponent component) {
        components.remove(component);
    }

    @Override
    public int getWeight() {
        int totalWeight = 0;

        for (CarComponent component : components) {
            totalWeight += component.getWeight();
        }
        return totalWeight;
    }

    @Override
    public String getName() {
        return this.name;
    }
}