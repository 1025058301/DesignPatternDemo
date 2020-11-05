package structPattern.compositePattern;

import java.util.List;

public abstract class AbsCompnent {
    public abstract String getName();
    public abstract List<AbsCompnent> getChild();
    public abstract int addChild(AbsCompnent compnent);
    public abstract int removeChild(AbsCompnent compnent);

}
