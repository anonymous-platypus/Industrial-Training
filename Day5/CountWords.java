import java.util.HashMap;
import java.util.Map;
public class CountWords {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		String s = "the fox and the dog" ;
		String s1[] = s.split(" ");
		for(String obj: s1)
		{
			if(map.containsKey(obj))
			{
				int k=map.get(obj);
				map.put(obj, k+1);
			}
			else
			{
				map.put(obj, 1);
			}
		}
		System.out.println(map);
	}

}
/*
Output
{the=2, and=1, dog=1, fox=1}
*/