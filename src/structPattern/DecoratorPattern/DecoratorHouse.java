package structPattern.DecoratorPattern;

public class DecoratorHouse implements IHouse {
    public IHouse house;
    public DecoratorHouse(IHouse house){
        this.house=house;
    }
    @Override
    public void live(){
        house.live();
    }
}
