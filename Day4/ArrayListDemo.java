import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo {
	public static void main(String[] args) {
		List data = new ArrayList();
		data.add(7.6f);
		data.add("Hello");
		data.add(007);
		data.add(true);
		System.out.println(data);
		System.out.println(data.get(0));		
		for (Object o: data) {
			System.out.println(o);
		}
		
	
	}

}
/*
Output
[7.6, Hello, 7, true]
7.6
7.6
Hello
7
true
*/