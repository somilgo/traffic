import java.util.ArrayList;

//Node represents a vertex on the graph representation of the road structure
public class Node 
{
	
	ArrayList<Link> links;
	double delay;
	
	Node ()
	{
		links = new ArrayList<Link>();
		delay = 0;
	}
	
	Node (double currentDelay)
	{
		links = new ArrayList<Link>();
		delay = currentDelay;
	}

	private void addLink (Link addedLink)
	{
		links.add(addedLink);
	}
}
