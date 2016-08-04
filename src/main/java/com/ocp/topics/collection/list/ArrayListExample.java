package com.ocp.topics.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Collection represents a single unit of objects i.e. a group.
 *	1. Interfaces and its implementations i.e. classes
 *	2. Algorithm
 *
 * Java ArrayList class uses a dynamic array for storing the elements.
 * It extends AbstractList class and implements List interface.
 * Java ArrayList class can contain duplicate elements.
 * Java ArrayList class maintains insertion order.
 * Java ArrayList class is non synchronized.
 * Java ArrayList allows random access because array works at the index basis.
 * 
 * In Java ArrayList class, manipulation is slow because a lot of shifting needs
 * to be occurred if any element is removed from the array list.
 */
public class ArrayListExample {

	private ArrayList<Integer> arrayListExample = new ArrayList<Integer>();

	public ArrayListExample () {
		arrayListExample.add(1);
		arrayListExample.add(2);
		arrayListExample.add(3);
		
		System.out.println("Size : " +arrayListExample.size());
		System.out.println("Empty : " +arrayListExample.isEmpty());
		System.out.println("Hash Code : " +arrayListExample.hashCode());
		
		for (int integer : arrayListExample) {
			System.out.println(integer);
		}
		
		Iterator<Integer> iterator = arrayListExample.iterator();  
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		ListIterator<Integer> itr=arrayListExample.listIterator();  
		System.out.println(itr.hasPrevious());
		while(itr.hasPrevious()){  
			System.out.println(itr.previous());  
		}  
	}
	
	public static void main(String args[]) {
		new ArrayListExample();
	}
}
