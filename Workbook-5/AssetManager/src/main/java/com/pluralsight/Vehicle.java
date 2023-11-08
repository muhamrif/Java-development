package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset {

    String makeModel;
    int year;
    int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue(){
        int currYear = LocalDate.now().getYear();
        double acc = this.originalCost;
        if (currYear-this.year<=3){
            for(int i=0;i<(currYear-this.year);i++){
                acc-= acc*.03;
            }
        }else if (currYear-this.year>=4 && currYear-this.year>=6){
            for(int i=0;i<(currYear-this.year);i++){
                acc-= acc*.06;
            }
        }else if (currYear-this.year>=7 && currYear-this.year<=10){
            for(int i=0;i<(currYear-this.year);i++){
                acc-= acc*.10;
            }
        } else if (currYear-this.year>10) {
            acc -= 1000;
        }

        if (!(this.makeModel.equalsIgnoreCase("honda") || this.makeModel.equalsIgnoreCase("toyota")) && this.odometer>100000){
            acc *= .75;
        }

        return acc;
    }
}
