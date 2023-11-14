package com.pluralsight.finance;

public class Gold extends FixedAsset{

    private double weight;

    public Gold(String name, double value, double weight) {
        super(name, value);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Gold{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
