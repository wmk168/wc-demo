package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.TreeMap;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class CommonTest implements RandomAccess{
	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		Vector<Integer> vector=new Vector<Integer>();
		//vector.add(e);
		HashMap<String, Object> map;
		ConcurrentHashMap<String, String> cmap=new ConcurrentHashMap<String, String>();
		cmap.put("1", "1");
		
		ReentrantLock reentrantLock=new ReentrantLock(true);
		//Executors.newFixedThreadPool(nThreads)
		TreeMap<String, Object> treeMap=new TreeMap<String, Object>();
		System.out.println(4|5);
	}
	
	
}
