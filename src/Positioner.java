
public class Positioner
{
	private Vector currentPosition;
	private Vector currentVelocity;
	public Positioner ()
	{
		currentPosition = new Vector();
		currentVelocity = new Vector();
	}
	public Positioner (int x, int y, int z)
	{
		this();
		Vector pos = new Vector(x,y,z);
		currentPosition = pos;
	}
	public Positioner (Vector pos)
	{
		this();
		currentPosition = pos;
	}
	public Vector getPosition()
	{
		return currentPosition;
	}
	public void actOnSample(Vector acceleration, double timeElapsed)
	{
		//Change velocity based on vx = v0 + at
		
	}
}
