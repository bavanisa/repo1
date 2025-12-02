package DEMO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class mergertwoarraysstreams {
	
	@Test
	public void mergearraytest() {
		ArrayList<String> names= new ArrayList<String>();
		names.add("Don");
		names.add("man");
		names.add("women");
		
		List<String>names1= Arrays.asList("Azhijeet","Don","Alekhya","Adam","Rama");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		Stream<String> newstream=Stream.concat(names.stream(),names1.stream());
		boolean flag = newstream.anyMatch(s->s.equalsIgnoreCase("A1dam"));//if it matches with Adam it will print true if give any unknow data it should be false
		System.out.println(flag);
		Assert.assertTrue(flag);
	}

}
