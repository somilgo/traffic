//Link represents the edge between Nodes (vertices) in the graph representation of the roads
public class Link {


	private Node[] startEnd = new Node[2];
	private ArrayList<Car> cars;
	private double length;
	//double speed_limit
	private double meanTargetSpeed;
	private double meanCurrentSpeed;
	private double capacity;
	private double accident_risk;
	private boolean has_accident;
	private double accident_location; 
	private int laneCount;


	//constructor - needs editing 
	Link (Node start, Node end, double distance)
	{
		startEnd[0]= start;
		startEnd[1] = end;
		length = distance;
	}

	//getters and setters - needs editing
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

	//real methods
	
	public currentSpeedCalc(ArrayList<Car> cars, double length, double meanTargetSpeed, double capacity)
	{
		//Calculate currentMeanSpeed using model shown in my dad's paper.
	}
	
}
