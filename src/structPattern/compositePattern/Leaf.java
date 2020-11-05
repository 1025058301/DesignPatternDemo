package structPattern.compositePattern;

import java.util.List;

public class Leaf extends AbsCompnent {//树叶类，进行对象的管理操作时返回空 透明模式
    public String name;
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public int addChild(AbsCompnent compnent){
        return 1;
    }
    @Override
    public int removeChild(AbsCompnent compnent){
        return 1;
    }
    @Override
    public List<AbsCompnent> getChild(){
        return null;
    }
}
