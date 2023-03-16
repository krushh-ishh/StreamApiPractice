package StreamFilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class StreamListManipulation {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(2,3,4,2,1,3,4,5,7);

		//double the List22
		Stream<Integer> dataStream = asList.stream().map(n->n*2);

		//		Cannot print stream directly
		//		System.out.println(dataStream); 
		dataStream.forEach(i-> System.out.println(i));

		
		
		// Sort List
		Stream<Integer> sorted = asList.stream().sorted(); 
		sorted.forEach(i-> System.out.println(i));
	}
}
