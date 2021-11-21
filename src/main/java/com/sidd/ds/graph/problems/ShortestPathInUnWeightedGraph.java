package com.sidd.ds.graph.problems;

import com.sidd.ds.graph.MyGraph;
import com.sidd.ds.graph.Vertex;
import com.sidd.ds.queue.MyQueueBackedByLinkedList;

import java.util.*;

public class ShortestPathInUnWeightedGraph {

    /**
     * print the distance of all vertices from source vertex
     * Use breadth first search
     * Return a map with all vertices and their distance from the source
     */
    public static Map<Vertex, Integer> shortestPathInUnWeightedGraph(MyGraph graph, Vertex source)
    {
        Map<Vertex, Integer> distanceMap = new HashMap<>();
        List<Vertex> visitedList = new ArrayList<Vertex>();
        MyQueueBackedByLinkedList<Vertex> queue = new MyQueueBackedByLinkedList<>();
        queue.insert(source);
        visitedList.add(source);
        distanceMap.put(source, 0);
        while(queue.getSize() > 0)
        {
            Vertex v = queue.poll();
            System.out.print(v.getId() + " ");
            List<Vertex> adjecentList = graph.getAdjecentVertices(v);
            if(adjecentList != null) {
                for (Vertex vv : adjecentList)
                {
                    if (!visitedList.contains(vv))
                    {
                        distanceMap.put(vv, distanceMap.get(v) + 1);
                        queue.insert(vv);
                    }
                }
            }
        }
        return distanceMap;
    }
    public static void main(String[] args)
    {
        MyGraph graph = new MyGraph();
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Vertex v5 = new Vertex(5);
        Vertex v6 = new Vertex(6);
        graph.addEdge(v1, v2);
        graph.addEdge(v1, v3);
        graph.addEdge(v1, v4);
        graph.addEdge(v3, v5);
        graph.addEdge(v5, v6);
        Map<Vertex, Integer> distanceMap = shortestPathInUnWeightedGraph(graph, v1);
    }
}
