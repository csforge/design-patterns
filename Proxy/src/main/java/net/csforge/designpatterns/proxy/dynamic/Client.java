package net.csforge.designpatterns.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		new Client().handle();
	}
	
	void handle(){
		PersonInterface person = new Person();

		PersonInterface proxy = (PersonInterface)Proxy.newProxyInstance(
				PersonInterface.class.getClassLoader(), new Class[]{PersonInterface.class},
				new NonOwnerInvocationHandler(person));
		proxy.setRating(10);
		proxy.setRating(16);
		System.out.println("......non-owner.rating="+proxy.getRating());
		try {
			proxy.setInterest("travel!");
		} catch (Exception e) {
			System.out.println("......non owner cannot modify interest.");
		}
		System.out.println("......non-owner.interest="+proxy.getInterest());
		
		proxy = getProxy(new OwnerInvocationHandler(person), person);
		try {
			proxy.setRating(10);
		} catch (Exception e) {
			System.out.println("......owner cannot rate by himself.");
		}
		System.out.println("......owner.rating="+proxy.getRating());
		proxy.setInterest("bike!");
		System.out.println("......owner.interest="+proxy.getInterest());
	}
	
	PersonInterface getProxy(InvocationHandler handler, PersonInterface person) {
		return (PersonInterface) Proxy.newProxyInstance(
				person.getClass().getClassLoader(), 
				person.getClass().getInterfaces(), 
				handler);
	}

}
