package _10_컬렉션프레임워크;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _06_반복자_iterator {

	public static void main(String[] args) {
		
		int[] list1 = {1,2,3,4,5,6};
		
		int[] list2 = list1.clone();
		
		System.out.println(Arrays.toString(list1));
		System.out.println(Arrays.toString(list2));
		
		System.out.println("- - - - - - - - - - - - ");
		
		list2[2] = 100;
		System.out.println(Arrays.toString(list1));
		System.out.println(Arrays.toString(list2));
		
		System.out.println("- - - - - - - - - - - - ");
		
		Set<Integer> list3 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		System.out.println(list3);
		list3.remove(3);
		System.out.println(list3);
		
		System.out.println("- - - - - - - - - - - - ");
		
		Iterator<Integer> itor = list3.iterator();
		itor.next();
		System.out.println(itor.next());
		System.out.println(itor.next());
		
		System.out.println("- - - - - - - - - - - - ");
		
		while(itor.hasNext()) {
			if(itor.next() == 3) {
				itor.remove();  //set에 실제 있는 데이터가 삭제된다 
			}
		}
		
		System.out.println(list3);

	}

}
