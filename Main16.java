package com.orilore.dk.test1;
import java.util.*;
public class Main16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> set = new HashSet<String>();
String str = "hello java world";
set.add(str);
set.add(str);  //---------添加失败，哈希集合元素不能重复。
set.add("hello dengkai");
//set.remove(0);         ---错误！hashset不提供下标，无法删除。
set.remove(str);  //--------正确删除方法。
System.out.println(set);
	}

}
