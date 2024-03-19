package com.hspedu.reflection;

import com.hspedu.Cat;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Properties;

@SuppressWarnings({"all"})
public class reflectQuestion {
    public static void main(String[] args) throws IOException {
        //根据配置文件re.properties指定信息 创建cat对象并且调用方法
        new Cat().hi();

        Properties properties = new Properties();
        properties.load(new FileInputStream("src\re.properties"));

        String clasfullpath = properties.get("clasfullpath").toString();
        String method = properties.get("method").toString();

        System.out.println(clasfullpath);
        System.out.println(method);


        //创建对象
        Class cls = Class.forName(clasfullpath);
//
//        Object o = cls.newInstance();
//        System.out.println(o.getClass());
        //通过cls得到你加载的类得到的加载的对象
        Method method1 = cls.getMethod(method);

    }
}
