package com.orilore.dk.test;
import java.util.*;
public class Main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList list =new ArrayList();
ArrayList list1 =new ArrayList();
list.add("hello");
list1.add("d");
list1.add("k");
list.addAll(list1);
System.out.println(list);  //----��list1����list����
boolean flag=list.removeAll(list1);//-----�ж��Ƿ��list��ɾ��list1�����ز�������
System.out.println(list);
System.out.println(list1);
System.out.println(flag);
	}

}
