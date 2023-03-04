package interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class findsecondlargest {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,3,5,6,7,8,8,0,11);
		Integer integer = list.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
		
		
	}
	
}
