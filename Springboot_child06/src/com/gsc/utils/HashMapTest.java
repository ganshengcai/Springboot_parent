package com.gsc.utils;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String,String > map = new HashMap<>();
        map.put("a","zhangsan");
        map.put("b", "zhangyi");
        map.put("c", "zhanger");
        map.put("d", "zhangwu");
        map.put("e", "zhangliu");

        String a = map.get("a");
        System.out.println("key:a  value:"+a);

        int size = map.size();
        System.out.println("map的大小："+size);

        boolean b1 = map.containsKey("aa");
        boolean b2 = map.containsKey("a");
        System.out.println("map中是否包含aa: " +b1);
        System.out.println("map中是否包含a:" + b2);

        boolean b3 = map.containsValue("zhangsan");
        boolean b4 = map.containsValue("zz");
        System.out.println("map中是否包含zhangsan:" + b3);
        System.out.println("map中是否包含zz: " +b4);

        boolean b5 = map.isEmpty();
        System.out.println("map中是否为空：" + b5);

        String b6 = map.remove("a");
        System.out.println("删除map中key为a的健值对，值为：" + b6);

        for(String key: map.keySet()) {
            System.out.println("key为：" + key + "，值为：" +map.get(key));
        }
    }
}
