public class Main
{
	public static void main(String args[])
	{
		Singleton obj=Singleton.getObj();
		System.out.println("hashcode Obj = "+obj.hashCode());
		Singleton obj1=Singleton.getObj();
		System.out.println("hashcode Obj 1 = "+obj1.hashCode());
	}
}