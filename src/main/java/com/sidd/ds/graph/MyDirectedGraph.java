package com.sidd.ds.graph;

import com.sidd.ds.queue.MyQueueBackedByLinkedList;
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
            if(target != null) {
                adj.add(target);
            }
        }
        else
        {
            adj.add(target);
        }
    }
    public String breadthFirstSearch(Node start)
    {
        StringBuffer result = new StringBuffer();
        List<Node> visitedList = new ArrayList<Node>();

        MyQueueBackedByLinkedList<Node> queue = new MyQueueBackedByLinkedList<Node>();
        queue.insert(start);
        while(queue.getSize() > 0)
        {
            Node n = queue.poll();
            //Visit
            if(!visitedList.contains(n))
            {
                //System.out.print(n + "-->");
                result.append(n.getId());
                visitedList.add(n);
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
        return result.toString();
    }
    /*
    Do a breadth first search by starting from source. If u encounter target, return true
     */
    public boolean isConnected(Node source, Node target)
    {
        List<Node> visitedList = new ArrayList<Node>();
        boolean isConnected = false;
        MyQueueBackedByLinkedList<Node> queue = new MyQueueBackedByLinkedList<Node>();
        queue.insert(source);
        while(queue.getSize() > 0)
        {
            Node n = queue.poll();
            //Visit
            if(!visitedList.contains(n))
            {
                if(target == n)
                {
                    isConnected = true;
                    break;
                }
                visitedList.add(n);
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
        return isConnected;
    }
    public String depthFirstSearchUsingStack(Node start)
    {
        List<Node> visitedList = new ArrayList<Node>();
        StringBuffer result = new StringBuffer();

        MyStackBackedByLinkedList<Node> stack = new MyStackBackedByLinkedList();
        stack.push(start);
        while(stack.getSize() > 0)
        {
            Node n = stack.pop();
            //Visit
            if(!visitedList.contains(n))
            {
                //System.out.print(n + "-->");
                result.append(n.getId());
                visitedList.add(n);
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
        return result.toString();
    }
    public String depthFirstSearch(Node start)
    {
        List<Node> visitedList = new ArrayList<Node>();
        StringBuffer result = new StringBuffer();
        depthFirstSearchRecursionInternal(start, result, visitedList);
        return result.toString();
    }
    private void depthFirstSearchRecursionInternal(Node n, StringBuffer result, List<Node> visitedList)
    {
        if(!visitedList.contains(n))
        {
            //System.out.print(n + "-->");
            result.append(n.getId());
            visitedList.add(n);
            List<Node> adjList = graph.get(n);
            if(adjList != null)
            {
                for (Node nn : adjList)
                {
                    depthFirstSearchRecursionInternal(nn, result, visitedList);
                }
            }
        }
    }

    public String topologicalSort(Node start)
    {
        StringBuffer result = new StringBuffer();
        List<Node> visitedList = new ArrayList<Node>();
        Stack<Node> resultStack = new Stack<>();
        topologicalInternal(start, visitedList, resultStack);

        while(!resultStack.isEmpty())
        {
            result.append(resultStack.pop().getId());
        }
        return result.toString();
    }
    public void topologicalInternal(Node node, List<Node> visitedList, Stack<Node> stack)
    {
        visitedList.add(node);
        List<Node> adjList = graph.get(node);
        if(adjList != null)
        {
            for (Node n : adjList)
            {
                if(!visitedList.contains(n))
                {
                    topologicalInternal(n, visitedList, stack);
                }
            }
        }
        stack.push(node);
    }
}
