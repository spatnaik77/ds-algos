package com.sidd.ds.graph;

import java.util.List;

public interface IGraph {

    public void addEdge(Vertex source, Vertex target);

    public void removeEdge(Vertex v);

    public boolean isThereAnEdgeBetween( Vertex v1, Vertex v2);

    public List<Vertex> getAdjecentVertices(Vertex v);

}
