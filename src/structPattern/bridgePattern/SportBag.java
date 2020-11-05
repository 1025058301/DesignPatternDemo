package structPattern.bridgePattern;

public class SportBag extends Bag {
    @Override
    public String getBagName(){
        return this.color.toString()+" "+this.brand.toString()+" SportBag";
    }
}
