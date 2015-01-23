#Proxy
	
	Provide a surrogate or placeholder for another object to control access to it.

##Types:

- **Remote Proxy**

	RMI

- **Virtual Proxy** 

- **Protection Proxy**  	
	
##Principles:

##Related Patterns:

	
##Examples:

- RMI

	1 rmic to generate Stub
	2 Sever side: run "rmiregistry"
	3 run Server Applicaton to register rmi remote object
	4 Client side: run Client Program

- Dynamic Proxy

	InvocationHandler handler = new MyInvocationHandler(...);
	Foo f = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(),
                                          new Class[] { Foo.class },
                                          handler);



