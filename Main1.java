package com.orilore.dk.test;
import java.util.*;
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List list = new ArrayList();
list.add(1);   //-------向集合list赋值1
System.out.println(list.toString());
ArrayList list1= new ArrayList();
list.add(10);  //-------向集合list1赋值10
list1.addAll(list);  //------把集合list的值加到list1中
System.out.println(list1.toString());

	}

}
