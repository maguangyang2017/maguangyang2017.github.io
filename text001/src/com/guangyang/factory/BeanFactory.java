package com.guangyang.factory;




import java.util.ResourceBundle;

/**
 * Created by 马光阳 on 2017/6/29.
 */
public class BeanFactory {
    private static ResourceBundle bundle;
    static{
        bundle = ResourceBundle.getBundle("instance");
    }
    public static <T> T getInstance(String key,Class<T> clazz){

        try {
            String className = bundle.getString(key);//类的全路径
            return (T)Class.forName(className).newInstance();//反射方式
        } catch (Exception e) {
            throw  new RuntimeException(e);
        }
    }
}