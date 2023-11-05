package lab5.Task3;

import java.util.Collection;

abstract class Box {

    public abstract void add(Thing thing);

    public void add(Collection<Thing> things){
        for (Thing thing : things){
            add(thing);
        }
    }

    public abstract boolean isInTheBox(Thing thing);
}

class Thing{
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Thing(double weight) {
        if (weight>0){
        this.weight = weight;}
        else throw new IllegalArgumentException("This value is negative.");
    }
    @Override
    public boolean equals(Object obj){
        Thing thing=(Thing) obj;
        if (thing.getWeight() == this.getWeight()){
                return true;
    }
        return false;
}
    @Override
    public int hashCode(){

    }
}
