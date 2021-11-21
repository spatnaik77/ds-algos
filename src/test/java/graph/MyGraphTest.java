package graph;

import com.sidd.ds.graph.IGraph;
import com.sidd.ds.graph.MyGraph;
import com.sidd.ds.graph.Vertex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyGraphTest {

    @Test
    public void testBasicGraphOperation()
    {
        IGraph graph = new MyGraph();
        Vertex n0 = new Vertex(0);
        Vertex n1 = new Vertex(1);
        Vertex n2 = new Vertex(2);
        Vertex n3 = new Vertex(3);
        Vertex n4 = new Vertex(4);
        Vertex n5 = new Vertex(5);
        Vertex n6 = new Vertex(6);

        graph.addEdge(n0, n1);
        graph.addEdge(n0, n3);
        graph.addEdge(n0, n4);
        graph.addEdge(n1, n2);
        graph.addEdge(n2, null);
        graph.addEdge(n3, n5);
        graph.addEdge(n4, n5);
        graph.addEdge(n5, n6);
        graph.addEdge(n6, null);

        Assertions.assertEquals(3, graph.getAdjecentVertices(n0).size());

        Assertions.assertTrue(graph.isThereAnEdgeBetween(n0, n1));
        Assertions.assertFalse(graph.isThereAnEdgeBetween(n0, n2));

    }
    @Test
    public void testSearch()
    {
        //See graph1.png
        MyGraph graph = new MyGraph();
        Vertex n0 = new Vertex(0);
        Vertex n1 = new Vertex(1);
        Vertex n2 = new Vertex(2);
        Vertex n3 = new Vertex(3);
        Vertex n4 = new Vertex(4);
        Vertex n5 = new Vertex(5);
        Vertex n6 = new Vertex(6);

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
    }
}
