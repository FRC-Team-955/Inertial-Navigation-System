
public class Vector 
{
	private final double x;
	private final double y;
	private final double z;
	public Vector()
	{
		this(0,0,0);
	}
	public Vector (double init_x, double init_y, double init_z)
	{
		x = init_x;
		y = init_y;
		z = init_z;
	}
	public double getX() 
	{
		return x;
	}
	public double getY() 
	{
		return y;
	}
	public double getZ() 
	{
		return z;
	}
	public Vector addVector(Vector other)
	{
		return new Vector(this.getX() + other.getX(), this.getY() + other.getY(), this.getZ() + other.getZ());
	}
	
}
