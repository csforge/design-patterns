package net.csforge.designpatterns.singleton;

public class Client {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println("ServiceLocator.instance: "
							+ ServiceLocator.getInstance());
				}
			}).start();
		}
	}

}
