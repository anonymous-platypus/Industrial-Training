public class Person {
	private String fname;
	private String lname;
	private int age;
	
	Person(String fn, String ln, int a)
	{
		this.fname = fn;
		this.lname = ln;
		this.age = a;
	}
	
	@Override
	public String toString() {
		return "Person {"+"fname= " + this.fname +  ", " +"lname= " + this.lname +  ", " + "age = " + this.age + " }";
	}
	
	public boolean equals(Object obj)
	{
		Person obj1 = (Person)obj;
		if (this.fname.equals(obj1.fname)) 
			return true;
		return false;
					
	}

	public static void main(String[] args) {
		Person p1 = new Person("Jon", "Snow", 20);
		System.out.println(p1.toString());
		System.out.println(p1.hashCode());
		Person p2 = new Person("Jon", "Stark", 45);
		System.out.println(p2.toString());
		
		System.out.println(p1.equals(p2));
		Person p3 = p1;
		System.out.println(p1.equals(p3));

	}

}
/*
Output
Person {fname= Jon, lname= Snow, age = 20 }
2018699554
Person {fname= Jon, lname= Stark, age = 45 }
true
true
*/