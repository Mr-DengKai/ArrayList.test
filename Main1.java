package com.orilore.dk.test;
import java.util.*;
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List list = new ArrayList();
list.add(1);   //-------�򼯺�list��ֵ1
System.out.println(list.toString());
ArrayList list1= new ArrayList();
list.add(10);  //-------�򼯺�list1��ֵ10
list1.addAll(list);  //------�Ѽ���list��ֵ�ӵ�list1��
System.out.println(list1.toString());

	}

}
