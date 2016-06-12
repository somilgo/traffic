//Link represents the edge between Nodes (vertices) in the graph representation of the roads
public class Link {

	Node startNode;
	Node endNode;
	double length;
	
	Link (Node start, Node end, double distance)
	{
		startNode = start;
		endNode = end;
		length = distance;
	}
	
}
