public class Car
{
	private Node startNode;
	private Node endNode;
	private double speedFactor;
	private double accidentRisk;
	private double speed;
	private Link currentLink;
	private double elapsedTime;
	private double node_distance;
	private boolean usingGPS;
	private double timeStep;
	//Is there a better way to get the timeStep into the class?

	//Add getters and setters
	//might need special getters/setters - for example add elapsed time at traffic light node

	public Car(int startNode, int endNode, double speedFactor, double accidentRisk, boolean usingGPS, double timeStep)
	{
		this.startNode = startNode;
		this.endNode = endNode;
		this.speedFactor = speedFactor;
		this.accidentRisk = accidentRisk;
		this.usingGPS = usingGPS;
		this.timeStep = timeStep;
	}

	public void Step (double timeStep, double speed)
	{
		node_distance -= timeStep * speed;
		elapsedTime += timeStep;
		//Don't like using float arithmatic - should fix later
	}

	public boolean nextNode (double node_distance)
	{
		if ((int) Math.floor(node_distance) <= 0)
		{
			return true;
		}

		return false;
	}

	public boolean finalLink (Link currentLink)
	{
		//if currentLink end node == endNode
		//return true
		//else
		//return false
	}

	public void setSpeed (double speedFactor, Link currentLink)
	{
		//get speed (current average speed) from current link, modify by speed factor, randomize
	}

	public boolean accidentOccurs (double accidentRisk, Link currentLink)
	{
		//some kind of combination between car accident risk and link accident risk
	}

}