package com.sidd.ds.graph;

import com.sidd.ds.queue.MyQueueBackedByLinkedList;
import com.sidd.ds.stack.MyStackBackedByArray;
import com.sidd.ds.stack.MyStackBackedByLinkedList;

import java.util.*;

public class MyGraph {

    private Map<Integer, List<Node>> graph;

    public MyGraph()
    {
        graph = new HashMap<Integer, List<Node>>();
    }
    public void addEdge(Node source, Node target)
    {
        List<Node> adj = graph.get(source.getId());
        if(adj == null)
        {
            adj = new ArrayList<>();
            graph.put(source.getId(), adj);
            adj.add(target);
        }
        else
        {
            adj.add(target);
        }
    }
    public void breadthFirstSearch(Node start)
    {
        MyQueueBackedByLinkedList<Node> queue = new MyQueueBackedByLinkedList<Node>();
        queue.insert(start);
        while(queue.getSize() > 0)
        {
            Node n = queue.poll();
            //Visit
            if(! n.isVisited())
            {
                System.out.print(n + "-->");
                n.setVisited(true);
                List<Node> adjList = graph.get(n.getId());
                if(adjList != null)
                {
                    for (Node nn : adjList)
                    {
                        queue.insert(nn);
                    }
                }
            }
        }
        reset(start);
    }
    public void depthFirstSearch(Node start)
    {
        MyStackBackedByLinkedList<Node> stack = new MyStackBackedByLinkedList();
        stack.push(start);
        while(stack.getSize() > 0)
        {
            Node n = stack.pop();
            //Visit
            if(! n.isVisited())
            {
                System.out.print(n + "-->");
                n.setVisited(true);
                List<Node> adjList = graph.get(n.getId());
                if(adjList != null)
                {
                    for (Node nn : adjList)
                    {
                        stack.push(nn);
                    }
                }
            }
        }
        reset(start);
    }
    private void reset(Node start)
    {
        start.setVisited(false);
        Collection<List<Node>> data = graph.values();
        for(List<Node> l : data)
        {
            for(Node n : l)
            {
                n.setVisited(false);
            }
        }

    }

}
