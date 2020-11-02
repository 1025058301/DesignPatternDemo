package buildPattern.PrototypePattern;

import buildPattern.StructBuildPattern.MilkTea;

import java.io.*;

public class Prototype implements Cloneable, Serializable {
    public int value;
    public int age;
    public String name;
    public MilkTea milkTea;
    public Prototype(){

    }
    public Prototype(int value,int age,String name,MilkTea milkTea){
        this.age=age;
        this.value=value;
        this.name=name;
        this.milkTea=milkTea;
    }
    @Override
    public Prototype clone(){//浅克隆
        Prototype res=null;
        try {
            res=(Prototype) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return res;
    }
    public Prototype deepClone(){//深克隆
        Prototype res=null;
        try {
            res=(Prototype)super.clone();
            res.milkTea=(MilkTea)milkTea.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return  res;
    }
    public Prototype absolutlyClone() throws Exception{//序列化实现完全拷贝
        ByteArrayOutputStream bao = new ByteArrayOutputStream();

        ObjectOutputStream oos = new ObjectOutputStream(bao);

        oos.writeObject(this);

        // 将对象从流中取出

        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());

        ObjectInputStream ois = new ObjectInputStream(bis);

        return (Prototype) ois.readObject();

    }
    public static void main(String[] args){
        Prototype prototype=new Prototype(10,5,"立白",new MilkTea.MilkTeaBuilder().getMilkTea());
        Prototype cloneObject=prototype.clone();
        System.out.println("实现浅克隆");
        System.out.println("两个对象是否相等："+(prototype==cloneObject));
        System.out.println("两个对象的奶茶是否相等"+(prototype.milkTea==cloneObject.milkTea));
    }
}
