package com.ibm.email;

import java.util.ArrayList;
import java.util.List;

public class Test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> mylist = new ArrayList<Integer>();
		int tempKey =0;
		//mylist.add(tempKey);
		for(int i=0;i<10;i++){
			if(!mylist.contains(tempKey)){
				mylist.add(i);
			}
			
		}
		System.out.println(mylist.size());
	}

}
