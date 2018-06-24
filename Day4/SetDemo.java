import java.util.Set;
import java.util.HashSet;
public class SetDemo {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("Hello");
		set.add("Hello");
		set.add("World");
		for (Object o : set) {
			System.out.println(o);
		}
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