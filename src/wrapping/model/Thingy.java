package wrapping.model;
/**
 * Creates a Thingy object and other variables.
 * @author Easton Madsen
 * @version 1.0 09/28/15
 */
public class Thingy
{
	private String name;
	private int age;
	private double weight;
	
	public Thingy()
	{
		name ="";
		age = -99;
		weight = -.008;
	}
		public Thingy(String name, int age, double weight)
		{
			//this. refers he current instance of this object(A thingy)
			this.name = name;
			this.age = age;
			this.weight = weight;
		}
		
		public String getName()
		{
			return name;
		}
		
		public int getAge()
		{
			return age;
		}
		
		public double getWeight()
		{
			return weight;
		}
}
