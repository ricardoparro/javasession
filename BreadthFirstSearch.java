import java.util.List;
import java.util.Queue;
import java.util.ArrayList;

public class BreadthFirstSearch{
    
    private static void main(){
	
	List<Node> nodes = getList();
	Graph graph = new Graph(nodes);
	
	
    }

    private static List<Node> getList(){
	
	List<Node> nodes = new ArrayList<Node>();
	Node a = new Node('A', true);
	Node b = new Node('B', false);
	Node f = new Node('F', false);
	Node g = new Node('G', false);
	b.vertices = new ArrayList<Node>();
	b.vertices.add(f);
	b.vertices.add(g);
	
	Node c = new Node('C', false);
	Node d = new Node('D', false);
	a.vertices = new ArrayList<Node>();
	a.vertices.add(b);
	a.vertices.add(c);
	a.vertices.add(d);
	a.vertices.add(g);
		       
	return nodes;
    }
    
}



class Graph{
    
    List<Node> nodes;
    Node root;

    public Graph(List<Node> nodes){
	this.nodes = nodes;
    }
}

class Node{
    
    char value;
    boolean isRoot;
    boolean visited = false;
    List<Node> vertices;
    
    public Node(char value, boolean isRoot ){
	this.value = value;
	this.isRoot = isRoot;
    }
}

