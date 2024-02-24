package Fruits;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> box = new ArrayList<>();

    public double getWeight(){
        double weight = 0.0;
        for(T o : box){
            weight += o.getWeight();
        }
        return weight;
    }

    public boolean compare(Box anotherbox) {
        if (getWeight() == anotherbox.getWeight()) return true;
        else {
            return false;
        }
    }

    public void addFruit(T fruit, int numberoffruits){
        for(int i=0;i<numberoffruits;i++){
            box.add(fruit);
        }
    }

    public void pourOver(Box<T> anotherbox){
        anotherbox.box.addAll(box);
        box.clear();
    }
}