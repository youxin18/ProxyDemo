package com.yxx.proxydemo;
//代理类

public class MicroSell implements Shoes{


    @Override
    public void sell() {
       RealShoes realShoes=new RealShoes();
       realShoes.sell();
       this.Wrap();

    }
    public  void Wrap(){
        System.out.println("包装好了！！！");
    }


}
