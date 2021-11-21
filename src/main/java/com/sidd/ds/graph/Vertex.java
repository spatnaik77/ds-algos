package com.sidd.ds.graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private int id;


    public Vertex(int id) {
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
