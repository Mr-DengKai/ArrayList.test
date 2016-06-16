package com.orilore.dk.test1;
import java.util.*;
public class Main17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> set = new TreeSet<String>();
set.add("c");
set.add("b");
set.add("a");
System.out.println(set);  //----TreeSet°´ÕÕ×ÖµäË³ĞòÊä³ö
Iterator<String> m =set.iterator(); 
while(m.hasNext()){
String n = m.next();
System.out.println(n);
	}
	}
}
