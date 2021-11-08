package com.sidd.ds.graph;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private int id;


    public Node(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "" + id;
    }
}
