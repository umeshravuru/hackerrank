package oops;

public class Java_oops_encapsulation_example
{

	public static void main(String[] args)
	{

		emp e1 = new emp();

		e1.setId(1);
		e1.setName("umesh");
		//e1.name="ghjg";
		System.out.println(e1.getName());
	}

}

class emp
{

	private int Id;
	private String name;
	public int getId()
	{
		return Id;
	}
	public void setId(int id)
	{
		Id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

}
