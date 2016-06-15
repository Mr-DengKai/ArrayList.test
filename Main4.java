package com.orilore.dk.test;

import java.util.*;

class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		// list.add(10);
		// list.add(20);
		list.add(12.3f);
		for (int i = 0; i < list.size(); i++) {
			float m = (float) list.get(i);

			System.out.println(m);
		}
	}

}
