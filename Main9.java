package com.orilore.dk.test;
import java.util.*;
public class Main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList list =new ArrayList();
list.add("hello");
list.add(new String("java world"));
Object m = list.remove(0);
//Object a = list.remove(new String("java world"));
for(Object o:list){
System.out.println(list);
System.out.println(list.size());
	}
	}
}
