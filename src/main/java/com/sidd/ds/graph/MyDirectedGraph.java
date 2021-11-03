package com.sidd.ds.graph;

import com.sidd.ds.queue.MyQueueBackedByLinkedList;
import com.sidd.ds.stack.MyStackBackedByArray;
import com.sidd.ds.stack.MyStackBackedByLinkedList;

import java.util.*;

public class MyDirectedGraph {

    private Map<Node, List<Node>> graph;

    public MyDirectedGraph()
    {
        graph = new HashMap<Node, List<Node>>();
    }
    public void addEdge(Node source, Node target)
    {
        List<Node> adj = graph.get(source);
        if(adj == null)
        {
            adj = new ArrayList<>();
            graph.put(source, adj);
            adj.add(target);
        }
        else
        {
            adj.add(target);
        }
    }
    public String breadthFirstSearch(Node start)
    {
        StringBuffer result = new StringBuffer();

        MyQueueBackedByLinkedList<Node> queue = new MyQueueBackedByLinkedList<Node>();
        queue.insert(start);
        while(queue.getSize() > 0)
        {
            Node n = queue.poll();
            //Visit
            if(! n.isVisited())
            {
                //System.out.print(n + "-->");
                result.append(n.getId());
                n.setVisited(true);
                List<Node> adjList = graph.get(n);
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
        return result.toString();
    }
    /*
    Do a breadth first search by starting from source. If u encounter target, return true
     */
    public boolean isConnected(Node source, Node target)
    {
        boolean isConnected = false;
        MyQueueBackedByLinkedList<Node> queue = new MyQueueBackedByLinkedList<Node>();
        queue.insert(source);
        while(queue.getSize() > 0)
        {
            Node n = queue.poll();
            //Visit
            if(! n.isVisited())
            {
                if(target == n)
                {
                    isConnected = true;
                    break;
                }
                n.setVisited(true);
                List<Node> adjList = graph.get(n);
                if(adjList != null)
                {
                    for (Node nn : adjList)
                    {
                        queue.insert(nn);
                    }
                }
            }
        }
        reset(source);
        return isConnected;
    }
    /*public String getShortestPath(Node source, Node target)
    {
        StringBuffer result = new StringBuffer();

        MyQueueBackedByLinkedList<Node> queue = new MyQueueBackedByLinkedList<Node>();
        queue.insert(source);
        while(queue.getSize() > 0)
        {
            Node n = queue.poll();
            //Visit
            if(! n.isVisited())
            {
                result.append(n.getId());
                if(n.getId() == target.getId())
                {
                    break;
                }
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
        reset(source);//reset all the nodes with visited to false
        return result.toString();
    }*/

    public String depthFirstSearch(Node start)
    {
        StringBuffer result = new StringBuffer();

        MyStackBackedByLinkedList<Node> stack = new MyStackBackedByLinkedList();
        stack.push(start);
        while(stack.getSize() > 0)
        {
            Node n = stack.pop();
            //Visit
            if(! n.isVisited())
            {
                //System.out.print(n + "-->");
                result.append(n.getId());
                n.setVisited(true);
                List<Node> adjList = graph.get(n);
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
        return result.toString();
    }
    public String depthFirstSearchUsingRecursion(Node start)
    {
        StringBuffer result = new StringBuffer();
        depthFirstSearchUsingRecursionUtil(start, result);
        reset(start);//reset all the nodes with visited to false
        return result.toString();
    }
    private void depthFirstSearchUsingRecursionUtil(Node n, StringBuffer result)
    {
        if(! n.isVisited())
        {
            System.out.print(n + "-->");
            result.append(n.getId());
            n.setVisited(true);
            List<Node> adjList = graph.get(n);
            if(adjList != null)
            {
                for (Node nn : adjList)
                {
                    depthFirstSearchUsingRecursionUtil(nn, result);
                }
            }
        }
    }
    public String topologicalSort()
    {
        return null;
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
