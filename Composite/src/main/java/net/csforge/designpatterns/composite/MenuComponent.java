package net.csforge.designpatterns.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract public class MenuComponent {
	private String id;
	private String name;
	private String description;
	private String url;
	private List<MenuComponent> children;
	
	abstract public Iterator<MenuComponent> createIterator();
	
	public void add(MenuComponent component){
		if(children==null)
			children = new ArrayList<MenuComponent>();
		children.add(component);
	}
	
	public void remove(MenuComponent component){
		if(children!=null)
			children.remove(component);
	}
	
	public MenuComponent getChild(int index){
		if(children!=null)
			return children.get(index);
		return null;
	}
	
}
