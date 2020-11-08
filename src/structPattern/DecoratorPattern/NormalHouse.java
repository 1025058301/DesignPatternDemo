package structPattern.DecoratorPattern;

public class NormalHouse implements IHouse {
    @Override
    public void live(){
        System.out.println("住在一个80平米，普普通通的房子里");
    }
}
