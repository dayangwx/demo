package com.example.demo.reflection;

import com.example.demo.vo.User;

public class ReflectionDemo {
    /**
     * 反射，
     * 反射创建类
     */
    public static void main(String[] args) throws ClassNotFoundException {

        Class c1 = Class.forName("com.example.demo.vo.User");
        System.out.println(c1);

        Class c2 = Class.forName("com.example.demo.vo.User");
        Class c3 = Class.forName("com.example.demo.vo.User");
        Class c4 = Class.forName("com.example.demo.vo.User");
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        // hashcode值相同，说明每次创建的实例是同一个。

        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user3.hashCode());
        // hashcode值不相同，说明每次创建的实例不是同一个。
    }


}
