package streamsAPI;

import java.util.ArrayList;
import java.util.List;

public class NormalMapping {
//1,3,4,5,7,8,12,7 -> Create List of Squares
	public static void main(String[] args) {
//wrapper class
		List<Integer> list= List.of(1,3,4,5,7,8,12,7);
		List<Integer> squarelist = new ArrayList<Integer>();
		for (int num : list){
		squarelist.add(num*num);
		}
		System.out.println(squarelist);
	}
	
}
