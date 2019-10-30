package com.lancer.threads;

public class Sister implements Runnable {
    @Override
    public void run() {
        System.out.println("女儿拿走了苹果");
    }
}
