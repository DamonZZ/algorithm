package com.damon.algorithm.skiplist;

import java.util.Random;
import java.util.UUID;

public class SkipList {

    private Node head;
    private Node tail;
    private int level;
    private int size;
    private Random random;

    public SkipList() {
        this.level = 0;
        this.head = new Node(null);
        this.tail = new Node(null);
        this.head.right = this.tail;
        this.tail.left = this.head;
        this.size = 0;
        this.random = new Random();
    }

    public Node findFirst(Integer value) {
        Node p = this.head;
        while (true) {
            while (p.right.value != null && p.right.value <= value)
                p = p.right;
            if (p.down != null) {
                p = p.down;
            } else {
                break;
            }
        }
        return p;
    }

    public void insert(int value, String text) {
        Node current = this.findFirst(value);
        Node newNode = new Node(value, text);
        if (current.value != null && current.value == newNode.value && current.text != null && current.text.equals(newNode.text)) {
            System.out.println("value:" + value + " already exist");
        }

        newNode.right = current.right;
        newNode.left = current;
        current.right.left = newNode;
        current.right = newNode;

        int i = 0;
        while (this.random.nextDouble() < 0.5) {
            if (i >= level) {
                Node p1 = new Node(null);
                Node p2 = new Node(null);
                p1.right = p2;
                p1.down = this.head;
                p2.left = p1;
                p2.down = this.tail;
                this.head.up = p1;
                this.tail.up = p2;
                this.head = p1;
                this.tail = p2;
                this.level++;
            }


            while (current.up == null) {
                current = current.left;
            }
            current = current.up;
            Node e = new Node(value);
            e.left = current;
            e.right = current.right;
            current.right.left = e;
            current.right = e;
            e.down = newNode;
            newNode.up = e;
            newNode = e;
            i++;
        }
        this.size++;
    }

    public void display() {
        while (this.level > 0) {
            Node p = this.head;
            while (p != null) {
                System.out.print(p.value + "<-------->");
                p = p.right;
            }

            System.out.println();
//            System.out.println("*****************************");

            this.level--;
            this.head = this.head.down;
        }
    }

    public Node search(int value) {
        Node p = this.head;
        while (true) {
            while (p.right.value != null && p.right.value <= value) {
                p = p.right;
            }

            if (p.down != null) {
                p = p.down;
            } else {
                if (p.value == value) {
                    return p;
                }
                return null;
            }
        }
    }

    public void dumpAll() {
        Node p = this.head;
        while (p.down != null) {
            p = p.down;
        }

        while (p.right.value != null) {
            System.out.println(p.right.value + " ---> " + p.right.text);
            p = p.right;
        }
    }

    public void dumpAllDesc() {
        Node p = this.tail;
        while (p.down != null) {
            p = p.down;
        }

        while (p.left.value != null) {
            System.out.println(p.left.value + " ---> " + p.left.text);
            p = p.left;
        }
    }

    public void delete(int value) {
        Node p = this.search(value);
        while (p != null) {
            p.left.right = p.right;
            p.right.left = p.left;
            p = p.up;
        }
    }

    public static void main(String args[]) {
        SkipList skipList = new SkipList();
        Random random = new Random();
        skipList.insert(33, "小明");
        skipList.insert(33, "小明");
        skipList.insert(44, "小亮");
        skipList.insert(44, "小亮");
        skipList.insert(11, "小贾");
        for (int i = 0; i < 5; i++) {
            int value = (int) (random.nextDouble() * 1000);
            skipList.insert(value, UUID.randomUUID().toString());
            System.out.println(value);
        }
        Node p = skipList.search(33);
//        skipList.delete(44);
        if (p != null) {
            System.out.println(p.value);
        } else
            System.out.println("没有找到");
        skipList.display();
    }

}
