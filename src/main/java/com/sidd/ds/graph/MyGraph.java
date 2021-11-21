package com.sidd.ds.graph;

import com.sidd.ds.queue.MyQueueBackedByLinkedList;
import com.sidd.ds.stack.MyStackBackedByLinkedList;

import java.util.*;

public class MyGraph implements IGraph{

    private Map<Vertex, List<Vertex>> graph;

    public MyGraph()
    {
        graph = new HashMap<Vertex, List<Vertex>>();
    }

    public void addEdge(Vertex source, Vertex target)
    {
        List<Vertex> adj = graph.get(source);
        if(adj == null)
        {
            adj = new ArrayList<>();
            graph.put(source, adj);
            if(target != null) {
                adj.add(target);
            }
        }
        else
        {
            adj.add(target);
        }
    }
    @Override
    public void removeEdge(Vertex v)
    {
        //NOT IMPLEMENTED
    }

    @Override
    public boolean isThereAnEdgeBetween(Vertex v1, Vertex v2)
    {
        List<Vertex> vertices = graph.get(v1);
        if(vertices != null || vertices.size() > 0)
        {
            if(vertices.contains(v2))
                return true;
            else
                return false;
        }
        else {
            return false;
        }
    }

    @Override
    public List<Vertex> getAdjecentVertices(Vertex v) {
        return graph.get(v);
    }

    public String breadthFirstSearch(Vertex start)
    {
        StringBuffer result = new StringBuffer();
        List<Vertex> visitedList = new ArrayList<Vertex>();

        MyQueueBackedByLinkedList<Vertex> queue = new MyQueueBackedByLinkedList<Vertex>();
        queue.insert(start);
        while(queue.getSize() > 0)
        {
            Vertex n = queue.poll();
            //Visit
            if(!visitedList.contains(n))
            {
                //System.out.print(n + "-->");
                result.append(n.getId());
                visitedList.add(n);
                List<Vertex> adjList = graph.get(n);
                if(adjList != null)
                {
                    for (Vertex nn : adjList)
                    {
                        queue.insert(nn);
                    }
                }
            }
        }
        return result.toString();
    }
    public String depthFirstSearchUsingStack(Vertex start)
    {
        List<Vertex> visitedList = new ArrayList<Vertex>();
        StringBuffer result = new StringBuffer();

        MyStackBackedByLinkedList<Vertex> stack = new MyStackBackedByLinkedList();
        stack.push(start);
        while(stack.getSize() > 0)
        {
            Vertex n = stack.pop();
            //Visit
            if(!visitedList.contains(n))
            {
                //System.out.print(n + "-->");
                result.append(n.getId());
                visitedList.add(n);
                List<Vertex> adjList = graph.get(n);
                if(adjList != null)
                {
                    for (Vertex nn : adjList)
                    {
                        stack.push(nn);
                    }
                }
            }
        }
        return result.toString();
    }
    public String depthFirstSearch(Vertex start)
    {
        List<Vertex> visitedList = new ArrayList<Vertex>();
        StringBuffer result = new StringBuffer();
        depthFirstSearchRecursive(start, result, visitedList);
        return result.toString();
    }
    private void depthFirstSearchRecursive(Vertex n, StringBuffer result, List<Vertex> visitedList)
    {
        if(!visitedList.contains(n))
        {
            //System.out.print(n + "-->");
            result.append(n.getId());
            visitedList.add(n);
            List<Vertex> adjList = graph.get(n);
            if(adjList != null)
            {
                for (Vertex nn : adjList)
                {
                    depthFirstSearchRecursive(nn, result, visitedList);
                }
            }
        }
    }


}
