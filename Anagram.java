package Collections;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr={"eat","tea","tan","ate","nat","bat"};
		HashMap<String,List<String>> map=new HashMap<>();
		for(String word:arr) {
			char[] ch=word.toCharArray();
			Arrays.sort(ch);
			String list=new String(ch);
			if(!map.containsKey(list)) {
				map.put(list,new ArrayList<>());
			}
			map.get(list).add(word);
		}
		List<List<String>> res=new ArrayList<>(map.values());
		System.out.println(res);
	}

}
