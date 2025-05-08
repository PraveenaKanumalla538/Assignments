package streamsAPI;
import java.util.ArrayList;
import java.util.List;
public class NormalFilter {
//1,3,13,37,9,46,58,91,94-se[erate even numbers
	public static void main(String[] args) {
	List<Integer> list = List.of(1,3,13,37,9,46,58,91,94);
	List<Integer> evenNumList = new ArrayList<Integer>();
	for (int num : list) {
		if (num%2==0) {
			evenNumList.add(num);
		}
	}
	
System.out.println(evenNumList);

	}
	
}
