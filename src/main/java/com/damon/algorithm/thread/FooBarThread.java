package com.damon.algorithm.thread;

public class FooBarThread {

    public static void main(String[] args) throws InterruptedException {
        FooBar fooBar = new FooBar(3);

        Runnable printFoo = () -> {
            System.out.println(Thread.currentThread().getName() + ": Foo");
        };

        Runnable printBar = () -> {
            System.out.println(Thread.currentThread().getName() + ": Bar");
        };

        new Thread(() -> {
            try {
                fooBar.foo(printFoo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "a").start();

        new Thread(() -> {
            try {
                fooBar.bar(printBar);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "b").start();

        Thread.sleep(1000);
    }

}
