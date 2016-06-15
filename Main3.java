package com.orilore.dk.test;

import java.util.*;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(true);
		list.add("hello java world");
		System.out.println(list.toString());
		for (int i = 0; i < list.size(); i++) {
			Object o = list.get(i);
			if (o instanceof String) { // ------instanceof用来判断一个对象的类型，返回布尔值
				String o1 = (String) o;
				System.out.println(o1.toUpperCase());
			}
			if (o instanceof Integer) {
				Integer o2 = (Integer) o;
				System.out.println(o2.MAX_VALUE);// ----------double类型的最大值
				System.out.println(Long.MAX_VALUE);
				System.out.println(Double.MAX_VALUE);
				System.out.println(Byte.MAX_VALUE);
				System.out.println(Short.MAX_VALUE);
				System.out.println(Float.MAX_VALUE);
				// 比如整型，4个字节32位，去掉最高位符号位31位，最大是11111....11，共计31个二进制1，也就是2^31-1=2147483648-1

				// Long/Byte/Short类似
			}
		}
	}

}
