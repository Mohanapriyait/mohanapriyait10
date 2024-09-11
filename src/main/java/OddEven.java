import java.util.*;
import java.util.stream.Collectors;

public class OddEven {

	public static void main(String[] args) {
		
		List<Integer> listofInteger=Arrays.asList(10,20,21,30,36,39,40,50);
		List l=listofInteger.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l);
		

	}

}
