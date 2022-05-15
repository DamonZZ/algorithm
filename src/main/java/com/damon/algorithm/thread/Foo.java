package com.damon.algorithm.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Foo {

    // first method, or volatile
    private AtomicInteger sequence = new AtomicInteger(1);

    // second method
    private Object lock = new Object();

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        synchronized (this.lock) {
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            sequence.getAndIncrement();
            this.lock.notifyAll();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
//        while (this.sequence.get() != 2) ;

        synchronized (this.lock) {
            while (this.sequence.get() != 2) {
                this.lock.wait();
            }
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            sequence.getAndIncrement();
            this.lock.notifyAll();
        }

    }

    public void third(Runnable printThird) throws InterruptedException {
//        while (this.sequence.get() != 3) ;
        synchronized (this.lock) {
            while (this.sequence.get() != 3) {
                this.lock.wait();
            }

            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
        }
    }

}
