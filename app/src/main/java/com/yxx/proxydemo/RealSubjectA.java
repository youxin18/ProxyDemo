package com.yxx.proxydemo;

public class RealSubjectA implements SubjectA{
    @Override
    public void setUser(String name, String password) {
        System.out.println("-------set user,name:"+name+" password:"+password+"-----");
    }
}
