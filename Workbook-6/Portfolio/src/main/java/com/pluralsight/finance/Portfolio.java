package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    protected String name;
    protected String owner;
    protected List<IValuable> asset = new ArrayList<>();

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<IValuable> getAsset() {
        return asset;
    }

    public void setAsset(List<IValuable> asset) {
        this.asset = asset;
    }


    public void add(IValuable asset){
        this.asset.add(asset);
    }



    public double getValue(){
        double acc = 0;

        for (IValuable x:asset){
            acc += x.getValue();
        }
        return acc;
    }

    public IValuable getMostValuable(){

        IValuable valuable = this.asset.get(0);

        for (int i=1;i<asset.size();i++){
            if(valuable.getValue()<asset.get(i).getValue()){
                valuable= asset.get(i);
            }
        }
         return valuable;

    }

    public IValuable getLeastValuable(){

        IValuable valuable = this.asset.get(0);

        for (int i=1;i<asset.size();i++){
            if(valuable.getValue()>asset.get(i).getValue()){
                valuable= this.asset.get(i);
            }
        }
        return valuable;

    }
}
