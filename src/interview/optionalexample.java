package interview;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class optionalexample {
	
	public static void main(String[] args) throws nonamepresent {
		
		HashMap<Integer, emplyee > hm = new HashMap<>();
		hm.put(100, new emplyee(100, "gaurav"));
		hm.put(102,new emplyee(102, "Attal"));
		hm.put(103, new emplyee(103));
		
	 Optional<String> name = Optional.ofNullable(hm.get(103).getName());
		
	 name.orElseThrow( ()-> new nonamepresent("name is null"));
		
	}

}
