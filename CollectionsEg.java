package CollectionProblems;
import java.util.Collections;
import java.util.LinkedList;

public class CollectionsEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<>();
		int k=50;
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		//sum all the elements in the list
		System.out.println(list);
		int sum=0;
		for(int n:list) {
			sum+=n;
		}
		System.out.println(sum);
		//print the secMax
		int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for(int n:list) {
            if(n>max) {
                secMax=max;
                max=n;
            } else if(n>secMax&&n!=max) {
                secMax=n;
            }
        }
        System.out.println(secMax);
        //if average is greater than secMAx print list in reverse else print list
		if(sum/list.size()>secMax) {
			Collections.reverse(list);
			System.out.println(list);
		}else {
			System.out.println(list);
		}
		//if k is in list remove k element and print all else remove all element in list
		if(list.contains(k)) {
			list.remove(Integer.valueOf(k));
			System.out.println(list);
		}else {
			System.out.println();
		}
		//reverse the words in the sentence
		LinkedList<String> list1=new LinkedList<>();
		list1.add("Better");
		list1.add("than");
		list1.add("Yesterday");
		System.out.println(list1+" ");
		Collections.reverse(list1);
		System.out.println(list1);
		//k times even number rotation
		LinkedList<Integer> list2=new LinkedList<>();
		LinkedList<Integer> list3=new LinkedList<>();
		
		int k2=2;
		list2.add(2);
		list2.add(5);
		list2.add(8);
		list2.add(11);
		list2.add(14);
		list2.add(7);
		System.out.println(list2);
		for(int i:list2) {
			if(i%2==0) {
				//System.out.println(i);
					list3.add(i);
			}
		}
		Collections.rotate(list3,k2);
		System.out.println(list3);
		int index=0;
		for(int i=0;i<list2.size();i++) {
			if(list2.get(i)%2==0) {
				list2.set(i,list3.get(index++));
			}
		}
		System.out.println(list2);
		}
}