package com.orilore.dk.test;
import java.util.*;
public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList list = new ArrayList();
list.add(10);
list.add(11);
list.add(2,12);     //-------在第二个元素后面插入12
for(Object o:list){
	System.out.println(o);
}
	}

}
