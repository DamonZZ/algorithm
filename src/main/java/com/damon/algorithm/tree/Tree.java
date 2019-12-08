package com.damon.algorithm.tree;

import com.damon.algorithm.entity.Node;

public interface Tree {

    public Node find(int key);

    public boolean insert(int key);

    public boolean delete(int key);

}
