package streamsAPI;

import java.util.List;
import java.util.stream.Collectors;

public class StreamDistrinct {

	public static void main(String[] args) {
		
//(1, 9, 3,1,4,9,13,16,13,25, 49, 64, 144, 49)-->remove duplicates
		List<Integer> list = List.of(1, 9, 3,1,4,9,13,16,13,25, 49, 64, 144, 49);
		List<Integer> distrinctlist = list.stream().distinct().collect(Collectors.toList());
	System.out.println(distrinctlist);
	}

}
