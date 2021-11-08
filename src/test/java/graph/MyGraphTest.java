package graph;

import com.sidd.ds.graph.MyDirectedGraph;
import com.sidd.ds.graph.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyGraphTest {

    @Test
    public void testSearch()
    {
        //See graph1.png
        MyDirectedGraph graph = new MyDirectedGraph();
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        graph.addEdge(n0, n1);
        graph.addEdge(n0, n3);
        graph.addEdge(n0, n4);
        graph.addEdge(n1, n2);
        graph.addEdge(n2, null);
        graph.addEdge(n3, n5);
        graph.addEdge(n4, n5);
        graph.addEdge(n5, n6);
        graph.addEdge(n6, null);


        System.out.println("-------Breadth first search---------");
        Assertions.assertEquals("0134256", graph.breadthFirstSearch(n0));

        System.out.println("");
        System.out.println("-------Depth first search-----------");
        Assertions.assertEquals("0456312", graph.depthFirstSearchUsingStack(n0));

        System.out.println("");
        System.out.println("-------Depth first search using recursion-----------");
        Assertions.assertEquals("0123564", graph.depthFirstSearch(n0));

        // *********IsConnected()*************************
        Assertions.assertTrue(graph.isConnected(n0, n1));
        Assertions.assertTrue(graph.isConnected(n0, n2));
        Assertions.assertTrue(graph.isConnected(n4, n6));
        Assertions.assertFalse(graph.isConnected(n1, n6));
        Assertions.assertFalse(graph.isConnected(n2, n6));

    }
    @Test
    public void testTopologicalSorting()
    {
        //See topological_sort.png
        MyDirectedGraph graph = new MyDirectedGraph();
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        graph.addEdge(n0, n1);
        graph.addEdge(n0, n4);
        graph.addEdge(n0, n3);
        graph.addEdge(n1, n2);
        graph.addEdge(n4, n2);
        graph.addEdge(n3, n4);
        System.out.println("-------Topological sorting---------");
        System.out.println(graph.topologicalSort(n0));
    }
}
