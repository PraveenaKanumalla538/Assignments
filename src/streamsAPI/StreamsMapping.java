package streamsAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsMapping {
	//1,3,4,5,7,8,12,7 -> Create List of Squares
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= List.of(1,3,4,5,7,8,12,7);
		List<Integer> squarelist = list.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println(squarelist);
	}
  
}
