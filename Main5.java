package com.orilore.dk.test;
import java.util.*;
public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList list = new ArrayList();
list.add(10);
list.add(11);
list.add("kk");
for(Object o:list){ //------------快速遍历集合中的元素
	//Integer m = (Integer)o;
	System.out.println(o);
}
	}

}
