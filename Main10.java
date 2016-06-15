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
System.out.println(list);  //----把list1加在list后面
boolean flag=list.removeAll(list1);//-----判断是否从list中删除list1，返回布尔类型
System.out.println(list);
System.out.println(list1);
System.out.println(flag);
	}

}
