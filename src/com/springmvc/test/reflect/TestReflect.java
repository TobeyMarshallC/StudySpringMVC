package com.springmvc.test.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 *在ReflectTest中，使用了几个重要的反射类，分别是ClassLoader、Class、Constructor和Method，
 * 通过这些反射类就可以间接调用目标Class的各项功能了。
 * 在①处，我们获取当前线程的ClassLoader，然后通过指定的全限定类“com.baobaotao.beans.Car”装载Car类对应的反射实例。
 * 在②处，我们通过Car的反射类对象获取Car的构造函数对象cons，通过构造函数对象的newInstrance()方法实例化Car对象，其效果等同于new Car()。
 * 在③处，我们又通过Car的反射类对象的getMethod（String methodName,Class paramClass）获取属性的Setter方法对象，
 * 第一个参数是目标Class的方法名；第二个参数是方法入参的对象类型。获取方法反射对象后，
 * 即可通过invoke（Object obj,Object param）方法调用目标类的方法，该方法的第一个参数是操作的目标类对象实例；第二个参数是目标方法的入参。
 * Created by Tobey Marshall on 2017/7/4.
 */
public class TestReflect {
    public static void main(String[] args) {
        //Car car = new Car();
        //car.setBrand("Haval H2 2017");

        Car car;
        try {
            car = initByDefaultConstructor();
            car.introduce();
        }catch (Throwable ex){
            ex.printStackTrace();
        }

    }

    public static  Car initByDefaultConstructor() throws Throwable{
        //①通过类装载器获取Car类的对象
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.springmvc.test.reflect.Car");

        //②获取类的默认构造器对象并通过它实例化Car
        Constructor cons = clazz.getDeclaredConstructor((Class[])null);
        Car car = (Car)cons.newInstance();

        //③通过反射方法设置属性
        Method setBrand = clazz.getMethod("setBrand",String.class);
        setBrand.invoke(car,"Haval H2 2017");

        Method setColor = clazz.getMethod("setColor",String.class);
        setColor.invoke(car,"Black");

        Method setMaxSpeed = clazz.getMethod("setMaxSpeed",int.class);
        setMaxSpeed.invoke(car,220);

        return car;
    }
}
