package structPattern.DynamicProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyTest implements InvocationHandler {
    public Object targetObject;
    public Object newProxyInstance(Object object){
        this.targetObject=object;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),targetObject.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)throws Exception{
        System.out.println("做些预处理");
        return method.invoke(targetObject,args);
    }
}
