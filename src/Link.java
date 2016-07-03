//Link represents the edge between Nodes (vertices) in the graph representation of the roads
public class Link {

	Node startNode;
	Node endNode;
	double length;
	//added attributes
	double speed_limit
	double speed
	int capacity 
	// double accident_risk(x,v)
	boolean has_accident
	double accident_location 


	
	Link (Node start, Node end, double distance)
	{
		startNode = start;
		endNode = end;
		length = distance;
	}

	public double getLength(){
		return this.length;

	}
	public double speed_limit(){
		return this.speed_limit;
	}
	public int capacity(){
		return this.capacity;
	}
	public boolean has_accident(){
		return this.has_accident;
	}

	public double accident_risk(x,v){
		//modify this:
		
		return 0;
	}
	
}
