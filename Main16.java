package com.orilore.dk.test1;
import java.util.*;
public class Main16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> set = new HashSet<String>();
String str = "hello java world";
set.add(str);
set.add(str);  //---------���ʧ�ܣ���ϣ����Ԫ�ز����ظ���
set.add("hello dengkai");
//set.remove(0);         ---����hashset���ṩ�±꣬�޷�ɾ����
set.remove(str);  //--------��ȷɾ��������
System.out.println(set);
	}

}
