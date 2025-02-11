package com.degignpattern.iterator;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator{

	MenuItem[] items ;
	int position=0;
	public DinnerMenuIterator(MenuItem[] items) {
		this.items = items;
	}
	@Override
	public boolean hasNext() {
		if(position>=items.length || items[position]==null)
			return false;
		
		return true;
	}

	@Override
	public Object next() {
		MenuItem item =items[position]; 
		if(item!=null)
		{
			position++;
		}
		return item;
	}

}
