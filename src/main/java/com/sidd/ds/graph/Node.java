package com.sidd.ds.graph;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private int id;
    private boolean visited;

    public Node(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setVisited(boolean val)
    {
        visited = val;
    }

    public boolean isVisited() {
        return visited;
    }

    @Override
    public String toString() {
        return "" + id;
    }
}
