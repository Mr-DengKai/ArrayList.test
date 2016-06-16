package com.orilore.dk.test1;
import java.util.*;
public class Main15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("hello");
		set.add("java");
		set.add("world");

for(String m:set){
	System.out.println(m);
	
	
}
System.out.println(set.size());
Iterator<String> a = set.iterator();
while(a.hasNext()){
	String b = a.next();
	System.out.println(b);
	
}



	}

}
