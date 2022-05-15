package com.damon.algorithm.thread;

public class FooThread {

    public static void main(String[] args) throws InterruptedException {

        Foo foo = new Foo();

        Runnable printFirst = () -> {
            System.out.println(Thread.currentThread().getName() + ": First");
        };

        Runnable printSecond = () -> {
            System.out.println(Thread.currentThread().getName() + ": Second");
        };

        Runnable printThird = () -> {
            System.out.println(Thread.currentThread().getName() + ": Third");
        };


        new Thread(() -> {
            try {
                foo.third(printThird);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "a").start();

        new Thread(() -> {
            try {
                foo.first(printFirst);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "b").start();

        new Thread(() -> {
            try {
                foo.second(printSecond);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "c").start();

        Thread.sleep(1000);

        ThreadLocal threadLocal = new ThreadLocal();
        threadLocal.set("123");
        threadLocal.get();
    }

}
