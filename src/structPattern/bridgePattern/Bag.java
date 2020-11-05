package structPattern.bridgePattern;

import buildPattern.StructBuildPattern.Ice;

public abstract class Bag {//Bag有多个维度的属性，用组合而不是继承去完成它的设计
    public IBrand brand;
    public IColor color;
    public void setBrand(IBrand brand){
        this.brand = brand;
    }
    public void setColor(IColor color){
        this.color=color;
    }
    public IBrand getBrand(){
        return this.brand;
    }
    public IColor getColor(){
        return this.color;
    }
    public abstract String getBagName();
}
