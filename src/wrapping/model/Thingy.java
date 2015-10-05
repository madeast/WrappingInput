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
	/**
	 * Sets the default for name, age, and weight. They are ridiculous values
	 */
	public Thingy()

	{
		name ="";
		age = -99;
		weight = -.008;
	}
	/**
	 * Gets the instance of objects, to use in the code.
	 * @param name
	 * @param age
	 * @param weight
	 */
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
		
		public void setName(String name)
		{
			this.name = name;
		}
		
		public void setAge(int age)
		{
			this.age = age;
		}
		
		public void setWeight(double weight)
		{
			this.weight = weight;
		}
		
}
