package com.fanshe;

public class TestReflect1 {
    public static void main(String[] args) throws Exception {
        Class<?> class1 = null;
        Class<?> class2 = null;
        Class<?> class3 = null;
        // һ�����������ʽ
        class1 = Class.forName("com.fanshe.TestReflect1");
        class2 = new TestReflect1().getClass();
        class3 = TestReflect1.class;
        System.out.println("������   " + class1.getName());
        System.out.println("������   " + class2.getName());
        System.out.println("������   " + class3.getName());
    }
}