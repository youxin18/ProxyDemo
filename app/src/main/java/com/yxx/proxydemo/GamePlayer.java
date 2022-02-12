package com.yxx.proxydemo;

public class GamePlayer implements IGamePlayer{
    private String name="";
    public GamePlayer(String name){
        this.name=name;
    }

    @Override
    public void login(String user, String password) {
        System.out.println("<"+this.name+">登录了");
    }

    @Override
    public void upgrade() {
        System.out.println("<"+this.name+">升级了！");
    }
}
