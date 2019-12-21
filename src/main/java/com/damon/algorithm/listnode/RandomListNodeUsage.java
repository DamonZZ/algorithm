package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.RandomListNode;

public class RandomListNodeUsage {

    public RandomListNode clone(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }

        RandomListNode currentNode = pHead;
        while (currentNode != null) {
            RandomListNode random = new RandomListNode(currentNode.label);
            random.next = currentNode.next;
            currentNode.next = random;
            currentNode = random.next;
        }

        currentNode = pHead;
        while (currentNode != null) {
            RandomListNode node = currentNode.next;
            if (currentNode.random != null) {
                node.random = currentNode.random.next;
            }
            currentNode = node.next;
        }

        currentNode = pHead;
        RandomListNode pCloneHead = pHead.next;
        while (currentNode != null) {
            RandomListNode cloneNode = currentNode.next;
            currentNode.next = cloneNode.next;
            cloneNode.next = cloneNode.next == null ? null : cloneNode.next.next;
            currentNode = currentNode.next;
        }

        return pCloneHead;
    }

}
