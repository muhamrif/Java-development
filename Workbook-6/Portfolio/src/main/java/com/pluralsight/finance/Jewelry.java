package com.pluralsight.finance;

public class Jewelry extends FixedAsset {

    private double karat;

    public Jewelry(String name, double value, double karat) {
        super(name, value);
        this.karat = karat;
    }

    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }


    public double getValue() {
    return this.value;
    }

    @Override
    public String toString() {
        return "Jewelry{" +
                "karat=" + karat +
                ", name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}

