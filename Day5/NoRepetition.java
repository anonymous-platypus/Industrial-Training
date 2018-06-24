import java.util.*;
public class NoRepetition {
	public static void main(String[] args) {
		String s = "the fox and the dog";
		String s1[] = s.split(" ");
		Set set = new HashSet();
		for(String s2: s1)
		{
			set.add(s2);
		}
		for(Object obj: set)
		{
			System.out.print(obj+" ");
		}
	}

}
/*
Output
the and dog fox 
*/