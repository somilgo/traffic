import java.util.ArrayList;

//Node represents a vertex on the graph representation of the roads' structure
public abstract class Node 
{
	
	private ArrayList<Node> connected_nodes;
	private ArrayList<Link> links;
	private boolean has_accident;
	private double size;
	private double pass_through_time;
	// private double random_transit_prob;


	
	Node ()
	{
		connected_nodes = new ArrayList<Node>();
		links = new ArrayList<Link>();
		has_accident = false;
		size = -1;
		pass_through_time = -1;

		
	}
	
	/*
	Discuss other constructors

	*/

	private void addNode(Node addedNode) {
		// Rewrite later based off of adj matrix


		connected_nodes.add(addedNode);
	}
	private ArrayList<Node> helperNode(int[][] adjmatrix, int row){
		//write later
		output = new ArrayList<Node>();
		
		for j in adjmatri[row][]:
			if(j!=0 && adjmatrix[row][j]):
				output.add(Node((String)(adjmatrix[row][j])));
		// return output

		return -1;
	}



	private void addLink (Link addedLink)
	{
		links.add(addedLink);
	}

	private boolean incurAccident(){
		has_accident = True;
	}
	private boolean removeAccident(){
		has_accident = False;
	}

	private double getSize(){

		return size;
	}
	private double getPassTime(){
		return pass_through_time;
	}

}
