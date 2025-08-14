package List;

import java.util.List;
import java.util.ArrayList;

public class ListExample {
	public static void main(String args[]) {
		List<String> name=new ArrayList<>();
		name.add("JOE");
		name.add("PUPPY");
		name.add("SRIJHA");
		name.add("THANYA");
		System.out.println(name);
		System.out.println(name.get(0));
		System.out.println(name);
		name.remove("JOE");
		System.out.println(name.size());
	}
}
