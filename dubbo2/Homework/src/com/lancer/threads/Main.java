package com.lancer.threads;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Main {

    ArrayList<String> plate=new ArrayList<>();
    //每次只有一个线程拿到盘子
    Semaphore mutex=new Semaphore(1);
    Mom mom=new Mom();
    Dad dad=new Dad();
    Thread son=new Thread(new Son());
    Thread sis=new Thread(new Sister());

    public static void main(String[] args){

    }

    public void get() throws InterruptedException {
        while (plate.size()==1){
            try {
                mutex.acquire();

            }finally {
                mutex.release();
            }
        }
    }

    public  void put() throws InterruptedException {
        while (plate.size()==0){
            try {
                //锁住盘子
                mutex.acquire();
                if ((int)Math.random()*2!=0){
                    dad.putApple();
                    plate.add("apple");
                }
                else {
                    mom.putOrange();
                    plate.add("orange");
                }
            }finally {
                mutex.release();
            }
        }
    }
}
