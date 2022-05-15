package com.damon.algorithm.thread;

public class FooBar {
    private int n;

    private Object lock = new Object();
    private volatile boolean isFooExec = false;

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            synchronized (this.lock) {
                while (this.isFooExec) {
                    this.lock.wait();
                }
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                this.isFooExec = true;
                this.lock.notify();
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            synchronized (this.lock) {
                while (!this.isFooExec) {
                    this.lock.wait();
                }
                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
                this.isFooExec = false;
                this.lock.notify();
            }
        }
    }
}
