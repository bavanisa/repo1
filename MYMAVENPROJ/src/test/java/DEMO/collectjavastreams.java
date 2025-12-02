package DEMO;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class collectjavastreams {
	@Test
	public void streamcollect() {
		//taking the list and coverting back to new list 
	List<String> Ls=Stream.of("Alekhya","Abhinav","Adam","Rama","Don").filter(s->s.endsWith("a"))
	.map(s->s.toUpperCase()).collect(Collectors.toList());
	//printing the first letter which is ending with a to uppercase 
      System.out.println(Ls.get(0));
	}

}

