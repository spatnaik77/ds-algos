package com.sidd.ds.graph.problems;

import com.sidd.ds.graph.MyGraph;
import com.sidd.ds.graph.Vertex;

import java.util.ArrayList;
import java.util.List;

public class DetectCycleInUndirectedGraph {

    /**
     * Can be solved either using breadth first or depth first. Here we will use depth first
     */
    public static boolean DetectCycleInUndirectedGraph(MyGraph graph, Vertex start)
    {
        List<Vertex> visitedVertices = new ArrayList<Vertex>();

        return depthRecursive(graph, visitedVertices, start, null,false);

    }
    private static boolean depthRecursive(MyGraph graph,List<Vertex> visitedVertices, Vertex vertex, Vertex parentVertex, boolean result)
    {
        //Visit the vertex
        System.out.print(vertex.getId() + " ");
        visitedVertices.add(vertex);
        List<Vertex> adjecentVertices = graph.getAdjecentVertices(vertex);
        for(Vertex v : adjecentVertices)
        {
            if(!visitedVertices.contains(v))
            {
                result = depthRecursive(graph, visitedVertices, v, vertex, result);
            }
            else
            {
                if(parentVertex != v) {
                    //Cycle detected
                    result = true;
                    break;
                }

            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        MyGraph graph = new MyGraph();
        Vertex v0 = new Vertex(0);
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        graph.addEdge(v0, v1);
        graph.addEdge(v1, v2);
        graph.addEdge(v1, v3);
        graph.addEdge(v2, v3);
        graph.addEdge(v2, v1);
        graph.addEdge(v3, v1);
        graph.addEdge(v3, v2);

        boolean result = DetectCycleInUndirectedGraph(graph, v0);
        System.out.println("Expected: true. Actual: " + result);

        graph = new MyGraph();
        v0 = new Vertex(0);
        v1 = new Vertex(1);
        graph.addEdge(v0, v1);
        graph.addEdge(v1, v0);
        result = DetectCycleInUndirectedGraph(graph, v0);
        System.out.println("Expected: False. Actual: " + result);

        graph = new MyGraph();
        v0 = new Vertex(0);
        v1 = new Vertex(1);
        v2 = new Vertex(2);
        v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        graph.addEdge(v0, v1);
        graph.addEdge(v1, v0);
        graph.addEdge(v1, v2);
        graph.addEdge(v1, v4);
        graph.addEdge(v2, v1);
        graph.addEdge(v2, v3);
        graph.addEdge(v3, v2);
        graph.addEdge(v4, v1);
        result = DetectCycleInUndirectedGraph(graph, v0);
        System.out.println("Expected: False. Actual: " + result);



    }

}
