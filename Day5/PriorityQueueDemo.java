import java.util.*;
public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue <String> pr = new PriorityQueue<>();
		pr.add("one");
		pr.add("2two");
		pr.add("Three");
		pr.add("four");
		pr.forEach(System.out::println);
	}
}
/*
Output
2two
four
Three
one
*/