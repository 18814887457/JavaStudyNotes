package com.zola.code.reflection;

import com.zola.code.reflection.entity.ExtendType;
import sun.tools.java.ClassType;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {

    public static void main(String[] args) {


        Reflection reflection = new Reflection();

//        reflection.classTest();

//        reflection.fieldTest();

//        reflection.methodTest();

        reflection.constructorTest();


    }


    public void classTest() {
        //通过 Class.forName()传入类的路径获取
        try {
            Class<?> clazz = Class.forName("java.lang.Boolean");

            System.out.println(clazz);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void fieldTest() {
        Class<?> classType = ExtendType.class;

        // 使用getFields获取属性
        Field[] fields = classType.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }

        System.out.println();

        // 使用getDeclaredFields获取属性
        fields = classType.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f);
        }
    }

    public void methodTest() {
        // 使用getMethods获取函数
        Class<?> classType = ExtendType.class;
        Method[] methods = classType.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }

        System.out.println();

        // 使用getDeclaredMethods获取函数
        methods = classType.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m);
        }




    }

    public void constructorTest() {
        Class<?> classType = ExtendType.class;

        // 使用getConstructors获取构造器
        Constructor<?>[] constructors = classType.getConstructors();
        for (Constructor<?> m : constructors)
        {
            System.out.println(m);
        }

        System.out.println();

// 使用getDeclaredConstructors获取构造器
        constructors = classType.getDeclaredConstructors();
        for (Constructor<?> m : constructors)
        {
            System.out.println(m);
        }

    }


}
