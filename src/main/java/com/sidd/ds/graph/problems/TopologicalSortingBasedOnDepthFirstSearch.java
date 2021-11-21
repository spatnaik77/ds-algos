package com.sidd.ds.graph.problems;

import com.sidd.ds.graph.MyGraph;
import com.sidd.ds.graph.Vertex;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TopologicalSortingBasedOnDepthFirstSearch
{
    public static void main(String[] args) {
        //See topological_sort.png
        MyGraph graph = new MyGraph();
        Vertex n0 = new Vertex(0);
        Vertex n1 = new Vertex(1);
        Vertex n2 = new Vertex(2);
        Vertex n3 = new Vertex(3);
        Vertex n4 = new Vertex(4);
        graph.addEdge(n0, n1);
        graph.addEdge(n0, n4);
        graph.addEdge(n0, n3);
        graph.addEdge(n1, n2);
        graph.addEdge(n4, n2);
        graph.addEdge(n3, n4);
        System.out.println("-------Topological sorting---------");
        System.out.println(topologicalSort(graph, n0));
    }
    public static String topologicalSort(MyGraph graph, Vertex start)
    {
        StringBuffer result = new StringBuffer();
        List<Vertex> visitedList = new ArrayList<Vertex>();
        Stack<Vertex> resultStack = new Stack<>();
        topologicalSortRecursive(graph, start, visitedList, resultStack);

        while(!resultStack.isEmpty())
        {
            result.append(resultStack.pop().getId());
        }
        return result.toString();
    }
    private static void topologicalSortRecursive(MyGraph graph, Vertex vertex, List<Vertex> visitedList, Stack<Vertex> stack)
    {
        visitedList.add(vertex);
        List<Vertex> adjList = graph.getAdjecentVertices(vertex);
        if(adjList != null)
        {
            for (Vertex n : adjList)
            {
                if(!visitedList.contains(n))
                {
                    topologicalSortRecursive(graph, n, visitedList, stack);
                }
            }
        }
        stack.push(vertex);
    }
}
