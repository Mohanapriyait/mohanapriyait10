import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStreamapi {
	public static void main(String args[]) {
		
		List<String> s=Arrays.asList("Apple","Anu","Ball","Pen");

		List<String> s1=s.stream().filter(a->startsWith("A")).toUpperCase.collect.(Collectors.toList);
	}

}
 