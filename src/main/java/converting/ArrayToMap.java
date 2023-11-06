package converting;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayToMap {

	public static void main(String[] args) {
		
		String []r= {"kailas","avinash"};
		
		 Map<String, String> map = Arrays.stream(r)
		.collect(Collectors.toMap(String::new, String::toLowerCase));
		
		System.out.println(map);

		int [] array ={12,45,78,99};
		String replace = Arrays.asList(array).toString()
				.substring(1
				).replaceFirst("]", "").replace(", ", "");

		System.out.print(replace.toString());


	}
}
