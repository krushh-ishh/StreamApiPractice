package StreamFilter;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenList {

	public static void main(String[] args) {
		
		List<Integer>list1 = List.of(12,23,34,45,56,67,78,89);
		
		//normal approach
		List<Integer> evenList = new ArrayList<Integer>(); 
		for(Integer i: list1) {
			
			if((i & 1)==0)
				evenList.add(i);
		}
		System.out.println(evenList);
		
		
		//stream filter (iterator & condition)
		//Stream<Integer> stream = list1.stream();
		List<Integer> evenList2 = list1.stream().filter(i-> i == 34).collect(Collectors.toList());
		System.out.println(evenList2);
	}

}
