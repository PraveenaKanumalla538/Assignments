package streamsAPI;
import java.util.List;
import java.util.stream.Collectors;
public class StreamsFilter {
	//1,3,13,37,9,46,58,91,94-se[erate even numbers
	public static void main(String[] args) {
		List<Integer> list = List.of(1,3,13,37,9,46,58,91,94);
		List<Integer> evenNumList = list.stream().filter(x -> x%2==0).collect(Collectors.toList());
		System.out.println(evenNumList);
	}

}
