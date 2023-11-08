package com.pluralsight;

public class House extends Asset{

 String address;
 int condition;
 int squareFoot;
 int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue(){
        double acc = (this.lotSize)*.25;
        if (condition==1){
            acc += (180*squareFoot);
        } else if (condition==2){
            acc += (130*squareFoot);
        }else if (condition==3){
            acc += (190*squareFoot);
        }else{
            acc+=(squareFoot*80);
        }

        return acc;
    }
}
