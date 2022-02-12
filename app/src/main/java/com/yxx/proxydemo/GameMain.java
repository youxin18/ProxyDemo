package com.yxx.proxydemo;

public class GameMain {
    public static void main(String[] args) {
        GamePlayer iGamePlayer=new GamePlayer("yx");
        GamePlayerProxy proxy=new GamePlayerProxy(iGamePlayer);
        proxy.login("admin","123456");
        proxy.upgrade();
    }
}
