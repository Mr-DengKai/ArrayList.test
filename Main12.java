package com.orilore.dk.test1;
import java.util.*;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> list = new LinkedList<String>();
list.add("str");
list.add("str");
list.add("hello");
list.add("str");
list.add("java world");
list.add("str");
//list.remove("str");     
System.out.println(list);
System.out.println(list.size());
for(int i= 0;i<list.size();i++){
if(list.get(i)=="str"){
list.remove(list.get(i));
	
	//System.out.println(list.toString());
}
}

System.out.println(list);
	}

}
