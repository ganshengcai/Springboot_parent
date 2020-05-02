

package com.gsc.dao.impl;

import com.gsc.dao.TestInterface;

public class TestInterfaceImpl implements TestInterface {
    @Override
    public void show() {
        System.out.println("接口测试输出。。。。");
    }


    public static void main(String[] args) {
        TestInterfaceImpl a = new TestInterfaceImpl();
    }
}

