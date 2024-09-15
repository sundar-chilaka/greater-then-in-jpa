package terst;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class removeDuplicateEliments {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,4,2,5,6,7,3,8);
		Set<Integer> unicValue = new HashSet<>();
		for(Integer i:list) {
			if(!unicValue.add(i)) {
				System.out.println(i);
			}
		}
	}
}
