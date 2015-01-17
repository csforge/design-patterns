package net.csforge.designpatterns.composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator<E> implements Iterator<E> {
	Stack<MenuComponent> stack = new Stack<MenuComponent>();
	
	public CompositeIterator(MenuComponent elements){
		stack.push(elements);
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
