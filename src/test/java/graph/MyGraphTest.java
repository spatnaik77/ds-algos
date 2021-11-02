package graph;

import com.sidd.ds.graph.MyGraph;
import com.sidd.ds.graph.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyGraphTest {

    @Test
    public void testBreadthFirstSearch()
    {
        MyGraph graph = new MyGraph();
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
        graph.addEdge(n3, n5);
        graph.addEdge(n4, n5);
        graph.addEdge(n1, n2);
        graph.addEdge(n5, n6);

        System.out.println("-------Breadth first search---------");
        graph.breadthFirstSearch(n0);

        System.out.println("");
        System.out.println("-------Depth first search-----------");
        graph.depthFirstSearch(n0);



    }


}
