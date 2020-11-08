package structPattern.DecoratorPattern;

public class PoolBigHouse extends DecoratorHouse {
    public PoolBigHouse(IHouse house){
        super(house);
    }
    @Override
    public void live(){
        super.live();
        System.out.println("不同的是现在多了一个游泳池");
        add();
    }
    public void add(){

    }
}
