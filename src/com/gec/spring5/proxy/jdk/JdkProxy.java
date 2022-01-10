package com.gec.spring5.proxy.jdk;

import com.gec.spring5.proxy.PersionService;
import com.gec.spring5.proxy.imp.PersionServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JdkProxy {
    public static void main(String[] args) {
        Class[] interfaces = {PersionService.class};
        PersionService persionService = new PersionServiceImpl();
        PersionService persionService2 = (PersionService) Proxy.newProxyInstance(JdkProxy.class.getClassLoader(), interfaces,new PersionProxy(persionService));
        persionService2.add("sabduiahudiawhui");
    }
    public static class PersionProxy implements InvocationHandler{

        private Object object;

        public PersionProxy(Object object) {
            this.object = object;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            System.out.println("方法调用之前");


            System.out.println(method.getName()+"\t"+Arrays.toString(args));

            Object invoke = method.invoke(object, args);

            System.out.println("方法之后"+object);

            return invoke;
        }
    }

}
