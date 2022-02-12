package com.yxx.proxydemo;
//真正的鞋子类
public class RealShoes implements Shoes{
    @Override
    public void sell() {
        System.out.println("卖出了一双鞋子");
    }
}
