package DEMO;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Assignementjavastream {
	@Test
	public void assignmentprintuniquenum()
	{
		List<Integer> ls= Arrays.asList(3,4,1,2,4,6,6,5,4,6);
		//ls.stream().distinct().forEach(s->System.out.println(s));
		List<Integer>li=ls.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		
	}

}
