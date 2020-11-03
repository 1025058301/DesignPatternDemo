package structPattern.adapterPattern;

public class Adapter implements Target {//对象适配器模式 类适配器模式则适配器继承适配者类
    public Adaptee adaptee=null;
    public Adapter(){
        adaptee=new Adaptee();
    }
    @Override
    public void request(){
        adaptee.specialRequest();
    }
}
