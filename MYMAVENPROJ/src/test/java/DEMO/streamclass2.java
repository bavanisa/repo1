package DEMO;

import java.util.ArrayList;
import java.util.stream.Stream;
import org.testng.annotations.Test;

public class streamclass2 {
	@Test
	public void streamclassw()
	
	{             
		ArrayList<String> names = new ArrayList<String>();
		names.add("abhijeet");
		names.add("don");
		names.add("alekhya");
		names.add("adam");
		names.add("ram");
		
		Long c = names.stream().filter(s->s.startsWith("a")).count();
		System.out.println(c);
		
		//lambda expression is this 
		Long d =Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
		//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}

}
