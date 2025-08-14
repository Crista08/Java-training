package HashMap;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
public class HashMapEg {
	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		map.put("College",2377);
		map.put("Hicet", 2377);
		map.put("College",678);
		System.out.println(map.get("Hicet"));
		System.err.println(map.containsKey("College"));
		System.out.println(map);
		System.out.println(map.getOrDefault("Colle", 12377));
		int[] nums= {4,3,2,7,8,2,3,1};
		HashMap<Integer,Boolean> map1=new HashMap<>();
		List<Integer> list1=new ArrayList<>();
		for(int num:nums) {
			map1.put(num, true);
		}
		for(int i=1;i<=nums.length;i++) {
			if(!map1.containsKey(i)) {
				list1.add(i);
			}
		}
		System.out.println(list1);
		String s="success";
		HashMap<Character,Integer> map2=new HashMap<>();
		for (char c:s.toCharArray()) {
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        for (char c:map2.keySet()) {
            System.out.println(c+"-"+map2.get(c) + " ");
        }
	}
}