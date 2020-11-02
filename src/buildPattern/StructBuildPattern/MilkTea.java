package buildPattern.StructBuildPattern;

public class MilkTea implements Cloneable {
    public Ice ice;
    public Size size;
    public Sweetness sweetness;
    public String add;
    private MilkTea(MilkTeaBuilder milkTeaBuilder){
        this.ice=milkTeaBuilder.ice;
        this.size=milkTeaBuilder.size;
        this.sweetness=milkTeaBuilder.sweetness;
        this.add=milkTeaBuilder.add;
    }
    @Override
    public MilkTea clone(){
        MilkTea milkTea=null;
        try {
            milkTea=(MilkTea) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }finally {
            return milkTea;
        }
    }
    public static class MilkTeaBuilder{
        public Ice ice=Ice.MEDIUMICE;
        public Size size=Size.BIG;
        public Sweetness sweetness=Sweetness.MEDIUM;
        public String add="null";
        public MilkTeaBuilder setIce(Ice ice){
            this.ice=ice;
            return this;
        }
        public MilkTeaBuilder setSize(Size size){
            this.size=size;
            return this;
        }
        public MilkTeaBuilder setSweetness(Sweetness sweetness){
            this.sweetness=sweetness;
            return this;
        }
        public MilkTeaBuilder setAdd(String add){
            this.add=add;
            return this;
        }
        public MilkTea getMilkTea(){
            return new MilkTea(this);
        }
    }
    public static void main(String[] args){
        MilkTea milkTea=new MilkTea.MilkTeaBuilder().setIce(Ice.MEDIUMICE).setSize(Size.BIG).getMilkTea();
    }

}
