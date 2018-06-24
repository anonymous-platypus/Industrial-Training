public class StudentClass {
	private int age;
	private String name;
	public void setAge(int age)throws Exception
	{
		if(age<18)
		{
			throw new Exception();
		}
		else
		{
			this.age=age;
		}
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
}
