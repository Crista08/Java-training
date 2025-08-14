package ArrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		list.add("CSE");
		list.add("IT");
		list.add("AIML");
		list.add("AIDS");
		list.add("MECH");
		list.add("ECE");
		list.add("AGRI");
		list.add("BME");
		System.out.println(list);
		list.removeIf(lists ->lists.length()%2==0);
		System.out.println(list);
	}
}