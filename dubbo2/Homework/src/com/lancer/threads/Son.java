package com.lancer.threads;

public class Son implements Runnable{
    @Override
    public void run() {
        System.out.println("儿子拿走了橘子");
    }
}
