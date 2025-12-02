package DEMO;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class javastreams {
	@Test
	public void regular()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("abhijeet");
		names.add("don");
		names.add("alekhya");
		names.add("adam");
		names.add("ram");
		int count=0;
		for(int i=0;i<names.size();i++) {
			String st= names.get(i);
			if(st.startsWith("a")) {
				count++;
			}
		}
		System.out.println("count of names starting with letter a is :"+count);
	}

	
	}

