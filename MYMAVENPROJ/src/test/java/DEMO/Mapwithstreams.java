package DEMO;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Mapwithstreams {
@Test
	public void maptest() {
	//PRINT The names which have length greater than 4 char in uppercase (which have last leter as a)
	//Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
	//.forEach(s->System.out.println(s));
	//covert into uppercase in above map uppercase 
	
	List<String>names= Arrays.asList("Azhijeet","Don","Alekhya","Adam","Rama");
	names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}
}
