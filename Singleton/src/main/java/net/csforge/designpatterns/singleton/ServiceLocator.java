package net.csforge.designpatterns.singleton;

public class ServiceLocator {
	
	private static volatile ServiceLocator _uniqueInstance;
	
	private ServiceLocator(){
		
	}
	
	/**
	 * double-checked locking
	 * @return
	 */
	public static ServiceLocator getInstance() {
		if (_uniqueInstance == null) {
			synchronized (ServiceLocator.class) {
				if (_uniqueInstance == null)
					_uniqueInstance = new ServiceLocator();
			}
		}
		return _uniqueInstance;
	}

}
