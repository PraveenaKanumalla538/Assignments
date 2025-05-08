package streamsAPI;

import java.util.ArrayList;
import java.util.List;

public class NoramalDistrinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//(1, 9, 3,1,4,9,13,16,13,25, 49, 64, 144, 49)-->remove duplicates
		List<Integer> list = List.of(1, 9, 3,1,4,9,13,16,13,25, 49, 64, 144, 49);
		List<Integer> distrinctlist = new ArrayList<Integer>();
		for(int num : list) {
		if(!distrinctlist.contains(num)) {
			distrinctlist.add(num);	
		}
	
	}
		System.out.println(distrinctlist);
	}
}
