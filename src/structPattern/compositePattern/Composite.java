package structPattern.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Composite extends AbsCompnent {
    public String name;
    public List<AbsCompnent> childs=new ArrayList<>();
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public int addChild(AbsCompnent compnent){
        childs.add(compnent);
        return 0;
    }
    @Override
    public int removeChild(AbsCompnent compnent){
        childs.remove(compnent);
        return 1;
    }
    @Override
    public List<AbsCompnent> getChild(){
        return childs;
    }
}
