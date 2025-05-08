package streamsAPI;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = List.of(1,3,13,37,9,46,58,91,94);
		List<Integer> distrinctorderedList = list.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(distrinctorderedList);
		
		List<Integer> distrinctReverseorderedList = list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(distrinctReverseorderedList);
		
	}

}	
