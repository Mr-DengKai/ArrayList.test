package com.orilore.dk.test;
import java.util.*;
public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList list1 = new ArrayList();
ArrayList list2 = new ArrayList();
list1.add(10);
list1.add(11);
list2.add(12);
list2.add(13);
list1.addAll(2,list2);    //------不说明把list2加在第几个后面，斯通默认加在list后面
for(Object o:list1){
	System.out.println(o);
}
	}

}
